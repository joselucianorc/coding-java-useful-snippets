package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.problem;

public class CompleteExecution extends ExtendedSimpleExecution {

	@Override
	public void execute() {
		super.execute();
		this.doCompleteExecution();
	}

	public void doCompleteExecution() {
		System.out.println("CompleteExecution - doing complete execution.");
	}
}
