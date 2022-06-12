package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.implementacaoSaidaArquivoTXT;

import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.LogPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description
 * Classe responsável por criar um arquivo de texto no sistema.
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public class LogPrintArquivoTXT implements LogPrinter {
    @Override
    public void print(String mensagem) {
        try {
            FileWriter arquivoTextoSaida = new FileWriter("/home/wmcruz/Documentos/loggerArquivoTXT.txt");
            PrintWriter printWriter = new PrintWriter(arquivoTextoSaida);

            printWriter.print(mensagem);

            arquivoTextoSaida.close();
        } catch (IOException e) {
            throw new RuntimeException("Erro na criação do arquivo de texto.\bErro: " + e);
        }
    }
}
