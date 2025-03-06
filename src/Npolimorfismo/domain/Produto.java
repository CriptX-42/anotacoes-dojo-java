package Npolimorfismo.domain;

public class Produto implements Taxavel {
    protected String nome;
    protected Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
