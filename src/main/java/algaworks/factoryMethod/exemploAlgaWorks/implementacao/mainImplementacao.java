package algaworks.factoryMethod.exemploAlgaWorks.implementacao;

import algaworks.factoryMethod.exemploAlgaWorks.abstracao.Logger;

public class mainImplementacao {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogCreator();
        logger.log("Hello Factory Method!");
    }
}