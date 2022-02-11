package algaworks.factoryMethod.meuExemplo;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public abstract class GeraLog {
    private Logger logger;
    private LocalDateTime data;

    protected GeraLog(Class classe) {
        this.logger = Logger.getLogger(classe.getName());
        this.data = LocalDateTime.now();
    }

    public abstract void gerarLogger();

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}