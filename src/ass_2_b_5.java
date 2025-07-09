import java.util.Scanner;

public class ass_2_b_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=s.nextInt();
        int count=0;
        while(x>0){
            x/=10;
            count++;
        }
        System.out.println("Number of digits: " +count );
    }
}
