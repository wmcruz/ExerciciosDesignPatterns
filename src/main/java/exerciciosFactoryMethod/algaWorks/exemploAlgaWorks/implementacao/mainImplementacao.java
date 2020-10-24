package exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.implementacao;

import exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.abstracao.Logger;

public class mainImplementacao {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogCreator();
        logger.log("Hello Factory Method!");
    }
}