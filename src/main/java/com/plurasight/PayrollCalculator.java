import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Hours: ");
        double hours = sc.nextDouble();

        System.out.print("Rate: ");
        double rate = sc.nextDouble();

        double pay = hours * rate;

        System.out.println(name + " earned $" + pay);
    }
}
