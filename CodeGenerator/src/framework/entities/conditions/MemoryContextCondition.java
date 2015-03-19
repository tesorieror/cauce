package framework.entities.conditions;

import framework.entities.AbstractSituation;
import framework.entities.memories.ContextMemory;
import framework.flows.InformationFlow;

public class MemoryContextCondition extends AbstractCondition {

	private AbstractSituation situation;

	private String memory;

	private String expression;

	public MemoryContextCondition(AbstractSituation s, String memory,
			String expression) {
		this.situation = s;
		this.memory = memory;
		this.expression = expression;
	}

	protected ContextMemory getMemory(){
		return situation.getMemory(memory);
	}
	
	
	@Override
	public boolean satisfies(InformationFlow flow) {
		return getMemory().match(expression);
	}

}
