package br.com.joselucianorc.useful.snipets.designpatterns.gof.decorator.solution;

public class Usage {
	public static void main(String[] args) {
		Executable[] array = { 
				new SimpleExecution(new SampleExecutable()), 
				new ExtendedExecution(new SimpleExecution(new SampleExecutable())), 
				new CompleteExecution(new ExtendedExecution(new SimpleExecution(new SampleExecutable()))) };
		
		for (int i = 0; i < array.length; i++) {
			array[i].execute();
		}
	}
}
