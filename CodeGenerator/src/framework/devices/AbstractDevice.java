package framework.devices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import framework.connections.AbstractConnection;
import framework.entities.AbstractEntity;
import framework.flows.InformationFlow;

public abstract class AbstractDevice {

	private List entities; 
	
	public AbstractDevice() {
		super();
		entities= new ArrayList();
	}

	protected void addEntity(AbstractEntity entity) {
		entity.setDevice(this);
		entities.add(entity);
	}

	public InformationFlow getOutputInformationFlow(String name) {		
		return getConnectionForInformationFlowName(name).getOutputInformationFlow(name);
	}

	public void addConnection(AbstractConnection c) {
		// TODO implement
	}

	public AbstractConnection getConnectionForInformationFlowName(String name) {
		// TODO implement
		return null;
	}

	public void ongoing(InformationFlow f) {
		f.flow();
	}

	public void incoming(InformationFlow f) {
		Iterator it = entities.iterator();
		while(it.hasNext())
			((AbstractEntity)it.next()).incoming(f);
	}

}