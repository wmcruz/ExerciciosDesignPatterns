package algaworks.builder.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public abstract class NotaFiscal {
    // atributes
    private Integer numero;
    private Date dataDeEmissao;
    private List<Produto> produtos;

    public abstract BigDecimal calculoImposto(BigDecimal valor);

    public BigDecimal getValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (Produto produto : produtos) {
            valorTotal = valorTotal.add(produto.getValorUnitario().multiply(new BigDecimal(produto.getQuantidade())));
        }

        return valorTotal;
    }

    // getters and setters
    public Date getDataDeEmissao() {
        return dataDeEmissao;
    }

    public void setDataDeEmissao(Date dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produto) {
        this.produtos = produto;
    }
}