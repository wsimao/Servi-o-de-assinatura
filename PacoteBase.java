public class PacoteBase implements iPacotes {

    String name = "Plano Básico";
    double price = 9.99;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
        
    }
}    


