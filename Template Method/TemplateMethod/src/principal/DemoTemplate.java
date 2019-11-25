package principal;

import template.BebidaQuente;
import template.Cafe;
import template.Cha;

public class DemoTemplate {
	
	public static void main(String[] args) {
		
		
		System.out.println("Fazendo o CAFÉ");
		
		BebidaQuente bebida = new Cafe();
		bebida.fazerBebida();
		
		System.out.println("-----------------------------");
		
		System.out.println("Fazendo o CHÁ");
		bebida = new Cha();
		bebida.fazerBebida();
	}

}
