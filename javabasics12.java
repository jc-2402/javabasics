//print the largest number
import java.util.*;
public class javabasics12{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter values a and b ");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b){
            System.out.println("a is largest!");
        }
        else{
            System.out.println("b is largest!");
        }
    }
}