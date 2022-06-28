public class Pacote1 extends PacotesDecorator {


    @Override
    public String getName(){
        return super.getName() + " + Assistir vídeos em vários dispositivos";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 19.99 ;
    }


}
