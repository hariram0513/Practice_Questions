import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n =0;

        while(num >0){
            int x =num % 10;
            n =n*10 +x;
            num = num/10;
            System.out.print(x);


        }
    }
}
