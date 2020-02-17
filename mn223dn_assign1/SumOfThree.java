
package mn223dn_assign1;

import java.util.Scanner;

public class SumOfThree {
	
    public static void main(String[] args){
    	Scanner sc=new Scanner (System.in);
    	
    	System.out.print("Type a three digits number: ");
    	
    	int sum=sc.nextInt();
    	
    	int a = sum/100;
    	int a1 = a%100;
    	
    	int b = sum/10;
        int b1 = b%10;  	
    	
        int c1 = sum%10;
    		
    	int sumOfThree = a1 + b1 + c1;
    	
        System.out.print("Sum Of Digits: " + sumOfThree );
    	
    	sc.close();
    }
}
