package com.trilha_desafio_java_basico;

import java.util.Scanner;
import com.trilha_desafio_java_basico.exception.*;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Erro: " + exception);
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		if (contagem <= 0) throw new ParametrosInvalidosException();
		//realizar o for para imprimir os números com base na variável contagem
		for(int cont = 1; cont <= contagem; cont++) System.out.println("Imprimindo o número " + cont);
	}
}
