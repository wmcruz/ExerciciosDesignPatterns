package teachingPdf.factoryMethod.tresPontoUm.implementacao;

import teachingPdf.factoryMethod.tresPontoUm.abstracao.GeraNome;
import teachingPdf.factoryMethod.tresPontoUm.abstracao.PrintNome;

public class ConsoleBuildSobrenomeNome extends GeraNome {
    @Override
    protected PrintNome printNome() {
        return new PrintSobrenomeNome();
    }
}