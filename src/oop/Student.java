package oop;

public class Student {
    private String name;
    private int age;
    private double gpa;
    private String sub;

    public Student(String name,int age,double gpa,String sub){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.sub=sub;
    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("age: " +age);
        System.out.println("GPA: " +gpa);
    }

    public void study(){
        System.out.println(name +" is studying" +sub);
    }
}
