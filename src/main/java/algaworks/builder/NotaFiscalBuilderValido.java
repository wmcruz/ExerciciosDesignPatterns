package algaworks.builder;

import algaworks.builder.model.NotaFiscal;
import algaworks.builder.model.Produto;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NotaFiscalBuilderValido {

    private NotaFiscal instancia;

    public NotaFiscalBuilderValido(NotaFiscal instancia) {
        this.instancia = instancia;
    }

    public NotaFiscalBuilderValido comNumero(Integer numero) {
        this.instancia.setNumero(numero);
        return this;
    }

    public NotaFiscalBuilderValido comData(Date data) {
        this.instancia.setDataDeEmissao(data);
        return this;
    }

    public NotaFiscalBuilderValido comData(String data) throws ParseException {
        SimpleDateFormat format  = new SimpleDateFormat("dd/MM/yyyy");
        this.instancia.setDataDeEmissao(new Date(format.parse(data).getTime()));
        return this;
    }

    public NotaFiscalBuilderValido comProduto(String nome, Integer quantidade, BigDecimal valorUnitario) {
        Produto produto = new Produto(nome, quantidade, valorUnitario);

        if (this.instancia.getProdutos() == null)
            this.instancia.setProdutos(new ArrayList<>());

        this.instancia.getProdutos().add(produto);

        return this;
    }

    public NotaFiscalBuilderValido comProduto(String nome, Integer quantidade, Double valorUnitario) {
        return this.comProduto(nome, quantidade, new BigDecimal(valorUnitario));
    }

    public NotaFiscalBuilderValido comProduto(String nome, Integer quantidade, String valorUnitario) {
        return this.comProduto(nome, quantidade, new BigDecimal(valorUnitario));
    }

    public NotaFiscal builder() {
        return instancia;
    }
}