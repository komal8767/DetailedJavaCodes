package in.java.javasymboisis.reversestring;

public class ReverseLine {
	String variable;
	public ReverseLine() {}
	public ReverseLine(String variable) {
		this.variable=variable;
	}
	public void setVariable(String variable) {
		this.variable=variable;
	}
	public String getVariable() {
		return variable;
	}
	
	public String reverseStringLine() {
	    String[] stringArray=variable.split(" ");
	    int left=0;
	    int right=stringArray.length-1;
	    while(left<right) {
			String temp=stringArray[left];
			stringArray[left]=stringArray[right];
			stringArray[right]=temp;
			left++;
			right--;	
		}
//	    String result=String.join(" ", stringArray);
//		return result;
	    return String.join(" ", stringArray);
	}

}
