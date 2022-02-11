package algaworks.builder.outros;

import algaworks.builder.model.NotaFiscal;

import java.math.BigDecimal;

public class NotaFiscalPessoaFisica extends NotaFiscal {
    private static final BigDecimal porcentagem = new BigDecimal("0.07");

    @Override
    public BigDecimal calculoImposto(BigDecimal valor) {
        return valor.multiply(porcentagem);
    }
}