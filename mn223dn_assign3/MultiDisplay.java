package mn223dn_assign3;

public class MultiDisplay {
	private int displayCount = 0;
	private String displayMessage = "" ;
	
	public MultiDisplay(){
		
	}
	public MultiDisplay(String msg, int count){
		displayMessage = msg;
		displayCount = count;
	}
	
	public void setDisplayMessage(String msg){
		displayMessage = msg;
	}
	public void setDisplayCount(int count){
		displayCount = count;
	}
	public void display(){
		for (int i=0; i<displayCount; i++){
		System.out.println(displayMessage);}
	}
	public void display(String msg, int count){
		displayMessage = msg;
		displayCount = count;
		for (int i=0; i<displayCount; i++){
			System.out.println(displayMessage);}
	}
	public String getDisplayMessage(){
		return displayMessage;
	}
	
	public int getDisplayCount(){
		return displayCount;
	}
}
