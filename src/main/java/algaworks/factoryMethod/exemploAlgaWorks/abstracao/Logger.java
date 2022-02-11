package algaworks.factoryMethod.exemploAlgaWorks.abstracao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Logger {

    private java.util.logging.Logger logger = java.util.logging.Logger.getLogger("[LOGGER] => ");

    protected abstract LogPrinter createLogger();

    public void log(String message) {
        LogPrinter logPrinter = createLogger();

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = dateFormatter.format(now);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hour = timeFormatter.format(now);

        logPrinter.print(this.logger.getName() + date + " as " + hour + ": " + message);
    }
}