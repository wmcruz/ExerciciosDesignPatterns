package algaworks.builder.model;

import java.math.BigDecimal;
import java.util.Properties;

public class Produto {
    // atributes
    private String nome;
    private Integer quantidade;
    private BigDecimal valorUnitario;

    // constructor
    public Produto(String nome, Integer quantidade, BigDecimal valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}