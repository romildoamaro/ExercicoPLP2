package exercicio;

public class Pessoas {

	 private String nome;
		private int idade;
		private String pessoaMaisVelha;
		
		public Pessoas(String nome, int idade, String pessoaMaisVelha) {
			this.nome = nome;
			this.idade = idade;
			this.pessoaMaisVelha = pessoaMaisVelha;
			
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getPessoaMaisVelha() {
			return pessoaMaisVelha;
		}
		public void setPessoaMaisVelha(String pessoaMaisVelha) {
			this.pessoaMaisVelha = pessoaMaisVelha;
		}
}
