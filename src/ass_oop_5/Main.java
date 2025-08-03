package ass_oop_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id= s.nextInt();
        s.nextLine();
        System.out.print("Enter Product name: ");
        String name= s.nextLine();
        System.out.print("Enter Product Price: ");
        double price= s.nextDouble();
        System.out.print("Enter Product Stock: ");
        int stock= s.nextInt();

        Product p=new Product(id,name,price,stock);

        System.out.print("Enter Customer ID: ");
        int cid= s.nextInt();
        System.out.print("Enter Customer name: ");
        String cname= s.next();
        s.nextLine();
        System.out.print("Enter Customer email: ");
        String cemail= s.nextLine();
        //s.nextLine();
        /*System.out.print("Enter the Quantity : ");
        int quantity= s.nextInt();*/


        Customer c=new Customer(cid,cname,cemail);
        System.out.println(c.getUserDetails());
        p.display();
        System.out.print("Enter the Quantity : ");
        int quantity= s.nextInt();
        s.nextLine();
        c.placeOrder(p.getId(),quantity);

        //Payment cc=new CreditCard();
        System.out.print("Enter credit card number: ");
        String cnum= s.nextLine();
        Payment cc=new CreditCard();
        if(cc.validateCard(cnum)){
            cc.process(p.getPrice() * quantity);
        }

        System.out.print("Enter Admin ID: ");
        int aid= s.nextInt();
        System.out.print("Enter Admin name: ");
        String aname= s.next();
        s.nextLine();
        System.out.print("Enter Admin email: ");
        String aemail= s.nextLine();

        Admin a=new Admin(aid,aname,aemail);
        System.out.println(a.getUserDetails());
        System.out.print("Current info: ");
        p.display();

        System.out.print("new price: ");
        double nprice=s.nextDouble();
        System.out.print("new stock: ");
        int nstock=s.nextInt();

        a.update(p,nprice,nstock);

        System.out.print("Updated info: ");
        p.display();

    }
}
