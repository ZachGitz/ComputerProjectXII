import java.util.*;
public class Kaprekar_Number {  
    static boolean isKaprekar(int n)   
    {   
        if (n == 1)   
           return true;   
        int sq_n = n * n;   
        int count_digits = 0;   
        while (sq_n != 0)   
        {   
            count_digits++;   
            sq_n /= 10;   
        }   
        sq_n = n*n;   
        for (int r_digits=1; r_digits<count_digits; r_digits++)   
        {   
             int eq_parts = (int) Math.pow(10, r_digits);   
            if (eq_parts == n)   
                continue;   
             int sum = sq_n/eq_parts + sq_n % eq_parts;   
             if (sum == n)   
               return true;   
        }   
        return false;   
    }       
    public static void main (String[] args)   
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");    
        int p = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int q = sc.nextInt();
        if(p>q)
     {
        System.out.println("Error");
        System.exit(0);
        }
        System.out.println("Kaprekar Number Between "+p+" and "+q+" are");
       for (int i=p; i<q; i++)   
            if (isKaprekar(i))   
                 System.out.print(i + " ");   
    }   
}   