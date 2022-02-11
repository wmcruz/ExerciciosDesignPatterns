package teachingPdf.factoryMethod.tresPontoDois.implementacao;

import teachingPdf.factoryMethod.tresPontoDois.abstracao.Arquivo;
import teachingPdf.factoryMethod.tresPontoDois.abstracao.LerArquivo;

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