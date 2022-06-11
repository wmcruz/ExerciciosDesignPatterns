package algaworks.factoryMethod.exercicio1ponto3.meuExemplo;

public class GerarLogConsole extends GeraLog {

    protected GerarLogConsole(Class classe) {
        super(classe);
    }

    @Override
    public void gerarLogger() {
        System.out.println("Data: " + getData());
    }
}

class testMain {
    public static void main(String[] args) {
        GerarLogConsole gerarLogConsole = new GerarLogConsole(GerarLogConsole.class);
        gerarLogConsole.gerarLogger();
    }
}