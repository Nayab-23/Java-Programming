import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
    public static int larger(int x,int y) {
        if (x < y) return y ;
        else return x ;
    }

    // taking input from the user.
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in) ;
        try {
            int x = a.nextInt();
            int y = a.nextInt();
            int b = larger(x,y) ;
            System.out.println(b);

        } catch (Exception e) {
            System.out.println("Please input a number next time");
            System.out.println(e);
        } finally {
            System.out.println("Have a good day");
        }




    }

}

