package ZZClambda.dominio;

public class Jogos {
    private String title;
    private int quatidade;

    public Jogos(String title, int quatidade) {
        this.title = title;
        this.quatidade = quatidade;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "title='" + title + '\'' +
                ", quatidade=" + quatidade +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getQuatidade() {
        return quatidade;
    }
}
