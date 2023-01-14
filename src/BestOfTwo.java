import java.util.Scanner;
public class BestOfTwo {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while( t-- > 0 ) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println( Math.max( x, y) );
        }
    }
}

//Input:
//        4
//        40 60
//        67 55
//        50 50
//        1 100
//
//OutPut:
//        60
//        67
//        50
//        100