import java.time.LocalTime;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Responsavel responsavel = new Responsavel("Rafael Oliveira", "995664212", 50.50);
		Palestrante palestrante1 = new Palestrante("Otavio Batista", "95128686", 100.99);
		Palestrante palestrante2 = new Palestrante("Roberto Silva", "96178656", 150.00);
		Palestrante palestrante3 = new Palestrante("Maria Catarina", "92125681", 73.31);
		
		Palestra[] palestras = new Palestra[4];
		palestras[0] = new Palestra("Como programar OO", "Ensinar como programar em orientação a objeto", LocalTime.now(), 4, palestrante1);
		palestras[1]  = new Palestra("Backend X Frontend", "Qual a diferença nas carreiras entre Backend e Frontend", LocalTime.now(), 3, palestrante2);
		palestras[2]  = new Palestra("Bancos SQL X NO SQL", "Quando suar bancos SQL e NO SQL", LocalTime.now(), 5, palestrante3);
		palestras[3]  = new Palestra("Empreendedorismo em TI", "Como empreender no mercado de TI", LocalTime.now(), 2, palestrante1); 
		
		Evento evento = new Evento("SITI - Simposio em TI", Calendar.getInstance(), Calendar.getInstance(), 20, palestras, responsavel);
		
		System.out.println("O evento "+evento.getNome()+" teve o gasto de "+evento.calculaValorGastoResponsavel()+ " com o responsável "+ evento.getResponsavel());
		System.out.println("O evento "+evento.getNome()+" teve um gasto total com palestra de "+evento.calculaValorGastoPalestras());
		System.out.println("O evento "+evento.getNome()+" teve um gasto com a palestra "+ evento.getPalestras()[1].getTitulo() +" o valor de "+evento.calculaValorGastoPalestra(11));
		System.out.println("O evento "+evento.getNome()+" teve um gasto com a palestra "+ evento.getPalestras()[1].getTitulo() +" o valor de "+evento.calculaValorGastoPalestra(1));
		System.out.println("O evento "+evento.getNome()+" teve o menor gasto com o palestrante "+ evento.calculaPalestranteComMenorValor().getNome());
		System.out.println("O evento "+evento.getNome()+" teve o maior gasto com o palestrante "+ evento.calculaPalestranteComMaiorValor().getNome());
	}

}
