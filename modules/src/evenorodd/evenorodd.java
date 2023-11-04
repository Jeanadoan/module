package evenorodd;
import java.util.Scanner;
public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Number = new Scanner (System.in);
		System.out.println ("Type a number:");
		int i =Number.nextInt();
		
		
		if (i==0) {
			System.out.println ("Invalid input");
		}
		
		else {
	
			
			//&& = and
			
			if (i>0 && i%2==0) {
				System.out.println ("This number is even and positive");
			}
		
			else if (i>0 && i%2!=0) {
				System.out.println ("This number is odd and positive");
			}
			
			else if (i<0 && i%2!=0) {
				System.out.println ("This number is odd and negative");
			}
			
			else if (i<0 && i%2==0) {
				System.out.println ("This number is even and negative");
			}
		
			
		
		}
	}

}

//positive or negative number