package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.implementacaoSaidaArquivoTXT;

import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.Logger;

import javax.swing.*;

/**
 * @Description
 * Classe responsável por abstrair parte do sistema para
 * criação um arquivo de texto.
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public class MainArquivoTXT {

    public static void main(String[] args) {
        String mensagem = JOptionPane.showInputDialog(null, "Informe uma mensagem a ser gravada em um arquivo de texto:");

        Logger logger = new LoggerArquivoTXT();
        logger.log(mensagem);
    }
}
