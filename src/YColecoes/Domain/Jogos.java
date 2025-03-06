package YColecoes.Domain;

import java.util.Objects;

public class Jogos implements Comparable<Jogos> {

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Jogos(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Jogos(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jogos jogos)) return false;
        return Double.compare(preco, jogos.preco) == 0 && quantidade == jogos.quantidade && Objects.equals(id, jogos.id) && Objects.equals(nome, jogos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco, quantidade);
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Jogos outroJogo) {
       return this.nome.compareTo(outroJogo.getNome());
    }
}
