import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(palin(num));



    }
    static boolean palin(int num){
        int temp = num;
        int x =0;

        while(temp>0){
            int digit =temp % 10;
            x= x*10 + digit;
            temp = temp/10;
            //System.out.print(x);
        }
        System.out.println(x);
        if(x == num){
            return true;
        }
        return false;
    }



}
