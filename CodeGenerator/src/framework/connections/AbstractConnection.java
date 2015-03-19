package framework.connections;

import framework.devices.AbstractDevice;
import framework.flows.InformationFlow;

public class AbstractConnection {

	private AbstractDevice source;
	
	private AbstractDevice target;
	
	protected void addFlow(InformationFlow iFlow) {
		// TODO Auto-generated method stub
		
	}

	public void setSource(AbstractDevice device){
		source = device;
	}
	
	public void setTarget(AbstractDevice device){
		target = device;
	}

	public InformationFlow getOutputInformationFlow(String name) {
		// TODO implement
		return null;
	}
	
	public AbstractDevice getTarget(){
		// TODO implement		
		return null;
	}
	
	public void incomingFlow(InformationFlow f){
		getTarget().incoming(f);
	}
	
}
