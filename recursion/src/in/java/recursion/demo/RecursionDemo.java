package in.java.recursion.demo;

public class RecursionDemo {
	
	private int variable;

	public void setVariable(int variable) {
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "RecursionDemo [variable=" + variable + "]";
	}

	public RecursionDemo(int variable) {
		this.variable = variable;
	}

	public RecursionDemo() {
		
	}

	public int getVariable() {
		return variable;
	}
	
	public void printVariable(int no) {
		if(--no>0)
			printVariable(no);
		System.out.println(no);
		
	}
	
	

}
