package mn223dn_assign2;

public class BirthdayCandles {
	public static void main(String [] args) {
		int osum= -24 ;
		int sum= 0;
		int remain = 0;
		for(int i=1; i<=100; i++){		
		
		sum=sum+i;		
		remain = ((24*(sum/24+1))-sum);
					if (sum/24 > osum/24){
				System.out.println("Before birthday "+i+" buy "+((sum/24+1)-(osum/24+1))+" box(es).");
				
			}
		
		osum=sum;		
			
			
			
		
		}
		System.out.print("Total number of boxes: "+sum/24+", Remaining candles: "+remain);
	}
}
