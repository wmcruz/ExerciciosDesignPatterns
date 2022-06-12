package algaworks.factoryMethod.exercicio1ponto3.meuExemplo.implementacaoSaidaConsole;

import algaworks.factoryMethod.exercicio1ponto3.meuExemplo.abstracao.LogPrinter;

/**
 * @Description
 * Classe responsável por criar de fato o logger no sistema.
 *
 * @Author wellington cruz
 * @Since 12/06/2022
 */
public class LogPrinterConsole implements LogPrinter {
    @Override
    public void print(String mensagem) {
        // aqui foi utilizado um print out, mas poderia ser utilizado um logger
        System.out.println(mensagem);
    }
}
