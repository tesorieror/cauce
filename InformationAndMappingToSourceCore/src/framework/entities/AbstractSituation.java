package framework.entities;

import java.util.List;

import framework.entities.conditions.MemoryContextCondition;
import framework.entities.conditions.SensingCondition;
import framework.entities.memories.ContextMemory;
import framework.flows.InformationFlow;

public abstract class AbstractSituation {
	
	private List sensingConditions ;
	
	private List memoryConditions ;
	
	private List actions ;
	
	protected void addAction(ContextAction contextAction) {
		actions.add(contextAction);
	}
	
	
	protected void addMemoryCondition(
			MemoryContextCondition memoryContextCondition) {
		memoryConditions.add(memoryContextCondition);
		
	}
	
	protected void addSensingCondition(SensingCondition sensingCondition) {
		sensingConditions.add(sensingCondition);		
	}


	public boolean matches(InformationFlow f) {
		boolean sensingOk=false;
		for(int i =0; (i<sensingConditions.size() || sensingOk); i++)
			sensingOk = ((SensingCondition)sensingConditions.get(i)).satisfies(f);
		if(sensingOk){
			boolean memoryOk = true;
			for(int i =0; (i<memoryConditions.size()); i++)				
				memoryOk = memoryOk && ((MemoryContextCondition)memoryConditions.get(i)).satisfies(f);
			return memoryOk;
		}
		return false;
	}


	public ContextMemory getMemory(String memory) {
		// TODO Implement
		return null;
	}


	public void executeOn(InformationFlow f, Object core) {
		// TODO Implement
		
	}


	public void executeActions() {
		for(int i=0; i<actions.size(); i++){
			ContextAction action = ((ContextAction)actions.get(i));
			getMemory(action.getMemory()).update(action.getExpression());
		}
		
	}
}
