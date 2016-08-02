


import java.util.Scanner;

public class dividenooperator {

public static void main(String[] args) {
int num,result=0;

System.out.println("Please enter the number to be divided by 2");
Scanner s=new Scanner(System.in);

	num=s.nextInt();
if(num==0){
	System.out.println("Result is zero");
}
if(num<2){
	
	System.out.println("Result is less than one.");	
}
	while(num>=2)
	{
		num=num-2;
	
	result=result+1;}
	System.out.println("Result is "+result);
	
	
}
	
	
}