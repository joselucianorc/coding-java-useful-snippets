package br.com.joselucianorc.useful.snipets.designpatterns.gof.composite.solution;

import java.util.ArrayList;
import java.util.List;

import br.com.joselucianorc.useful.snipets.designpatterns.gof.composite.ComponenteDeMaquina;
import lombok.Data;

@Data
public class Machine {

	private ComponentComposite componentes;
	
	public Machine() {
		this.componentes = new ComponentComposite();
	}
	
	public static void main(String[] args) {		
		Machine m = new Machine();
		
		ComponenteDeMaquina componenteMaquina1 = new ComponenteDeMaquina();
		ComponenteDeMaquina componenteMaquina2 = new ComponenteDeMaquina();
		ComponenteDeMaquina componenteMaquina3 = new ComponenteDeMaquina();
		
		m.getComponentes().addComponente(componenteMaquina1);
		m.getComponentes().addComponente(componenteMaquina2);
		m.getComponentes().addComponente(componenteMaquina3);
	}
		
}