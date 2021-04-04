package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.implementacao.arquivo;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.abstracao.Log;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.abstracao.PrintLog;

public class LogArquivo extends Log {
    @Override
    protected PrintLog geraLog() {
        return new PrintLogArquivo();
    }
}
