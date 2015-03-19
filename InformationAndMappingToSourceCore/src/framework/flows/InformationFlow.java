package framework.flows;

import framework.connections.AbstractConnection;

public abstract class InformationFlow {

	private String name;
	
	private AbstractConnection connection;
	
	public InformationFlow(String name, AbstractConnection c){
		this.name=name;
		this.connection=c;
	}
	
	public void setOutputData(String key, String value){
		// TODO implement
	}

	public void setInputData(String key, String value){
		// TODO implement
	}

	public String getName() {
		return name;
	}

	public AbstractConnection getConnection(){
		return connection;
	}
	
	
	public void flow(){
		// TODO implement		
	}
	
}
