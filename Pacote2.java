public class Pacote2 extends PacotesDecorator {

    @Override
    public String getName(){
        return super.getName() + " + Frete Grátis";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 9.99;
    }


}
