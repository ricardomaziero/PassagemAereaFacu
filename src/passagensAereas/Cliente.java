package passagensAereas;

public class Cliente {
	
	private String Nome;
	private int Idade;
	private double Carteira;


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public double getCarteira() {
		return Carteira;
	}

	public void setCarteira(double carteira) {
		Carteira = carteira;
	}

	Cliente (String nome, int idade, double carteira) {
		this.Nome = nome;
		this.Idade = idade;
		this.Carteira = carteira;
	}
	
	

}
