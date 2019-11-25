package template;

public class Cafe extends BebidaQuente {

	@Override
	public void ferverAgua() {
		System.out.println("Fervendo Água");
		
	}

	@Override
	public void despejarXicara() {
		System.out.println("Despeijando água quente em uma Xícara");
		
	}

	@Override
	public void adicionaingrediente() {
		System.out.println("Adicionando Grãos de Café");
		
	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionado Leite e Açúcar ao café");
		
	}

}
