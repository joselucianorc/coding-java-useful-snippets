package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.solution;

public class SimpleExecution extends ExecutableDecorator {

	public SimpleExecution(Executable executable) {
		super(executable);
	}

	@Override
	public void execute() {
		super.execute();
		this.doSimpleExecution();
	}
	
	public void doSimpleExecution() {
		System.out.println("SimpleExecution - done Simple Execution");
	}
}
