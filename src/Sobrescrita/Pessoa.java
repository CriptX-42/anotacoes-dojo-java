package Sobrescrita;

public class Pessoa {
    public String nome;

    @Override
    public String toString(){
        return "Pessoa" + " " + this.nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
