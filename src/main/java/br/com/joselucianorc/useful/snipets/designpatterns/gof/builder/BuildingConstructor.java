package br.com.joselucianorc.useful.snipets.designpatterns.gof.builder;

public class BuildingConstructor implements Builder {

	@Override
	public String buildPartOne() {
		return "Constructing a building - Part 1";
	}

	@Override
	public String buildPartTwo() {
		return "Constructing a building - Part 2";
	}

	@Override
	public String buildPartThree() {
		return "Constructing a building - Part 3";
	}

}
