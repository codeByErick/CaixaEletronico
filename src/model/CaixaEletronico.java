package model;

import view.GUI;

public class CaixaEletronico implements ICaixaEletronico {
	private int[][] cedulas = { { 100, 0 }, { 50, 0 }, { 20, 0 }, { 10, 0 }, { 5, 0 }, { 2, 0 }

	};

	public String pegaRelatorioCedulas() {

		String resposta = "";
//logica de fazer o relatorio de cedulas
		return resposta;
	}

	public String pegaValorTotalDisponivel() {
		String resposta = "";
//logica de pega o valor total disponivel no caixa eletronio
		return resposta;
	}

	
	
	// logica de fazer a reposicao de cedulas e criar uma mensagem //(resposta)ao
	// usuario
	/*
	 * O método percorre a matriz para verificar se encontra alguma cédula
	 * equivalente à dada pelo usuário, caso encontre, a quantidade é incrementada
	 */
	public String reposicaoCedulas(Integer cedula, Integer quantidade) {
		if (quantidade <= 0) {
			String resposta = "Quantidade inválida!";
			return resposta;
		}
		for (int i = 0; i < cedulas.length; i++) {
				if (cedulas [i][0] == cedula) {
					cedulas[i][1] += quantidade;
					String resposta = "Reposição realizada!";
					return resposta;
				}
		
		}
		
		String resposta = "Cédula inválida!";
		return resposta;
	}

	
	
	public String sacar(Integer valor) {
		String resposta = "";
//logica de sacar do caixa eletronico e criar um mensagem(resposta) ao // usuario
		return resposta;
	}

	public String armazenaCotaMinima(Integer minimo) {
		String resposta = "";
//logica de armazenar a cota minima para saque e criar um //mensagem(resposta)ao usuario
		return resposta;
	}

	public static void main(String arg[]) {
		GUI janela = new GUI();
		janela.setVisible(true);
	}
}