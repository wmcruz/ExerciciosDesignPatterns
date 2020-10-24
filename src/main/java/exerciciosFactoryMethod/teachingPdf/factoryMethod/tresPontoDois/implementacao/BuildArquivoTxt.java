package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.implementacao;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.abstracao.Arquivo;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.abstracao.LerArquivo;

import java.util.Optional;

public class BuildArquivoTxt extends Arquivo {

    public BuildArquivoTxt(Optional<String> senha) {
        super(senha);
    }

    @Override
    protected LerArquivo leituraArquivo() {
        return new LerArquivoTxt();
    }
}