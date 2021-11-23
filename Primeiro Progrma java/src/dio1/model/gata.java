package dio1.model;

public class gata {
	private String nome;
	private String cor;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "gata [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
}
