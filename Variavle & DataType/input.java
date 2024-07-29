import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Addition
        int sum = a + b;
        System.out.println("sum =" + sum);
        //Product
        int mutli = a * b;
        System.out.println("multi =" + mutli);

        //Area of cycle
        float r=sc.nextFloat();
        float area= (22/7)*r*r;
        System.out.println("area = "+area);

    }
}
