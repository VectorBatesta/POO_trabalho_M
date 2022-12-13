package trabalho.m;

import java.util.Date;

public class Consulta {
	private Date data;
	private Paciente paciente;
	private Medico medico;
	
	private int gravidade;
	
	public Consulta(
			Date data,
			Paciente paciente,
			Medico medico,
			int gravidade){
		this.data = data;
		this.paciente = paciente;
		this.medico = medico;
		this.gravidade = gravidade;
	}
	
	public int getCPFPaciente(){
		return this.paciente.getCPF();
	}
}