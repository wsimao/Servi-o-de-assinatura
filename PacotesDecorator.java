public abstract class PacotesDecorator implements iPacotes {

    PacoteBase pacote = new PacoteBase();

    @Override
    public String getName() {
        return this.pacote.name;    
    }

    @Override
    public double getPrice() {
        return this.pacote.price; 
    }

}
