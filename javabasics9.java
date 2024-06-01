//Q1
//In a program,input3numbers:A,BandC.You have to output the average of these 
//3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;
public class javabasics9{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
          System.out.println("enter 3 numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
      
        int avg = (a+b+c)/3;
        System.out.println("average is "+avg);
    }
}