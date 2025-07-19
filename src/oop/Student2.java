package oop;

public class Student2 {
    private String name;
    private int age;
    private double gpa;
    private String sub;

    public Student2(String name,int age,double gpa,String sub){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.sub=sub;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getSub() {
        return sub;
    }
    /////////////////////////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0)
            this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("GPA: " +gpa);
    }

    public void study(){

        System.out.println(name +" is studying" +sub);
    }
}
