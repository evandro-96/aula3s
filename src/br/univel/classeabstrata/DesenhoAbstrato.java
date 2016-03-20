package br.univel.classeabstrata;

public abstract class DesenhoAbstrato{

	public void identificar() {
		System.out.println("-----------------");
		System.out.println(getNome());
		System.out.println("-----------------");
		System.out.println("\n");
	}
	
	protected abstract String getNome();
	
	public void executar(){
		identificar();
		desenhar();
		
	}
	protected abstract void desenhar();
	
}
