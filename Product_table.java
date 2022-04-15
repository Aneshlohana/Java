import java.util.Scanner;

public class Product_table {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Entere number for table :");
        int num = Sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n",1 , num ,i*num);
        }
    }
}
