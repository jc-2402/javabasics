//largest of 3 num.s
import java.util.*;
public class javabasics15{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if( a > b && a >c ){
            System.out.println(a+" is the largest");
        }
        else if( b> a && b> c){
            System.out.println(b+" is the largest");
        }
        else{
            System.out.println(c+" is the largest");
        }
    }
}