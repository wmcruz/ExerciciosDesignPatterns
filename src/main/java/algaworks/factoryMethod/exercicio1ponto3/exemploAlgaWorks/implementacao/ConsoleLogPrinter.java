package algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.implementacao;

import algaworks.factoryMethod.exercicio1ponto3.exemploAlgaWorks.abstracao.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
