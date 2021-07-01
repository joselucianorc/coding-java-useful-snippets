package br.com.joselucianorc.useful.snipets.designpatterns.gof.facade.problem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
	private String nome;
	private int id;
	private double preco;	
}
