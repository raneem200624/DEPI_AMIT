package ass_oop_5;

public class CreditCard implements Payment{
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment "+amount);
    }

    @Override
    public boolean validateCard(String cardDetails) {
        //System.out.println("Validating credit card: "+cardDetails);
        return cardDetails.length()==10;
    }
}
