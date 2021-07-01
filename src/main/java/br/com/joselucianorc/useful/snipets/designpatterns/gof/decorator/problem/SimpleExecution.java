package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.problem;

public class SimpleExecution extends BaseExecution {

	@Override
	public void execute() {
		super.execute();
		this.doSimple();
	}
	
	public void doSimple() {
		System.out.println("SimpleExecution - doing simple execution");
	}
 
}
