import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a numbers");
        int a=sc.nextInt();
        
        System.out.println("Enter the b value :");
        int b=sc.nextInt();
        
        System.out.println("enter an operator(+,-,*,/,%) ");
      
        char operations=sc.next().charAt(0);

        switch (operations) {

            case '+':
            System.out.println(a+b);
                break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println( a%b);
            break;
            default:
            System.out.println("invalide");
     
        }
    }
    
}