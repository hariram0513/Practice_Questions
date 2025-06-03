import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));

    }

    static boolean isPrime(int num){
        if(num <= 0){
            return false;
        }

        int a =2;
        while(a < num){
            if(num % a == 0){
                return  false;
            }
            a++;

        }


        return  true;

    }
}
