package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.solution;

public abstract class ExecutableDecorator implements Executable {
	private Executable executable;
	
	public ExecutableDecorator(Executable executable) {
		this.executable = executable;
	}

	@Override
	public void execute() {	
		executable.execute();
	}		
}
