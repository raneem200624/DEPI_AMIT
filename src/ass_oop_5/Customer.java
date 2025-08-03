package ass_oop_5;

public class Customer extends User{
    public Customer(int uid, String name, String email) {
        super(uid, name, email);
    }

    public void placeOrder(int id){
        System.out.println("Order placed for product ID: "+id);
    }

    public void placeOrder(int id,int quantity){
        System.out.println("Order placed for product ID: "+id+" and Quantity: "+quantity);
    }

    @Override
    public String getUserDetails(){
        return "Customer: "+name+"[ Email: "+ email +" ]";
    }


}
