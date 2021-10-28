class CheckPrime{
    public static boolean isPrime(int number) {
        if (number <=1)return false;
        for (int i=2; i<=number/2; i++){

        }
        return true;

    }

    public static void main(String[] args) {
        int number = 3;
        String a = number + " is not a prime number";
        if (isPrime(number)) {
            a = number + " is a prime number";
        }
        System.out.println(a);
    }
}