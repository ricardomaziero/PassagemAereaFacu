package passagensAereas;

public class Passagem {

	public String Destino;
	public double Valor;

	public void passagemSP() {
		Destino = "São Paulo";
		Valor = 500.00;
	}

	public void passagemRJ() {
		Destino = "Rio de Janeiro";
		Valor = 600.00;
	}

	public void passagemSC() {
		Destino = "Florianópolis";
		Valor = 700.00;
	}

}
