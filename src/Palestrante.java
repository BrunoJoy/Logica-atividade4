
public class Palestrante {
	private String nome;
	private String contato;
	private double valorHoraPalestra;
	
	public Palestrante(String nome, String contato, double valorHoraPalestra) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.valorHoraPalestra = valorHoraPalestra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public double getValorHoraPalestra() {
		return valorHoraPalestra;
	}

	public void setValorHoraPalestra(double valorHoraPalestra) {
		this.valorHoraPalestra = valorHoraPalestra;
	}
	
	

}
