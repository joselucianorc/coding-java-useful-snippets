package br.com.joselucianorc.useful.snipets.designpatterns.gof.builder;

public class HomeConstructor implements Builder {

	@Override
	public String buildPartOne() {
		return "Constructing a home - Part 1";
	}

	@Override
	public String buildPartTwo() {
		return "Constructing a home - Part 2";
	}

	@Override
	public String buildPartThree() {
		return "Constructing a home - Part 3";	
	}
}
