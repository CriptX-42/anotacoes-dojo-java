package ZZHDesignPatterns.test;

import ZZHDesignPatterns.domain.Pessoa;

public class BuilderTest01 {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaBuilder()
                .nome("Ricardo")
                .sobrenome("Carvalho")
                .email("ricardo-svc@live.com")
                .userName("Criptx-42")
                .build();
        
    }

}
