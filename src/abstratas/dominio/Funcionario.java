package abstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus(); // obrigatoriedade de implementação do 'calculaBonus'
    }

    public abstract void calculaBonus();

}
