package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.abstracao.Arquivo;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.implementacao.BuildArquivoTxt;

public class MainLeituraArquivo {
    public static void main(String[] args) {
        Arquivo arquivo = new BuildArquivoTxt(java.util.Optional.of(""));
        arquivo.exibeTexto();
    }
}