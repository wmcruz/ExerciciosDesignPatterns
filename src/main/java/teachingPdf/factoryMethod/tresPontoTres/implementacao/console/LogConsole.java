package teachingPdf.factoryMethod.tresPontoTres.implementacao.console;

import teachingPdf.factoryMethod.tresPontoTres.abstracao.Log;
import teachingPdf.factoryMethod.tresPontoTres.abstracao.PrintLog;

public class LogConsole extends Log {

    @Override
    protected PrintLog geraLog() {
        return new PrintLogConsole();
    }
}
