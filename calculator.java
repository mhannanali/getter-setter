import java.util.*;
public class calculator{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME SIR THIS  IS OUR CALCULATOR : ");
            System.out.println("FOR THE SUM OPERATOR YUH SHOULD PRESS 1: ");
            System.out.println("FOR THE DIFFERENCE OPERATOR YUH SHOULD PRESS 2:");
            System.out.println("FOR THE MULTIPLY OPERATOR YUH SHOULD PRESS 3:");
            System.out.println("FOR THE DIVIDE OPERATOR YUH SHOULD PRESS 4:");
            System.out.println("FOR THE SQUARE OPERATOR YUH SHOULD PRESS 5:");
            System.out.println("FOR THE CUBE OPERATOR YUH SHOULD PRESS 6");
            int button=sc.nextInt();
            switch (button)
            {
                case 1:
                {
                    System.out.println("ENTER THE VALUES OF THE GIVEN VARIABLE:");
                    int a=sc.nextInt();
                    System.out.println("ENTER THE VALUE OF THE GIVEN VARIABLE :");
                    int b=sc.nextInt();
                    System.out.println("SO THE SUM OF THIS VARIABELS:");
                    int sum=a+b;
                    System.out.println(sum);
                }
                break;
                case 2:
                {
                    
                    System.out.println("ENTER THE VALUES OF THE GIVEN VARIABLE:");
                    int a=sc.nextInt();
                    System.out.println("ENTER THE VALUE OF THE GIVEN VARIABLE :");
                    int b=sc.nextInt();
                    System.out.println("THE DIFFERENCE OF THE GVEN VARIABLESS:");
                    int diff=a-b;
                    System.out.println(diff);
                }
                break;
                case 3:
                {
                    
                    System.out.println("ENTER THE VALUES OF THE GIVEN VARIABLE:");
                    int a=sc.nextInt();
                    System.out.println("ENTER THE VALUE OF THE GIVEN VARIABLE :");
                    int b=sc.nextInt();
                    System.out.println("THE MULTIPLICATON OF THIESE VARIABLES: ");
                    int mul=a*b;
                    System.out.println(mul);
                }
                break;
                case 4:
                {
                    
                    System.out.println("ENTER THE VALUES OF THE GIVEN VARIABLE:");
                    int a=sc.nextInt();
                    System.out.println("ENTER THE VALUE OF THE GIVEN VARIABLE :");
                    int b=sc.nextInt();
                    System.out.println("THE DIVIDED FORM OF THESE VARIABLES ARE:");
                    int div=a/b;
                    System.out.println(div);
                }
                break;
                case 5:
                {
                    
                    System.out.println("ENTER THE VALUES OF THE GIVEN VARIABLE:");
                    int a=sc.nextInt();
                   System.out.println("THE SQUARE OF THIS WHOLE VALUE IS :");
                   int SQUARE=a*a; 
                   System.out.println(SQUARE);
                }
                break;
                case 6:
                {
                    
                    System.out.println("ENTER THE VALUES OF THE GIVEN VARIABLE:");
                    int a=sc.nextInt();
                    System.out.println("THE CUBE OF THIS WHOLE VALUE IS :");
                    int CUBE=a*a*a;
                    System.out.println(CUBE);

                }break;
                default:System.out.println("YUH ENTERED THE INVALID INPUT VALUES OF THE GIVEN VARIABLES !!!! SOORRY ENTER TH VALID VARABLES!!");
            }
    }
}