import java.util.*;
public class Twin_Prime
{

   static boolean isPrime(int n)
    {    
        if (n <= 1)
            return false;
 
        
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the lower limit: ");
     int m = sc.nextInt();
     System.out.println("Enter the upper limit: ");
     int r = sc.nextInt();
     if(m>r)
     {
        System.out.println("Error");
        System.exit(0);
        }
     System.out.println("The twin prime between "+m+" and "+r+" are:");
     for(int i = 0;i<=r;i++)
     if(isPrime(i) && isPrime(i+2)){
         int d = i+2;
         System.out.println(i+" "+d);
        }
    }
}
