
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Visine", 300000);
        Product p2 = new Product("Sapun", 250000);

        p1.displayProduct();
        p2.displayProduct();

        p1.setPriceInRon(p1.getPriceInRON()+10.25);
        p2.setPriceInRon(p2.getPriceInRON()+10.25);
        System.out.printf("After 10.25 RON increase, %s price is %f \n", p1.getName(), p1.getPriceInRON());
        System.out.printf("After 10.25 RON increase, %s price is %f \n", p2.getName(),p2.getPriceInRON());
        System.out.printf("Price of %s is: %f \n", p1.getName(), p1.getPrice());
        System.out.printf("Price of %s is: %f \n", p2.getName(), p2.getPrice());
    }
    
}
