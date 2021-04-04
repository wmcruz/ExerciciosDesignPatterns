package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.arquivo.LogArquivo;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoTres.console.LogConsole;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClasse {

    public static void main(String[] args) {
        // processamento
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        List respostasCorretas = Arrays.asList("1", "2", "arquivo", "console"); // lista com as respostas corretas

        String resposta = JOptionPane.showInputDialog("Escolha uma opção:\n1 - arquivo\n2 - console"); // resposta do usuário

        // tratamento da resposta e redirecionamento para o processamento correto.
        if (!respostasCorretas.contains(resposta.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Opção Inválida!!");
        } else if (resposta.equalsIgnoreCase("1") || resposta.equalsIgnoreCase("arquivo")) {
            LogArquivo logArquivo = new LogArquivo();
            logArquivo.imprimeListaLog(numeros);
        } else if (resposta.equalsIgnoreCase("2") || resposta.equalsIgnoreCase("console")) {
            LogConsole logConsole = new LogConsole();
            logConsole.imprimeListaLog(numeros);
        }
    }
}
