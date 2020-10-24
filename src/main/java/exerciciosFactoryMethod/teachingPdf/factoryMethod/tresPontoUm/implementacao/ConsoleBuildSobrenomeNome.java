package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.implementacao;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.GeraNome;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.PrintNome;

public class ConsoleBuildSobrenomeNome extends GeraNome {
    @Override
    protected PrintNome printNome() {
        return new PrintSobrenomeNome();
    }
}