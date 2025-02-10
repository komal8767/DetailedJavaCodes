package in.strings.demo;
//buffer-> gives advanced 16 bit array
//used for  modification because we cannot modify string(immutable)
//not creates new object for modification
//used for single threaded application
//mutable-modifictaion done on same object
//non synchronized
//for modification=faster
//accessing-slow
//buffer capacity-16
public class StringBuilderClass {
	
	public static void main(String[] args) {
		//StringBuilder stringbuild=new StringBuilder();
		StringBuilder stringbuild=new StringBuilder("Komal");
		System.out.println(stringbuild.capacity());
		
		StringBuilder str=new StringBuilder();
		str.append("ABCDEFGHIJKLMNOPQ");
		System.out.println(str);
		System.out.println(str.capacity());
		System.out.println(str.length());
		
		
	     str.delete(1,3);
	     System.out.println(str);
	     
	     str.deleteCharAt(10);
	     System.out.println(str);
	     
	     str.setCharAt(2, (char)97);
		System.out.println(str);
		
	     str.replace(0, 3, "kom");
	     System.out.println(str);
	     
	     str.reverse();
	     System.out.println(str);
	     
	     char p=str.charAt(0);
	     System.out.println(p);
	     
	     int result=str.compareTo(new StringBuilder("ZBCDEFGHIJK"));
	     System.out.println(result);
	     
	     str.delete(4,15);
	     System.out.println(str);
	     //boolean equalResult=str.equals(new StringBuilder("QPON"));
	     //System.out.println(str.equals(new StringBuilder("QPON")));
	     
	     String stringResult=str.toString();
	     System.out.println(stringResult);
	     
	     //stringbuffer is slower due to synchronized
	}

}
