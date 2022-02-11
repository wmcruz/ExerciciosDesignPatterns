package teachingPdf.factoryMethod.tresPontoTres.implementacao.arquivo;

import teachingPdf.factoryMethod.tresPontoTres.abstracao.PrintLog;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PrintLogArquivo implements PrintLog {
    @Override
    public void printLog(String log, List<Integer> lista) {
        try {
            FileWriter arquivo = new FileWriter(".\\src\\main\\resources\\3.3-Exercicio.txt");

            PrintWriter printWriter = new PrintWriter(arquivo);

            lista.forEach((Integer numero) -> printWriter.println("" + log + numero));

            arquivo.close();
        } catch (IOException e) {
            throw new RuntimeException("[Erro 01] - Erro ao acessar caminho. Erro: " + e.getMessage());
        }
    }
}
