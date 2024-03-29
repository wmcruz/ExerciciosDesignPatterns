package teachingPdf.factoryMethod.tresPontoTres.implementacao.console;

import teachingPdf.factoryMethod.tresPontoTres.abstracao.PrintLog;

import java.util.List;

public class PrintLogConsole implements PrintLog {
    @Override
    public void printLog(String log, List<Integer> lista) {
        System.out.println();
        lista.forEach((Integer numero) -> System.out.println(log + numero));
    }
}
