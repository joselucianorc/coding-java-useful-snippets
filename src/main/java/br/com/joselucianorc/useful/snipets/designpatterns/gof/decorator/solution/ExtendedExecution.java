package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.solution;

public class ExtendedExecution extends ExecutableDecorator {

	public ExtendedExecution(Executable executable) {
		super(executable);
	}

	@Override
	public void execute() {
		super.execute();
		this.doExtendedExecution();
	}
	
	public void doExtendedExecution() {
		System.out.println("ExtendedExecution - done Extended Execution");
	}
}
