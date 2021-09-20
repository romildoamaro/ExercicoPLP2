package exercicio;

public class Funcionario {

	private String nome;
    private double salarioBruto;
    private double imposto;
    private double salarioLiquido;
    private double aumentarSalario;
    private double dadosAtualizados;
    
    public Funcionario(String nome, double salarioBruto, double imposto, double salarioLiquido, 
           double aumentarSalario, double dadosAtualizados){
        
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.salarioLiquido = salarioLiquido;
        this.aumentarSalario = aumentarSalario;
        this.dadosAtualizados = dadosAtualizados;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getAumentarSalario() {
        return aumentarSalario;
    }

    public void setAumentarSalario(double aumentarSalario) {
        this.aumentarSalario = aumentarSalario;
    }

    public double getDadosAtualizados() {
        return dadosAtualizados;
    }

    public void setDadosAtualizados(double dadosAtualizados) {
        this.dadosAtualizados = dadosAtualizados;
    }
}
