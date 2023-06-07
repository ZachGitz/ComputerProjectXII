import java.util.*;  
public class FascinatingNumber 
{  
    public static boolean isFascinatingNumber(int number)   
{  
int digit = 0;  
//new number  
String str = "" + number + number*2 + number*3;  
//declaring an array  
int digitarray[] = new int[10];  
  
//comparing array elements with characters of the string  
for(int i=0; i<str.length(); i++)   
{  
//converts ith character into an integer  
digit = str.charAt(i) - '0';  
//check arr[digit] element and ignore 0s  
if(digit==0 || digitarray[digit]==0)  
digitarray[digit]++;  
else return false;  
}  
//checks the numbers that are missing  
for(int i=1; i<digitarray.length; i++)   
{  
//digit i was not there in String  
if(digitarray[i]==0)  
return false;  
}  
//all conditions satisfied so, return true  
return true;  
}
public static void main(String args[])  
{  
int num;      
Scanner sc=new Scanner(System.in);  
System.out.print("Enter any Number: ");  
num = sc.nextInt();
if(isFascinatingNumber(num))
System.out.println(num + " is a fascinating number.");  
else  
System.out.println(num + " is not a fascinating number."); 
}}