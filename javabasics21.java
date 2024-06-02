// Question5:Write a Java program that takes a year from the user and print 
// whether that year is a leap year or not
import java.util.*;
public class javabasics21{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year");
        int year = s.nextInt();
        if(year % 4 ==0){
            if(year % 100 == 0){
                if(year % 400 ==0){
                    System.out.println("its a leap year!");
                }
            }
            else{
                System.out.println("its a leap year!");
            }
        }
        else{
            System.out.println("not a leap year!");
        }
    }
}
