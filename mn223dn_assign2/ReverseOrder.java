package mn223dn_assign2;
import java.util.*;
public class ReverseOrder {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
	System.out.println("Enter positive integers. End by giving a negative integer.");			
	System.out.print("Integer 1: ");
	int a1 = sc.nextInt();
	int i = 1;
	
		while (a1 >= 0){
			i++;
			System.out.print("Integer "+(i)+": ");
			int a2 = sc.nextInt();
			
				if 	(a2 >=0){
					list.add(a2);
				}
				else if (a2 < 0) {
					
					list.add(0, a1);
					int size= list.size();
					System.out.println("Number of positive integers: "+size);
					
					System.out.print("In reverse order: ");
			
					for(int r=list.size()-1; r>=0; r--){
						int reverse = list.get(r);
						System.out.print(reverse+" ");	
					}
					break;
				}
				
		}	
		if (a1<0){
			System.out.print("Number of positive integers: 0 \n You should entre positive integers, restart the program again!");
		}
	
		sc.close();

	}
}