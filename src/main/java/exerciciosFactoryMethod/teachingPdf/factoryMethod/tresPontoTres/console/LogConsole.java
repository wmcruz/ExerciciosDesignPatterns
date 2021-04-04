package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.console;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.abstracao.Log;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.abstracao.PrintLog;

public class LogConsole extends Log {

    @Override
    protected PrintLog geraLog() {
        return new PrintLogConsole();
    }
}
