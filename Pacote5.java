public class Pacote5 extends PacotesDecorator {
    @Override
    public String getName(){
        return super.getName() + " + Compra com Cash Back";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 19.99;
    }
    
}
