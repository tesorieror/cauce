package framework.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import framework.devices.AbstractDevice;
import framework.flows.InformationFlow;

public abstract class AbstractEntity {

	
	private Object core;
	
	private AbstractDevice device;

	private List situations;

	public AbstractEntity() {
		super();
		situations = new ArrayList();
	}

	protected void addSituation(AbstractSituation situation) {
		situations.add(situation);
	}

	public InformationFlow getOutputInformationFlow(String name) {
		return getDevice().getOutputInformationFlow(name);
	}

	public void ongoingInformationFlow(InformationFlow f) {
		getDevice().ongoing(f);
	}

	public AbstractDevice getDevice() {
		return device;
	}

	public void setDevice(AbstractDevice device) {
		this.device = device;
	}
	
	public Object getCore() {
		return core;
	}

	public void setCore(Object core) {
		this.core = core;
	}

	public void incoming(InformationFlow f) {
		Iterator it = situations.iterator();
		while(it.hasNext()){
			AbstractSituation s = (AbstractSituation) it.next(); 
			if (s.matches(f)){
				s.executeOn(f, getCore());
				s.executeActions();
			}
		}
	}

}
