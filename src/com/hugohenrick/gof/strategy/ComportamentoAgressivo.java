package com.hugohenrick.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
	@Override
	public void mover() {
		System.out.println("Movendo agressivamente");
	}

}
