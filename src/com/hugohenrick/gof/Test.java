package com.hugohenrick.gof;

import com.hugohenrick.gof.facade.Facade;
import com.hugohenrick.gof.singleton.SingletonEager;
import com.hugohenrick.gof.singleton.SingletonLazy;
import com.hugohenrick.gof.singleton.SingletonLazyHolder;
import com.hugohenrick.gof.strategy.Comportamento;
import com.hugohenrick.gof.strategy.ComportamentoAgressivo;
import com.hugohenrick.gof.strategy.ComportamentoDefensivo;
import com.hugohenrick.gof.strategy.ComportamentoNormal;
import com.hugohenrick.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton GOF de Criação
		//Cria uma única instância de uma classe e que ela possa ser facilmente acessível de qualquer ponto do programa.
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		//Strategy GOF Comportamental
		//usado em várias estruturas para fornecer aos usuários uma maneira de alterar o comportamento de uma classe sem estendê-la.
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo(); 
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade GOF Estrutural
		//Usado quando temos que fazer a comunicação com um subsistema complexo
		Facade facade = new Facade();
		facade.migrarCliente("Hugo Henrick", "78698000");
	}

}
