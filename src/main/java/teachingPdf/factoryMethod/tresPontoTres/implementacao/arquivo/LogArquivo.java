package teachingPdf.factoryMethod.tresPontoTres.implementacao.arquivo;

import teachingPdf.factoryMethod.tresPontoTres.abstracao.Log;
import teachingPdf.factoryMethod.tresPontoTres.abstracao.PrintLog;

public class LogArquivo extends Log {
    @Override
    protected PrintLog geraLog() {
        return new PrintLogArquivo();
    }
}
