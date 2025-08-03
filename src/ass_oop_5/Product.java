package ass_oop_5;

public class Product {
    int id;
   private String name;
    double price;
    int stock;

    public Product(int id, String name, double price, int stock){
        this.id=id;
        this.name=name;
        setPrice(price);
        setStock(stock);
    }

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return this.stock;
    }

    public void setPrice(double price) {
        if(price<0)
        {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price=price;
    }

    public void setStock(int stock) {
        if(stock<0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.stock=stock;
    }

    public void display() {
        System.out.println(id+ " : "+name+" -  "+price+" [ "+stock+" left] ");
    }

}
