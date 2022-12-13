package trabalho.m;

public class Paciente extends Pessoa {
	private int CPF;
	
	public Paciente(String nome,
					int idade,
					String logradouro,
					String cidade,
					String numero,
					int CPF){
		super(nome, idade, logradouro, cidade, numero);
		this.CPF = CPF;
	}

	public int getCPF(){
		return this.CPF;
	}
}
