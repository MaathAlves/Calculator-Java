package br.programa;

import java.text.DecimalFormat;

public class Calculo {
  private String operacao;
  
  public String getOperacao() {
    return operacao;
  }
  
  public void setOperacao(String operacao) {
    this.operacao = operacao;
  }


  public String retornaResultado(){
    char[] operadores = { '+', '-', '/', '*' };
    char operadorSelecionado = 0;
    
    for (int i = 0; i <= operadores.length; i++) {
      if (operacao.indexOf(operadores[i]) != -1) {
        operadorSelecionado = operadores[i];
        break;
      }
    }

    String parte1 = operacao.substring(0, operacao.indexOf(operadorSelecionado));
		String parte2 = operacao.substring(operacao.indexOf(operadorSelecionado) + 1);

    String resultado = "valor";
		switch (operadorSelecionado) {
			case '+' :
				  resultado = String.valueOf(Double.parseDouble(parte1) + Double.parseDouble(parte2));
					break;
				case '-' :
				  resultado =	String.valueOf(Double.parseDouble(parte1)	- Double.parseDouble(parte2));
					break;
				case '/' :
				  resultado = String.valueOf(Double.parseDouble(parte1)	/ Double.parseDouble(parte2));
					break;
				case '*' :
				  resultado = String.valueOf(Double.parseDouble(parte1)	* Double.parseDouble(parte2));
					break;
				default :
					System.out.println("Operador desconhecido");
					break;
		}
    
    
        
    DecimalFormat f = new DecimalFormat("0.#");

		if ((Double.parseDouble(resultado) * 2) % 2 == 0) {
			return "" + f.format(Double.parseDouble(resultado.replaceAll(",", ".")));
		} else
			return resultado;
	  }
}
  
