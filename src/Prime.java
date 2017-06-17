/**
 * 
 */

/**
 * @author kktejas
 *
 */
import java.util.Scanner;
public class Prime {

 private static Scanner scanner;
public static void main(String[] args) 
		    {
		        int KKTejas, Teja = 0;
		        System.out.print("Enter any number:");
		        scanner = new Scanner(System.in);
				KKTejas = scanner.nextInt();
		        Prime obj = new Prime();
		        Teja= obj.prime(Teja, 2);
		        if(KKTejas == 1)
		        {
		            System.out.println(KKTejas+" Entried Value by KKTejas is prime number");
		        }
		        else
		        {
		            System.out.println(KKTejas+" Entried Value by KKTejas is not prime number");
		        }
		    }
		    int prime(int y,int i)
		    {
		         if(i < y)
		        {
		            if(y % i != 0) 
		            {
		                return(prime(y, ++i));
		            } 
		            else
		            {
		                return 0; 
		            }
		        }
		        return 1;
		    }
		}
	


