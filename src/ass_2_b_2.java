import java.util.Scanner;

public class ass_2_b_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=s.nextInt();
        if(x%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
