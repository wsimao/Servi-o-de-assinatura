public class Pacote4 extends PacotesDecorator{

    @Override
    public String getName(){
        return super.getName() + " + Cartão de crédito Platinum";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 49.99;
    }
    
}
