package framework.flows;

import framework.connections.AbstractConnection;

public abstract class BroadcastInformationFlow extends InformationFlow {

	public BroadcastInformationFlow(String name, AbstractConnection c) {
		super(name, c);
		// TODO Auto-generated constructor stub
	}

	public void setInputData(String key, String value) {
		throw new RuntimeException(
				"Cannot set input parameters to broadcasting information flows");
	}
}
