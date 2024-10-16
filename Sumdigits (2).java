import java.util.Scanner;

public class Sumdigits {

	public static void main(String[] args) {
    
		Scanner Sc = new Scanner (System.in)
				System.out.println("Enter a number:");
		  int num = Sc.nextInt();
		  int sum =0;
		  for (int i=num: i>0 : i/=10)
		  {
			  int rem= i%10;
			  Sum + = rem;
		  }
		  System.out.println("Sum of digit of "+ num+"");
	}

}
