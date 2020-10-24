package exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.implementacao;

import exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.abstracao.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
