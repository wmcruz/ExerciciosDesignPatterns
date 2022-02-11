package teachingPdf.factoryMethod.tresPontoUm;

import teachingPdf.factoryMethod.tresPontoUm.abstracao.GeraNome;
import teachingPdf.factoryMethod.tresPontoUm.abstracao.Nome;
import teachingPdf.factoryMethod.tresPontoUm.implementacao.ConsoleBuildNomeSobrenome;
import teachingPdf.factoryMethod.tresPontoUm.implementacao.ConsoleBuildSobrenomeNome;

public class MainNomeSobrenome {
    public static void main(String[] args) {
        Nome nome = new Nome("Wellington Max", "Cruz");

        GeraNome geraNomeSobrenome = new ConsoleBuildNomeSobrenome();
        geraNomeSobrenome.printConsole(nome);

        GeraNome geraSobrenomeNome = new ConsoleBuildSobrenomeNome();
        geraSobrenomeNome.printConsole(nome);
    }
}