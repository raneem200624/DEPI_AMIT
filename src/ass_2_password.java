import java.util.Scanner;

public class ass_2_password {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String x="12345";
        String c;
        do{
            System.out.print("Enter password: ");
             c= s.nextLine();
            if(!x.equals(c))
                System.out.println("Incorrect password");

        }while(! x.equals(c));
        System.out.println("Correct password");
    }
}