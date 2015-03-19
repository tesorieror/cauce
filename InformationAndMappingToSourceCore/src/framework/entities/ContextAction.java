package framework.entities;

public class ContextAction {

	private String memory;
	
	private String expression;
	
	public ContextAction(String memory, String expression) {
		this.memory=memory;
		this.expression=expression;
	}

	public String getMemory() {
		return memory;
	}

	public String getExpression() {
		return expression;
	}

}
