package ass_oop_5;

public interface Payment {

    void process(double amount);
    boolean validateCard(String cardDetails);

}
