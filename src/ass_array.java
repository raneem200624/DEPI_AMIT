import java.util.Scanner;

public class ass_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int x= s.nextInt();
        int A[]=new int [x];
        int total=0;
        int maxx=0,minn=0;
        int count=0;
        System.out.print("Enter mark: ");
        for(int i=0;i<x;i++)
        {
            //System.out.print("Enter mark: ");
            A[i]=s.nextInt();
            total+=A[i];
            if(A[i]>maxx)
                maxx=A[i];
            else
                minn=A[i];
            if(A[i]>=50)
                count++;
        }
        double avg= (double) total/x;

        for(int i=0;i<x;i++)
            System.out.println("Marks"+ (i+1) +": "+A[i]);

        System.out.println("Highest mark is: "+maxx);
        System.out.println("Lowest mark is: "+minn);
        System.out.println("Average= "+avg);
        System.out.println("Number of students passed: "+count);
        System.out.println("Number of students failed: "+(x-count));
    }
}
