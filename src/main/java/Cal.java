import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give number");
        double num1 =sc.nextDouble();
        System.out.println("give number2");
        double num2 = sc.nextDouble();
        System.out.println("sum:  "+addMe(num1,num2));
        System.out.println("mul:  "+mulMe(num1,num2));
        System.out.println("div:  "+divMe(num1,num2));
        System.out.println("pow:  "+powMe(num1,num2));
        System.out.println("sum:  "+subMe(num1,num2));


    }

public static double addMe(double a, double b) {
        return a + b;
}
public static double mulMe(double a, double b) {
        return a * b;
}
public static double divMe(double a, double b) {
        return a / b;

}
public static double powMe(double a, double b) {
        return Math.pow(a, b);
}
public static double subMe(double a, double b) {
        return a - b;
}
}
