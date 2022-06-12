package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * Classe abstrata de loggers.
 * Ela é responsável por capturar a data, hora e anexar a mensagem de log de saída.
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public abstract class Logger {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("[LOGGER] => ");

    // Implementação de interface de criação de log
    protected abstract LogPrinter createLogger();

    // Método funcional e abstrato a captura de log e mensagem
    public void log(String mensagem) {
        LogPrinter logger = createLogger();

        String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        logger.print(this.logger.getName() + data + " as " + hora + " => Mensagem: " + mensagem);
    }
}
