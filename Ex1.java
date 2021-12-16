import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/* Put 2 numbers (a,b)
		 * Check for max and min with Math.max && Math.min
		 * Variable int with "tmp" name, tmp = 1
		 * Loop "for" i <-- 2, i <= min , i++
		 * In loop "for" add two "if" (if1 , if 2) loop
		 * "if1" run only if the numbers(a,b) % i == 0 
		 * "if2" if the "if1" true check if "i" is a prime 
		 * ***Is-Prime Number***
		 * Boolean prime function
		 * Variable int "n" && int "count" <-- 0
		 * Loop "for" int i <-- 2, i <= n , i++
		 * In loop "for" add loop "if"
		 * In "if" loop n%i == 0
		 * If the loops is true count ++
		 * Add "if" loop, check if count == 1 return true (is a           prime number)
		 * Else (if count not equal 1) return false (is not a prime number)  
		 * ******
		 * if "i" is a prime number, tmp <-- new "i" 
		 * return tmp
		 */

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int n = s.nextInt();
		System.out.println("Enter the seconed number: ");
		int n1 = s.nextInt();
		
		System.out.print("The prime GCD is: " + Gcd(n, n1));
	
	}

	public static int Gcd(int a , int b) 
	{
		int max = Math.max(a, b); 
		int min = Math.min(a, b);

		int tmp = 1;

		for(int i=2; i<=min; i++) {
			                      if(max%i==0 && min%i==0) 
			                      {
				                 if(prime(i)) 
			                      {
					              tmp = i;	
			        }
			  }
        } 
		
		return tmp;
	}

	public static boolean prime(int n) 
	{
		int count =0;
		
		for(int i=2; i<=n; i++) {
			                    if(n%i==0) 
			                    {
				                count++;
		 	}
		}
		if(count==1) {
			          return true; 
		}
		return false;
	}
	}


