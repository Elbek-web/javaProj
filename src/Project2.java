import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a  =scanner.nextDouble();
        System.out.print("Enter b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter c : ");
        double c = scanner.nextDouble();

        if (a == 0){
            System.out.println("If a = 0 it is not quadratic equation");
            if(b != 0){
                System.out.println("Linear equation root: x = " + (-c / b));
            }
        }

        double D = Math.pow(b,2) - 4 * a *c;
        System.out.println("Discreminant D = " + D);

        if (D > 0){
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two real root:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if(D == 0) {
            double x = -b / (2 * a);
            System.out.println("Bitta ildiz bor (karrali):");
            System.out.println("x = " + x);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Haqiqiy ildiz yo'q. Kompleks ildizlar:");
            System.out.println("x1 = " + real + " + " + imag + "i");
            System.out.println("x2 = " + real + " - " + imag + "i");
        }

    }
}
