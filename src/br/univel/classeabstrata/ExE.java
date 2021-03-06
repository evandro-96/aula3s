package br.univel.classeabstrata;

/**
 * 
 * @author evandro
 *
 */

class ExE extends DesenhoAbstrato {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {

				if (coluna == 0 || coluna == ALTURA - 1 || linha == 0 || linha == ALTURA - 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

	@Override
	protected String getNome() {
		return "E";
	}

}
