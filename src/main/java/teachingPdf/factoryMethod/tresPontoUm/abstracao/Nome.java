package teachingPdf.factoryMethod.tresPontoUm.abstracao;

public class Nome {
    // attributes
    private String nome;
    private String sobreNome;

    // constructor
    public Nome(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}