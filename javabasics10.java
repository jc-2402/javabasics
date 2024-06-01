// Question2:Inaprogram,input the side of a square.You have to output the area of the square.
// (Hint : area of a square is (side x side))
import java.util.*;
public class javabasics10{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter side");
        int side = s.nextInt();
        int area = side*side;
        System.out.println("area is "+area);
    }
}
