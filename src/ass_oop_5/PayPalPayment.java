package ass_oop_5;

public class PayPalPayment implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("Processing PayPal payment: "+amount);
    }

    @Override
    public boolean validateCard(String email){
        return email.contains("@");
    }

}
