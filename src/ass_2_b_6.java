import java.util.Scanner;

public class ass_2_b_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=s.nextInt();
        int r=0;
        while (x>0){
            int y=x%10;
            r=r*10+y;
            x/=10;
        }
        System.out.print("Revers number: "+r);
    }
}
