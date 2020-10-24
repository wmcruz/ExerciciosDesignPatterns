package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm;

import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.GeraNome;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.abstracao.Nome;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.implementacao.ConsoleBuildNomeSobrenome;
import exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoUm.implementacao.ConsoleBuildSobrenomeNome;

public class MainNomeSobrenome {
    public static void main(String[] args) {
        Nome nome = new Nome("Wellington Max", "Cruz");

        GeraNome geraNomeSobrenome = new ConsoleBuildNomeSobrenome();
        geraNomeSobrenome.printConsole(nome);

        GeraNome geraSobrenomeNome = new ConsoleBuildSobrenomeNome();
        geraSobrenomeNome.printConsole(nome);
    }
}