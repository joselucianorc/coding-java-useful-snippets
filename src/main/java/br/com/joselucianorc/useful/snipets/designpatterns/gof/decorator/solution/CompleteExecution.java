package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.solution;

public class CompleteExecution extends ExecutableDecorator {

	public CompleteExecution(Executable executable) {
		super(executable);
	}

	@Override
	public void execute() {
		super.execute();
		this.doCompleteExecution();
	}
	
	public void doCompleteExecution() {
		System.out.println("CompleteExecution - done Extended Execution");
	}
}
