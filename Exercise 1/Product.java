public class Product {
    String name;
    double price;
    double priceRON;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.priceRON = this.price/10000;
    }

    public String getName(){
        return this.name;
    }

    public void displayProduct(){
        System.out.println(this.name + " costs "+this.price);
    }
    
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPriceInRON(){
        return this.price/10000;
    }

    public void setPriceInRon(double price){
        this.price = price*10000;
    }



    
    
}
