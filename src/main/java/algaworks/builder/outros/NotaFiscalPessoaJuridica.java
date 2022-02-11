package algaworks.builder.outros;

import algaworks.builder.model.NotaFiscal;

import java.math.BigDecimal;

public class NotaFiscalPessoaJuridica extends NotaFiscal {
    private static final BigDecimal porcentagem = new BigDecimal("0.04");

    @Override
    public BigDecimal calculoImposto(BigDecimal valor) {
        return valor.multiply(porcentagem);
    }
}
