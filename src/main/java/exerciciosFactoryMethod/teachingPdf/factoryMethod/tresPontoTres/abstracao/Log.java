package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.abstracao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;

public abstract class Log {
    // Atributos
    private Logger logger = Logger.getLogger("[LOGGER] => ");
    protected abstract PrintLog geraLog(); // método abstrato

    // Métodos
    public void imprimeListaLog(List<Integer> lista) {
        PrintLog printLog = geraLog();

        LocalDateTime now = LocalDateTime.now(); // data e hora
        DateTimeFormatter dataFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato da data
        DateTimeFormatter horaFormater = DateTimeFormatter.ofPattern("HH:mm:ss"); // formato da hora

        // Formatação da data e hora
        String data = dataFormater.format(now);
        String hora = horaFormater.format(now);

        String log = this.logger.getName() + " data " + data + " às " + hora + " - "; // formatação do log

        printLog.printLog(log, lista); // chamando interface para impressão
    }
}