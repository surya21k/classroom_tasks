import java.util.Scanner;
public class uglyNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        uglyNum();
    }
    public static void uglyNum() {
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int temp = n;

        if (n <= 0) {
            System.out.println(temp + " is Not an Ugly Number");
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        if (n == 1) System.out.println(temp + " is an Ugly Number");
        else System.out.println(temp + " is Not an Ugly Number");
    }
}
