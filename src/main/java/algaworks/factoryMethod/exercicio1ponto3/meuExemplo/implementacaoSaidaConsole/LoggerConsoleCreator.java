package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.implementacaoSaidaConsole;

import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.LogPrinter;
import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.Logger;

/**
 * @Description
 * Classe responsável por chamar de fato a classe que irá
 * imprimir os logs no sistema.
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public class LoggerConsoleCreator extends Logger {

    @Override
    protected LogPrinter createLogger() {
        return new LogPrinterConsole();
    }
}
