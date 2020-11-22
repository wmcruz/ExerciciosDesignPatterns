package exerciciosBuilder.algaWorks.main;

import exerciciosBuilder.algaWorks.builder.NotaFiscalBuilder;
import exerciciosBuilder.algaWorks.model.NotaFiscal;

import java.text.ParseException;

public class Principal {

    public static void main(String[] args) throws ParseException {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .dePessoaFisica()
                .comData("22/11/2020")
                .comProduto("Celular Asus", 2, 2408.00)
                .comProduto("Capa celular asus", 2, 50.0)
                .builder();

        System.out.println("Valor Total da NF: " + notaFiscal.getValorTotal());
    }
}