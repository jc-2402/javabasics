//check if pass or fail using ternary operator
import java.util.*;
public class javabasics16{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("enter marks");
        int marks = s.nextInt();
        String result = (marks>=33)?"PASS":"FAIL";
        System.out.println(result);
    }
}