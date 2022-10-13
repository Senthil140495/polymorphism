package org.add;

public class GreenTech {
	
	//By Type
	private void greensomr(String location ) {
			System.out.println("Greens location is "+location);
}			
	private void greensomr(boolean check ) {
			System.out.println("Is there greens "+check);
			
}
	//By order
	private void greensomr(String location, boolean check) {
			System.out.println("Greens location is "+location+'\n'+"Is there greens "+check);
	}
	private void greensomr(boolean check, String location) {
				System.out.println(check+"\n"+location);		
	}
	
	//By number of arguments 
	private void greensomr(String location, boolean check , int branch) {
		System.out.println("Greens location is "+location+'\n'+"Is there greens "+check+'\n'+"Number of branches "+branch);
}
	
public static void main(String[] args) {
	GreenTech gt=new GreenTech();
	gt.greensomr("OMR");
	gt.greensomr(true);
	gt.greensomr("OMR", true);
	gt.greensomr(true,"OMR");
	gt.greensomr("OMR", true , 14);
}


}
