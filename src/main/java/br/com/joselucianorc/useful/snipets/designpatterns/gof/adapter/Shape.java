package br.com.joselucianorc.useful.snipets.designpatterns.gof.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Shape {
	protected int x;
	protected int y;
	protected int height;
	protected int width;
}
