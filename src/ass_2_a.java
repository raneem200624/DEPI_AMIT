import java.util.Scanner;

public class ass_2_a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int x=s.nextInt();
        s.nextLine();
        for(int i=1;i<=x;i++){
            System.out.print("Enter the student's name:");
            String name=s.nextLine();
            // s.nextLine();
            //System.out.println();
            System.out.print("Enter three exam scores:");
            double y1=s.nextDouble();
            double y2=s.nextDouble();
            double y3=s.nextDouble();
            double avg =(y1+y2+y3)/3;

            System.out.println("Name:" + name);
            System.out.println("Average:" + avg);

            if( avg>=85)
                System.out.println("Grade: A");
            else if( avg>=70)
                System.out.println("Grade: B");
            else if( avg>=50)
                System.out.println("Grade: C");
            else
                System.out.println("Grade: F");
            s.nextLine();
        }
    }
}