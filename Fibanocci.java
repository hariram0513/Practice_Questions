public class Fibanocci {
    public static void main(String[] args) {

        int a =0;
        int b=1;

        for(int i =2;i <=7;i++){
            int temp = b;
            b = b+a;
            System.out.println(b);
            a =temp;

        }
    }
}
