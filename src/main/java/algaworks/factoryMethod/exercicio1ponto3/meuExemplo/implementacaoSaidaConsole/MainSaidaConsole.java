package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.implementacaoSaidaConsole;

import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.Logger;

import javax.swing.*;

/**
 * @Description
 * Classe responsável por abstrair parte do sistema
 * onde será criado um log, seja no servidor web ou na IDE.
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public class MainSaidaConsole {
    public static void main(String[] args) {
        String mensagem = JOptionPane.showInputDialog(null, "Digite uma mensagem para sair no console:");

        Logger logger = new LoggerConsoleCreator();
        logger.log(mensagem);
    }
}
