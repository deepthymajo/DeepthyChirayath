


import java.util.Scanner;

public class Fibinocciseries {

	public static void main(String[] args) {
	int first=0;
	int second=1;
	int next;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of terms for fibinocci series");
    int numterms= s.nextInt();
    
    System.out.print(first+","+second);
    for(int count=3;count<=numterms;count++){
    	
    	
    	next=first+second;
    	System.out.print(","+next);
    	first=second;
    	second=next;
    }
    }
	}



