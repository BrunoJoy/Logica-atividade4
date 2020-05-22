import java.util.Calendar;

public class Evento {
	
	private String nome;
	private Calendar dataInicio;
	private Calendar dataFim;
	private int cargaHorariaTotal;
	private Palestra[] palestras;
	private Responsavel  responsavel;
	
	public Evento(String nome, Calendar dataInicio, Calendar dataFim, int cargaHorariaTotal, Palestra[] palestras,
			Responsavel responsavel) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cargaHorariaTotal = cargaHorariaTotal;
		this.palestras = palestras;
		this.responsavel = responsavel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public int getCargaHorariaTotal() {
		return cargaHorariaTotal;
	}

	public void setCargaHorariaTotal(int cargaHorariaTotal) {
		this.cargaHorariaTotal = cargaHorariaTotal;
	}

	public Palestra[] getPalestras() {
		return palestras;
	}

	public void setPalestras(Palestra[] palestras) {
		this.palestras = palestras;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	public double calculaValorGastoResponsavel()
	{
		return cargaHorariaTotal * responsavel.getValorHoraTrabalhada();
	}
	
	public double calculaValorGastoPalestras() {
		
		double totalGastoPalestra = 0;
		for(int i = 0; i < palestras.length; i++)
		{
			totalGastoPalestra = totalGastoPalestra + calculaValorGastoPalestra(i);;
		}
		return totalGastoPalestra;
	}
	
	public double calculaValorGastoPalestra(int index)
	{
		if(index < 0 || index >= palestras.length)
		{
			System.out.println("Index "+index+" invalido"+" digite um valor entre 0 e "+(palestras.length - 1));
			return -1;
		}
		return palestras[index].calculaValorPalestra();
	}
	
	public Palestrante calculaPalestranteComMaiorValor() {
		
		Palestra palestraMaiorValor = palestras[0];
		
		for(int i = 1; i < palestras.length; i++)
		{
			if(palestras[i].calculaValorPalestra() > palestraMaiorValor.calculaValorPalestra() )
			{
				palestraMaiorValor = palestras[i];
			}
		}
		return palestraMaiorValor.getPalestrante();
	}
	
	public Palestrante calculaPalestranteComMenorValor() {
		
		Palestra palestraMaiorValor = palestras[0];
		
		for(int i = 1; i < palestras.length; i++)
		{
			if(palestras[i].calculaValorPalestra() < palestraMaiorValor.calculaValorPalestra() )
			{
				palestraMaiorValor = palestras[i];
			}
		}
		return palestraMaiorValor.getPalestrante();
	}
	
	
}
