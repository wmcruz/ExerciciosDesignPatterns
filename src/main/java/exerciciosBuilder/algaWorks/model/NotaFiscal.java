package exerciciosBuilder.algaWorks.model;

import java.util.Date;
import java.util.List;

public class NotaFiscal {
    //attributes
    private Long numeroNotaFiscal;
    private Date dataEmissao;
    private List<ItensProdutos> itensProdutos;
    private Pessoa pessoa;

    // getters and setters
    public Long getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(Long numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public List<ItensProdutos> getItensProdutos() {
        return itensProdutos;
    }

    public void setItensProdutos(List<ItensProdutos> itensProdutos) {
        this.itensProdutos = itensProdutos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}