import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

            if(num % 2 == 0){
                System.out.println("Given number is Even number");
            }
            else {
                System.out.println("Given number is Odd number");
            }

    }
}
