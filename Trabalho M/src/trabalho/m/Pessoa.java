package trabalho.m;

public class Pessoa {
    private String nome;
    private int idade;
    private String logradouroCompleto;
    private String cidade;
    private String numeroDeTelefone;
	
	public Pessoa(String nome,
			int idade,
			String logradouro,
			String cidade,
			String numero){
		this.nome = nome;
		this.idade = idade;
		this.logradouroCompleto = logradouro;
		this.cidade = cidade;
		this.numeroDeTelefone = numero;
	}
	
	public String getNome(){
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	public String getLogradouro(){
		return this.logradouroCompleto;
	}
	public String getCidade(){
		return this.cidade;
	}
	public String getNumero(){
		return this.numeroDeTelefone;
	}
}