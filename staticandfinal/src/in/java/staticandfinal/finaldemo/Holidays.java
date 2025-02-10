package in.java.staticandfinal.finaldemo;
//immutability
public final class Holidays {
	final String festivalName;   //final variables should write in capital letter and give underscore between words
	final int noOfLeaves;  //NO_OF_LEAVES
	public Holidays(String festivalName, int noOfLeaves) {   //late or lazy initialization
		this.festivalName=festivalName;
		this.noOfLeaves=noOfLeaves;
	}
	public final String getFestivalName() {
		return festivalName;
	}
	public int getNoOfLeaves(final float pi) {
		final int variable=10;
		return noOfLeaves;
	}
	@Override  //gives compile time error
	public final String toString() {
		return "Festival:" +festivalName+", No of leaves:"+noOfLeaves;
	}

}
