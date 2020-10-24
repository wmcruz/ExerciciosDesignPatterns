package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.implementacao;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.Nome;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.PrintNome;

public class PrintSobrenomeNome implements PrintNome {
    @Override
    public void printNome(Nome nome) {
        System.out.println(nome.getSobreNome() + ", " + nome.getNome());
    }
}