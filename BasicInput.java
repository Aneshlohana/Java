import  java.util.Scanner;
public class BasicInput {

    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner Input = new Scanner(System.in);
        String name = Input.nextLine();
        System.out.println("Enter your age :");
        int age = Input.nextInt();
        System.out.println("Enter your educational details :");
        Input.nextLine();
        String Study = Input.nextLine();
        System.out.println("Hello! Here is " + name + " and my age is " + age + " and currently enrolled in " + Study );


    }

}