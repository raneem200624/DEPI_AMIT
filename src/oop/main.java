package oop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num= s.nextInt();
        Student[] A=new Student[num];
        for(int i=0;i<num;i++) {
            System.out.print("Enter the student "+(i+1) +" name,age,gpa,sub " +": ");
            String name= s.next();
            int age= s.nextInt();
            double gpa= s.nextDouble();
            String sub= s.nextLine();
            A[i]=new Student(name,age,gpa,sub);
        }
        for(Student x:A){
            x.display();
            x.study();
        }
    }
}
