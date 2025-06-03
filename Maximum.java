
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();

        int Max = 0;
        if( a > b){
            Max =a;
        }
        else{
            Max =b;
        }

        if(c > Max){
            Max = c;
        }

        System.out.println(Max);

    }
}
