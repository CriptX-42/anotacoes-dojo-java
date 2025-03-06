package ZZZDoptional.dominio;

public class Jogos {
    private Integer id;
    private String title;
    private int qtdade;

    public Jogos(Integer id, String title, int qtdade) {
        this.id = id;
        this.title = title;
        this.qtdade = qtdade;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", qtdade=" + qtdade +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQtdade(int qtdade) {
        this.qtdade = qtdade;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQtdade() {
        return qtdade;
    }
}
