import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int number =sc.nextInt();
		
		if(number>0) {
			System.out.println("The Number is Positive .")
;
			}
		else if(number <0) {
			System.out.println("The Number is Negitive");
			
			
		}
		else {
			System.out.println("The Number is Zero");
		}

	}

}
