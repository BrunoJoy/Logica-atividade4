
public class Responsavel {
	private String nome;
	private String contato;
	private double valorHoraTrabalhada;
	
	public Responsavel(String nome, String contato, double valorHoraTrabalhada) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
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

	public double getValorHoraTrabalhada() {
		return valorHoraTrabalhada;
	}

	public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	
}
