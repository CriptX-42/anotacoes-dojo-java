package Npolimorfismo.servico;

import Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Savando em memória");
    }
}
