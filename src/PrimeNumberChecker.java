import java.util.Scanner;
class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number <= 1)return false;
        for (int i=2; i <= number/2; i++){
            if (number%i==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println(" Enter a number: ");
        int number=input.nextInt();
        if (number == -1) {
            System.out.println("Progress terminated !");
         break;

        }
        if (isPrime(number)) {

            System.out.println(number + "is a prime number\n");

        } else {
            System.out.println(number + "is not a prime number\n");
        }
    }

    }
}
