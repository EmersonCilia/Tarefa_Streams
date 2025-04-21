package br.com.emerson;

public class Pessoas {
    private String Nome;
    private String Sexo;

    public Pessoas(String Nome, String Sexo){
        this.Nome = Nome;
        this.Sexo = Sexo;
    }

    public Pessoas() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}

