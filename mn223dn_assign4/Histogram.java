package mn223dn_assign4;

import java.util.*;
import java.io.*;

public class Histogram {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		try {
			File input = new File("C:\\temp\\numbers.txt");
			Scanner sc = new Scanner(input);
			while (sc.hasNextLine()) {
				arr.add(sc.nextInt());
			}
			sc.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(integersRange(1,100,arr));
		
		
		System.out.println(histogram(1,100,10,arr));


	}
	
	
	
	public static String integersRange(int from , int to, ArrayList<Integer> arr){
		
		int in =0;
		int out = 0;
		
		for (int i=0; i<arr.size(); i++){
			
			if (arr.get(i) >= from && arr.get(i) <= to)
				in ++;
			else{
				out ++;
			}
		}
		String back = "Number of integers in the interval ["+from+","+to+"]:"+in+"\nOthers: "+out;
		return back;
	}

	public static String histogram(int from, int to, int range, ArrayList<Integer> arr){
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for (int j=0; j<arr.size(); j++){
			if (arr.get(j)>=from && arr.get(j)<=to)
				newArr.add(arr.get(j));
		}
		
		int i = 0;
		int b = from;
		int [] histo = new int[to/range];
	
		while ( i != to/range){
			int count = 0;
				for (int j=0; j<newArr.size(); j++){
					if ( newArr.get(j)>=b && newArr.get(j)<=b+(range-1)){
						count++;
						histo[i] = count;
					}
				
				}
				
			sb.append(b+" - "+(b+(range-1)) +" | ");
			
			int s = 0;
			while ( s != histo[i]){
				sb.append("*");
				s++;
			}
			sb.append("\n");
			i++;
			b+=range;
		}
		
					
	for (int s : histo)
		System.out.print( s + " ");
	System.out.print("\n ");

	
	return sb.toString();
	}
}
