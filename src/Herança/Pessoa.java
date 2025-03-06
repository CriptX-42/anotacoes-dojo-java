package Herança;

public class Pessoa {
    public String nome;
    public String cpf;
    private Endereco endereco;


    public Pessoa(String nome) {
        this.nome = nome;
    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
