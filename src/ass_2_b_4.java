import java.util.Scanner;

public class ass_2_b_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                int y=i*j;
                System.out.println(i +"x" +j +"=" +y);
            }
            System.out.println("****************");
        }
    }
}
