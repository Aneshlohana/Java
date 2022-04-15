import java.util.Scanner;

public class Swapping_of_two_numbers {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = Sc.nextInt();
        System.out.println("Enter value of B : ");
        int b = Sc.nextInt();
        System.out.printf("Entered  value of a: %d and b: %d : " , a ,b);

        //Swapping of two numbers
        int c = a;
        a = b;
        b = c;
        System.out.printf("After Swapping  value of a: %d and b: %d : " , a ,b);

    }
}
