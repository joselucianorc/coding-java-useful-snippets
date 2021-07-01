package br.com.joselucianorc.useful.snipets.designpatterns.gof.composite.problem;

import java.util.ArrayList;
import java.util.List;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.composite.ComponenteDeMaquina;
import lombok.Data;

@Data
public class Machine {
	protected List<ComponenteDeMaquina> componentes = new ArrayList<>();
	
	public static void main(String[] args) {		
		Machine m = new Machine();
		
		ComponenteDeMaquina componenteMaquina1 = new ComponenteDeMaquina();
		ComponenteDeMaquina componenteMaquina2 = new ComponenteDeMaquina();
		ComponenteDeMaquina componenteMaquina3 = new ComponenteDeMaquina();
		
		m.componentes.add(componenteMaquina1);
		m.componentes.add(componenteMaquina2);
		m.componentes.add(componenteMaquina3);
	}
	
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