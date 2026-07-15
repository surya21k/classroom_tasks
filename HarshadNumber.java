import java.util.Scanner;
public class HarshadNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        HarshadNumber H = new HarshadNumber();
        H.harshadNumber();
    }
    public void harshadNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if(temp%sum ==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
}
