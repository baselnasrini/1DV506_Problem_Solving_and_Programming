package mn223dn_assign2;
import java.util.*;
public class FrequencyTable {

	public static void main(String[] args){
		Random rand = new Random();
		int [] list = new int[6];

		for (int i=0; i<6000; i++){	
			
			int c = 1+rand.nextInt(6);
		
				if (c == 1)
					list[0]++;
			
				else if (c==2){
					list[1]++;
					}
			
				else if (c==3){
					list[2]++;
					}
			
				else if (c==4){
					list[3]++;
					}
			
				else if (c==5){
					list[4]++;
					}
			
				else if (c==6){
					list[5]++;
					}
		}
		
		System.out.println("Frequencies when rolling a dice 6000 times.");
		
		for (int i=0; i<list.length; i++) {
			
			 System.out.println(i+1 +": "+ list[i]);		
		}		
		
	}
}
