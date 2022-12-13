package trabalho.m;

import java.util.ArrayList;

public abstract class Setor implements ISetor {
	ArrayList<Consulta> listaConsultas;
	ArrayList<Pessoa> listaPessoas;
	
	public Setor(){
		this.listaConsultas = new ArrayList<Consulta>();
		this.listaPessoas = new ArrayList<Pessoa>();
	}
	
	public void registraPessoa(Pessoa nova){
		this.listaPessoas.add(nova);
	}

	public void inserir(Consulta novaConsulta){
		this.listaConsultas.add(novaConsulta);
	}
	
	public void alterar(Consulta consulta){
		int indexAchado = pesquisarConsultaNaLista(consulta);
		if (indexAchado != -1){
			listaConsultas.remove(indexAchado);
			listaConsultas.add(consulta);	
		}
		else 
			System.out.println("Usuario nao encontrado\n\n");
	}
	
	public void deletar(Consulta consultaParaDeletar){
		int index = pesquisarConsultaNaLista(consultaParaDeletar);
		listaConsultas.remove(index);
	}
	
	public int pesquisarConsultaNaLista(Consulta consultaParaPesquisar){
		int cpfParaPesquisar = consultaParaPesquisar.getCPFPaciente();
		int index = 0;
		for (Consulta i : listaConsultas){
			if (i.getCPFPaciente() == cpfParaPesquisar){
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public Pessoa pesquisarPessoaNaLista(String nomeParaPesquisar){
		int index = 0;
		for (Pessoa i : listaPessoas){
			if (i.getNome().equals(nomeParaPesquisar)){
				return listaPessoas.get(index);
			}
			index++;
		}
		return null;
	}

}