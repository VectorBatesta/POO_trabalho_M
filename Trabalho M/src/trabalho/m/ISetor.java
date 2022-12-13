package trabalho.m;

public interface ISetor {
	public abstract void inserir(Consulta novaConsulta);
	public abstract void alterar(Consulta consulta);
	public abstract void deletar(Consulta consultaParaDeletar);
}
