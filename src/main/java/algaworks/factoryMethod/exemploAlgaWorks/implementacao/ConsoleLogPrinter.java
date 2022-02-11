package algaworks.factoryMethod.exemploAlgaWorks.implementacao;

import algaworks.factoryMethod.exemploAlgaWorks.abstracao.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
