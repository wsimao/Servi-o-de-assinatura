public class Pacote3 extends PacotesDecorator{
    
    @Override
    public String getName(){
        return super.getName() + " + Caixa surpresa com produtos relacionados a filmes e séries";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 29.99;
    }
}
