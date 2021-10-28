 class PrimeNumber {
     public static boolean isPrime(int number) {
         if (number <= 1)return false;
         for (int i=2; i<= number/2; i++){
             if (number%i==0)return false;
         }
         return true;
     }

     public static void main(String[] args) {
         int firstNum=0, lastNum=10;
         String a ="Prime Number To " + firstNum + "To " + lastNum;
              for (int i=firstNum; i<=lastNum; i++){
                 if ( isPrime( i )){
                     System.out.println(i+"");
                 }
             }
         }
     }

