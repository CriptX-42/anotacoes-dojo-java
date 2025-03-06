package ZZHDesignPatterns.domain;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String  userName;
    private String email;

    public Pessoa(String email, String userName, String sobrenome, String nome) {
        this.email = email;
        this.userName = userName;
        this.sobrenome = sobrenome;
        this.nome = nome;
    }


    public static final class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String userName;
        private String email;

        public PessoaBuilder() {
        }



        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(email, userName, sobrenome, nome);
        }
    }
}
