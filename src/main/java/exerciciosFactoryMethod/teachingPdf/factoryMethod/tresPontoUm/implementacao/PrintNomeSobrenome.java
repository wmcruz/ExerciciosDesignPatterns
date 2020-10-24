package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.implementacao;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.Nome;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.PrintNome;

public class PrintNomeSobrenome implements PrintNome {
    @Override
    public void printNome(Nome nome) {
        System.out.println(nome.getNome() + " " + nome.getSobreNome());
    }
}