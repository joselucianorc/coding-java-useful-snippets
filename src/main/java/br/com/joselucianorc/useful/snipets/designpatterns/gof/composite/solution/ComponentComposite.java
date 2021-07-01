package br.com.joselucianorc.useful.snipets.designpatterns.gof.composite.solution;

import java.util.ArrayList;
import java.util.List;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.composite.ComponenteDeMaquina;

public class ComponentComposite {
	
	protected List<ComponenteDeMaquina> componentes = new ArrayList<>();
	
	public void addComponente(ComponenteDeMaquina componente) {
		componentes.add(componente);
	}
	
	public void removeComponente(ComponenteDeMaquina componente) {
		componentes.remove(componente);
	}
	
	public int count() {
		return componentes.size();
	}

}
