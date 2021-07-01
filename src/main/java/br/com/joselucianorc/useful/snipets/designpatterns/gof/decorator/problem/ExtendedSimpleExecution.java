package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.problem;

public class ExtendedSimpleExecution extends SimpleExecution {

	@Override
	public void execute() {
		super.execute();
	}
	
	public void doSimpleExtended() {
		System.out.println("ExtendedSimpleExecution - doing extended simple execution");
	}
}
