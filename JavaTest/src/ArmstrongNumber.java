


import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a,temp,c=0,r;
		System.out.println("Please enter the number...");
	       Scanner s=new Scanner(System.in);
	               a=s.nextInt();
	               temp=a;
	               while(a>0){
	            	   r=a%10;
	               a=a/10;
	               c=c+(r*r*r);
	               }
	               if(temp==c){
	            	   System.out.println("Number is armstrong");
	               }
	               else
	               {
	            	System.out.println("Number is not armstrong");   
	               }
	               
	    
	}

}

