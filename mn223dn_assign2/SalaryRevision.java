package mn223dn_assign2;
	import java.util.*;

public class SalaryRevision {
	
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);                   ////   XXXXXXXX
			ArrayList <Integer> list = new ArrayList <Integer> ();
			
			System.out.print("Provide the Salaries: ");
			
			while (!sc.hasNext("X")){
			int a = sc.nextInt();
				list.add(a);
				
			}
			
			Collections.sort(list);
			
			if (list.size()%2 != 0)
				System.out.println("Median: "+list.get(list.size()/2));
			
			else {
			 int mid = list.get(list.size()/2)+list.get(list.size()/2-1);
				System.out.println("Median: "+mid/2);
			}
							
			
			double sum = 0;
			for ( int n=0; n<list.size(); n++ ){
				sum=sum+list.get(n);
							
			}
			double average = sum/list.size();
			System.out.println("Average: "+Math.round(average));
			
			double gap = list.get(list.size()-1)-list.get(0);
			System.out.println("Gap: "+Math.round(gap));

		sc.close();	
		}
	}
