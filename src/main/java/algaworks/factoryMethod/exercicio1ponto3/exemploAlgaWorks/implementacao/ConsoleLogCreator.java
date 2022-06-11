package algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.implementacao;

import algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.abstracao.LogPrinter;
import algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.abstracao.Logger;

public class ConsoleLogCreator extends Logger {
    @Override
    protected LogPrinter createLogger() {
        return new ConsoleLogPrinter();
    }
}
