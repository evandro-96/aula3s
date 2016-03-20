package br.univel.classeabstrata;

class ExB extends DesenhoAbstrato {

	public static int ALTURA = 8;
	
	@Override
	public void desenhar() {
				
		int caracteres = ALTURA;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < caracteres; coluna++) {
				System.out.print("#");
			}
			caracteres--;
			System.out.print("\n");
		}
		
	}

	@Override
	protected String getNome() {
		return "B";
	}

}
