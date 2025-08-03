package ass_oop_5;

public class Admin extends User{
    public Admin(int uid, String uname, String email) {
        super(uid, uname, email);
    }

    public void update(Product product, double price ,int stock){
        product.setPrice(price);
        product.setStock(stock);
        System.out.println("Admin: "+name+" updated product:"+product.getName());
    }
    @Override
    public String getUserDetails(){
        return "Admin: "+name+", Email: "+ email;
    }
}
