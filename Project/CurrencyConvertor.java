import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choose the Currency That you  want to Convert");
        System.out.println("1.  US Doller");
        System.out.println("2.  Indian Rupees");

        int chose=sc.nextInt();
        switch (chose){
            case 1:
                System.out.println("Enter the Doller $");
                double dollor= sc.nextDouble();
                Double indian = dollor * 83;
                System.out.println(indian+"Rupees");
                break;

            case 2:
                System.out.println("Enter the Indian Rupees");
                double ind= sc.nextDouble();
                Double doll= ind/83;
                System.out.println(doll+"$");
                break;
        }
    }
}
