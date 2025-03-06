package NInterfaces.Dominio;

public class DatabaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco");
    }
}
