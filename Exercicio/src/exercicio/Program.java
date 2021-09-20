package exercicio;

import javax.swing.JOptionPane;

public class Program {

	public static int Aluno;
    public static int Funcionarios;
    public static int Retangulo;
    public static int Pessoas;
    public static int Funcionario;
	
	
	public static void main(String[] args) {
		
		
    Aluno aluno1 = new Aluno("Gilson Damaso", 27.00, 31.00, 32.00, 90.00, "Aprovado", 8.00);
    Aluno aluno2 = new Aluno("Miguel Sales", 17.00, 20.00, 15.00, 52.00, "Reprovado", 8.00);
		
	JOptionPane.showMessageDialog(null, "Nome: " + aluno1.getNome() + " " + "\nPrimeira nota: " 
	+ aluno1.getNota1() + " " + "\nSegunda nota: " + aluno1.getNota2() + " " + "\nTerceira nota: " 
	+ aluno1.getNota3() + " " + "\nNota final: " + aluno1.getNotaFinal() + " " + "\nSituação: " 
	+ aluno1.getSituacao());
              
	JOptionPane.showMessageDialog(null, "Nome: " + aluno2.getNome() + " " + "\nPrimeira nota: " 
	+ aluno2.getNota1() + " " + "\nSegunda nota: " + aluno2.getNota2() + " " + "\nTerceira nota: " 
	+ aluno2.getNota3() + " " + "\nNota final: " + aluno2.getNotaFinal() + " " + "\nSituação: " 
	+ aluno2.getSituacao() + " " + "\nFaltaram: " + aluno2.getPontosRestantes()+ " Pontos");
       
       
        
        Funcionarios funcionario1 = new Funcionarios("Carlos", "Silva", 6300.00, 6500.00);
        Funcionarios funcionario2 = new Funcionarios("Ana", "Marques", 6700.00, 6500.00);
        
       JOptionPane.showMessageDialog(null, "Nome do Funcionario: " + funcionario1.getNome() 
       + " " + funcionario1.getSobrenome() + "\nSalario: " + funcionario1.getSalario());
       JOptionPane.showMessageDialog(null, "Nome do Funcionario: " + funcionario2.getNome() 
       + " " + funcionario2.getSobrenome() + "\nSalario: " + funcionario2.getSalario());
       JOptionPane.showMessageDialog(null, "Salario Medio: " + funcionario1.getSalarioMedio());
        
       
       
            
        Retangulo retangulo = new Retangulo(3.00, 4.00, 12.00, 14.00, 5.00);
            
        JOptionPane.showMessageDialog(null, "Valor da Largura: " + retangulo.getLargura() 
        + " " + "\nValor da Altura: " + retangulo.getAltura()); 
        
        JOptionPane.showMessageDialog(null, "Area: " + retangulo.getArea() 
        + " " + "\nPerimetro: " + retangulo.getPerimetro() + " " 
        + "\nDiagonal: " + retangulo.getDiagonal());
      
      
        Pessoas pessoa1 = new Pessoas("Maria", 17, "Maria");
        Pessoas pessoa2 = new Pessoas("Joao", 16, "Maria");
		
        JOptionPane.showMessageDialog(null, "Nome: " + pessoa1.getNome() + " " + "\nIdade: " + pessoa1.getIdade());
        JOptionPane.showMessageDialog(null, "Nome: " + pessoa2.getNome() + " " + "\nIdade: " + pessoa2.getIdade());
        JOptionPane.showMessageDialog(null, "Pessoa mais velha: " + pessoa1.getPessoaMaisVelha());
        
       
            
        Funcionario funcionario = new Funcionario("Joao Silva", 6000.00, 1000.00, 5000.00, 10.0, 5600.00);
                
        JOptionPane.showMessageDialog(null,"Nome: " + funcionario.getNome() + " " 
                + "\nSalario Bruto: " + funcionario.getSalarioBruto() + " " 
                + "\nImpostos: " + funcionario.getImposto());
        JOptionPane.showMessageDialog(null,"Nome: " + funcionario.getNome() + " " 
                + "\nSalario Liquido: " + funcionario.getSalarioLiquido());
        JOptionPane.showMessageDialog(null,"Nome: " + funcionario.getNome() + " " 
                + "\nSalario bruto: " + funcionario.getSalarioBruto() + " " + "\nImpostos: " 
                + funcionario.getImposto() + " " + "\nSalario liquido: " 
                + funcionario.getSalarioLiquido() + " " + "\nPorcentagem para aumento: " + funcionario.getAumentarSalario() + " " 
                + "\nDados atualizados: " + funcionario.getNome() + " , " + funcionario.getDadosAtualizados());
       
	}
	
	
	
}
