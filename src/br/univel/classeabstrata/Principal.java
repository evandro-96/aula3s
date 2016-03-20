package br.univel.classeabstrata;

import java.util.LinkedList;
import java.util.List;

class Principal {
	public static void main(String[] args) {
		List<DesenhoAbstrato> lista = new LinkedList<>();
		
		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
		lista.add(new ExD());

		lista.add(new ExE());
		lista.add(new ExF());

		lista.add(new ExJ());
		lista.add(new ExM());
		
		
		for (DesenhoAbstrato d : lista) {
			d.executar();
		}
	}
}
