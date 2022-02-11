package exerciciosBuilder.algaWorks.test;

import algaworks.builder.NotaFiscalBuilder;
import algaworks.builder.model.NotaFiscal;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class BuilderNotaFiscalExercicioAlgaWorksTest {

    @Test
    public void calcularNotaFiscalPessoaFisicaComNumeroComDataString() throws ParseException {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .dePessoaFisica()
                .comNumero(123456)
                .comData("22/11/2020")
                .comProduto("Celular Asus", 2, 2408.00)
                .comProduto("Capa celular asus", 2, 50.0)
                .builder();

        BigDecimal valorTotal = notaFiscal.getValorTotal();
        BigDecimal valorComDesconto = valorTotal.subtract(notaFiscal.calculoImposto(valorTotal));

        Assert.assertEquals(new BigDecimal(4916).doubleValue(), valorTotal.doubleValue(), 0.001);
        Assert.assertEquals(new BigDecimal(4571.88).doubleValue(), valorComDesconto.doubleValue(), 0.001);
    }

    @Test
    public void calcularNotaFiscalPessoaFisicaSemNumeroComData() {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .dePessoaFisica()
                .comData(new Date())
                .comProduto("Celular Asus", 2, 2408.00)
                .comProduto("Capa celular asus", 2, 50.0)
                .builder();

        BigDecimal valorTotal = notaFiscal.getValorTotal();
        BigDecimal valorComDesconto = valorTotal.subtract(notaFiscal.calculoImposto(valorTotal));

        Assert.assertEquals(new BigDecimal(4916).doubleValue(), valorTotal.doubleValue(), 0.001);
        Assert.assertEquals(new BigDecimal(4571.88).doubleValue(), valorComDesconto.doubleValue(), 0.001);
    }

    @Test
    public void calcularNotaFiscalJuridicaSemNumeroComData() {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .dePessoaJuridica()
                .comData(new Date())
                .comProduto("Notebook Asus VivoBook", 2, "3150.50")
                .comProduto("Memoria Ram DDR4 Notebook", 1, 544.00)
                .builder();

        BigDecimal valorTotal = notaFiscal.getValorTotal();
        BigDecimal valorComDesconto = valorTotal.subtract(notaFiscal.calculoImposto(valorTotal));

        Assert.assertEquals(new BigDecimal(6845).doubleValue(), valorTotal.doubleValue(), 0.001);
        Assert.assertEquals(new BigDecimal(6571.20).doubleValue(), valorComDesconto.doubleValue(), 0.001);
    }
}
