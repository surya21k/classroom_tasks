import java.util.Scanner;
public class CompleteNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CompleteNumber Cn = new CompleteNumber();
        Cn.completeNumber();
    }
    public void completeNumber(){
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("complete Number / Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
}
