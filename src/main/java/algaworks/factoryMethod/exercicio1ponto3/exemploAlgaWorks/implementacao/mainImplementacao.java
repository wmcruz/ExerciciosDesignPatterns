package algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.implementacao;

import algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.abstracao.Logger;

public class mainImplementacao {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogCreator();
        logger.log("Hello Factory Method!");
    }
}