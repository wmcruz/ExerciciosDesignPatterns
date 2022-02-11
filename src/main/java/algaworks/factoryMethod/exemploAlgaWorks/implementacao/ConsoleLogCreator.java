package algaworks.factoryMethod.exemploAlgaWorks.implementacao;

import algaworks.factoryMethod.exemploAlgaWorks.abstracao.LogPrinter;
import algaworks.factoryMethod.exemploAlgaWorks.abstracao.Logger;

public class ConsoleLogCreator extends Logger {
    @Override
    protected LogPrinter createLogger() {
        return new ConsoleLogPrinter();
    }
}
