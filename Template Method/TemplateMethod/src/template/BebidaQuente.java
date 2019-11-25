package template;

public abstract class BebidaQuente {
	
	public abstract void ferverAgua();
	public abstract void despejarXicara();
	public abstract void adicionaingrediente();
	public abstract void adicionarCondimentos();
	
	//templatemethod
	public final void fazerBebida() {
		
		//Inicio do Processo
		ferverAgua();
		
		despejarXicara();
		
		adicionaingrediente();
		
		adicionarCondimentos();
		
	}


}
