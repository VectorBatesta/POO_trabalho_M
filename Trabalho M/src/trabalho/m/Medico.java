package trabalho.m;

public class Medico extends Pessoa {
	private String CRM;
	
	public Medico(	String nome,
					int idade,
					String logradouro,
					String cidade,
					String numero,
					String CRM){
		super(nome, idade, logradouro, cidade, numero);
		this.CRM = CRM;
	}
}
