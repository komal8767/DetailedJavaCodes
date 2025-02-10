package in.java.javasymboisis.pattern.pyramid;

public class PyramidPattern {
	int rows;
	public void setNum(int rows) {
		this.rows=rows;
	}
	public void printPyramid(){
		int num=1;
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=rows-1;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++) {
				if(num%2!=0)
					System.out.print(num*num*num+"\t\t");
				else
					System.out.print(num*num+"\t\t");
				num++;
			}
			System.out.println("\t\t");
		}
		
	}

	

}
