package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.implementacao;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.abstracao.LerArquivo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LerArquivoTxt implements LerArquivo {
    @Override
    public void lerArquivo(String nomeArquivo) {
        try {
            Path path = Paths.get(this.getClass().getResource("/" + nomeArquivo).toURI());

            Files.lines(path).forEach(System.out::println);
        } catch (URISyntaxException u) {
            throw new RuntimeException("[ERRO 01] Erro ao obter caminho do arquivo: ", u);
        } catch (IOException i) {
            throw new RuntimeException("[ERRO 02] Erro ao ler arquivo: ", i);
        }
    }
}