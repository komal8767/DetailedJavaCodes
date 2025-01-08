package in.java.javasymboisis.vowelinstring;

public class VowelStringCount {
	String variable;
	public void setVar(String variable) {
		this.variable=variable;
	}
	public String getVar() {
		return variable;
	}
	
	public void countingVowel() {
		int ac=0;
		int ic=0;
		int ec=0;
		int oc=0;
		int uc=0;
		int consonant=0;
		for(int i=0;i<variable.length();i++) {
			switch(variable.toLowerCase().charAt(i))
			{
			case 'a'-> ac++;
			case 'e'-> ec++;
			case 'i'-> ic++;
			case 'o'-> oc++;
			case 'u'-> uc++;
			default ->consonant++;
			}
		}
		System.out.println("a:"+ac);
		System.out.println("e:"+ec);
		System.out.println("i:"+ic);
		System.out.println("o:"+oc);
		System.out.println("u:"+uc);
		System.out.println("consonant:"+consonant);
	}

}
