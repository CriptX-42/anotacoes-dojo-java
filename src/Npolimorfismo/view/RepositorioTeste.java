package Npolimorfismo.view;

import Npolimorfismo.domain.Computador;
import Npolimorfismo.domain.Tomate;
import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.CalculadoraImposto;
import Npolimorfismo.servico.RepositorioArquivo;
import Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repo1 = new RepositorioArquivo();
        Repositorio repo2 = new RepositorioMemoria();
        Repositorio repo3 = new RepositorioArquivo();
        repo1.salvar();
    }
}
