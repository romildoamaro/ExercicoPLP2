package exercicio;

public class Funcionarios {

	private String nome;
    private String sobrenome;
    private double salario;
    private double salarioMedio;
    
    public Funcionarios(String nome, String sobrenome, double salario, double salarioMedio) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.salarioMedio = salarioMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(double salarioMedio) {
        this.salarioMedio = salarioMedio;
    } 
}
