package Associacao.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void imprime() {
        if(jogadores == null) return;
        System.out.println(this.nome);

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
