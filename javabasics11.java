// Question3: Enter cost of 3items from the user(using float datatype)-a pencil,a pen and an eraser.
//  You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
public class javabasics11{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter 3 price");
        float pencil = s.nextInt();
        float pen = s.nextInt();
        float eraser = s.nextInt();
        float total = pen+pencil+eraser;
        float bill = (total + (0.18f * total));
        System.out.println("total bill with gst "+bill);
    }
}