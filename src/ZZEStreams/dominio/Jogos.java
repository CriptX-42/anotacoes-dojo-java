package ZZEStreams.dominio;

import java.util.Objects;

public class Jogos {
    private String nome;
    private double Price;
    private Category category;

    public Jogos(String nome, double price) {
        this.nome = nome;
        Price = price;
    }

    public Jogos(String nome, double price, Category category) {
        this.nome = nome;
        Price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Jogos jogos)) return false;
        return Objects.equals(nome, jogos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "nome='" + nome + '\'' +
                ", Price=" + Price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return Price;
    }
}
