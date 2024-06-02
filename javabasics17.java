// calculator
import java.util.*;
public class javabasics17{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of a ");
        int a = s.nextInt();
        System.out.println("enter value of b ");
        int b = s.nextInt();
        System.out.println("enter value of operator ");
        char operator = s.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b);
                   break; 
            case '-' : System.out.println(a-b);
                   break;
            case '*' : System.out.println(a*b);
                   break;
            case '/' : System.out.println(a/b);
                   break;
            case '%' : System.out.println(a%b);
                   break;
            default : System.out.println("invaild input");
        }
    }
}