package framework.entities.conditions;

import framework.flows.InformationFlow;

public abstract class AbstractCondition {

	
	public abstract boolean satisfies(InformationFlow flow);
}
