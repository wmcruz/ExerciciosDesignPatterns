package exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.implementacao;

import exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.abstracao.LogPrinter;
import exerciciosFactoryMethod.algaWorks.exemploAlgaWorks.abstracao.Logger;

public class ConsoleLogCreator extends Logger {
    @Override
    protected LogPrinter createLogger() {
        return new ConsoleLogPrinter();
    }
}
