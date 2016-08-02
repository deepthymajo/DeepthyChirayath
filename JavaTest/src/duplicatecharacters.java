

import java.util.Scanner;

public class duplicatecharacters {

	public static void main(String[] args) {
	String str1;
	str1="level";
	int count=0;
	int i=str1.length();
		
		
		System.out.println("The input string is "+str1);
		for(int j=0;j<i;j++)
		{
			for(int k=j+1;k<i;k++)
			{
				if(str1.charAt(k)==str1.charAt(j))
				{
					
			System.out.println(str1.charAt(j)+"  is a character that duplicates in the given string");
				count=count+1;
				}
				
				
				}
			
				}
		
			while(count==0)
			{System.out.println("No duplicate characters in string");
				break;}
			}
	}


	
		

	
	


