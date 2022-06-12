package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.implementacaoSaidaArquivoTXT;

import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.LogPrinter;
import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.Logger;

/**
 * @Description
 * Classe de extenção de Logger, responsável por chamar
 * a criação classe implementadora de logger. Neste exemplo
 * a criação de um arquivo de texto!
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public class LoggerArquivoTXT extends Logger {
    @Override
    protected LogPrinter createLogger() {
        return new LogPrintArquivoTXT();
    }
}
