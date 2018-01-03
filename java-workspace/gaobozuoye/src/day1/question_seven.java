package day1;

import java.util.Scanner;

public class question_seven {

	public static void main(String[] args){  
        Scanner input=new Scanner(System.in);  
        System.out.print("input a string: ");  
        String str=input.nextLine();  
        System.out.println("This is the "+str.length()+" digit number");
        if(isPalindrome(str))  
            System.out.println(str+" is palindrome");  
        else  
            System.out.println(str+" is not palindrome");  
    }  
    public static boolean isPalindrome(String str){  
        int low=0;  
        int high=str.length()-1;  
        while(low<high){  
            if(str.charAt(low)!=str.charAt(high))  
                return false;  
            low++;  
            high--;  
        }
        return true;  	
    } 

}
