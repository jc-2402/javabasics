// Question1: Write a Java program to get a number from the user and print whether it is positive 
// or negative
import java.util.*;
public class javabasics18{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int a = s.nextInt();
        if( a>0){
            System.out.println("positive no.");
        }
        else{
            System.out.println("negative no.");
        }
    }
}
