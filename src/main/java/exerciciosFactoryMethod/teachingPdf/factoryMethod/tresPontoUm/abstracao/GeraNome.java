package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao;

public abstract class GeraNome {
    protected abstract PrintNome printNome();

    public void printConsole(Nome nome) {
        PrintNome printNome = printNome();

        printNome.printNome(nome);
    }
}