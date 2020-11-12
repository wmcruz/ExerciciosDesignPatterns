package exerciciosBuilder.algaWorks.outros;

import exerciciosBuilder.algaWorks.model.NotaFiscal;

public abstract class CalculoDescontoNF {
    protected abstract GeraCalculoDescontoNF geraCalculoDescontoNF();

    public void calculoDescontoNF() {
        GeraCalculoDescontoNF geraCalculoDescontoNF = geraCalculoDescontoNF();

        NotaFiscal notaFiscal  = new NotaFiscal();
    }
}