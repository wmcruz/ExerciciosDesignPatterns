package exerciciosFactoryMethod.teachingPdf.factoryMethod.tresPontoDois.abstracao;

import java.util.Optional;

public abstract class Arquivo {
    // attributes
    private Optional<String> senha;
    private String nomeArquivo;

    // constructor
    public Arquivo(Optional<String> senha) {
        this.senha = senha;
    }

    protected abstract LerArquivo leituraArquivo();

    public void exibeTexto() {
        LerArquivo arquivo = leituraArquivo();

        if (this.senha.isPresent() && this.senha.get().equals("designpatterns"))
            arquivo.lerArquivo("confidencial.txt");
        else
            arquivo.lerArquivo("publico.txt");
    }

    // getters and setters
    public Optional<String> getSenha() {
        return senha;
    }

    public void setSenha(Optional<String> senha) {
        this.senha = senha;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}