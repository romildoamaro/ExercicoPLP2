package exercicio;

public class Aluno {

	public String nome;
	double nota1;
	double nota2;
	double nota3;
	double notaFinal;
	public String situacao;
	double pontosRestantes;
	
	Aluno(String nome, double nota1, double nota2, double nota3, double notaFinal, String situacao, double pontosRestantes){
	
	this.nome = nome;
	this.nota1 = nota1;
	this.nota2 = nota2;
	this.nota3 = nota3;
	this.notaFinal = notaFinal;
	this.situacao = situacao;
	this.pontosRestantes = pontosRestantes;
	
}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public double getPontosRestantes() {
		return pontosRestantes;
	}
	public void setPontosRestantes(double pontosRestantes) {
		this.pontosRestantes = pontosRestantes;
	}
	
	
}
