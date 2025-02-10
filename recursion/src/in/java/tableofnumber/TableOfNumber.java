package in.java.tableofnumber;

public class TableOfNumber {
	public void printTable(int no, int limit) {
		if(limit>1)
			printTable(no,limit-1);
		System.out.println(no+"*"+limit+"="+no*limit);
	}

}
