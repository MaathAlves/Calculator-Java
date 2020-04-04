package br.programa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Telas extends JFrame {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private JLabel txtVisor;
  private JLabel txtCalculo;
  private JButton botao1, botao2, botao3, botao4, botao5; 
  private JButton botao6, botao7, botao8, botao9, botao0; 
  private JButton botaoSoma, botaoSubt, botaoMult;
  private JButton botaoDiv, botaoExpo, botaoRaiz;;
  private JButton botaoCE, botaoC, botaoIgual, botaoPonto;

  public Telas() {
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    criaCalculadora();
    funcoesBotoes();
  }

  public void criaCalculadora(){
    //Labels de Texto
    txtCalculo = new JLabel(""); txtCalculo.setBounds(10, 30, 240, 20);
    txtVisor = new JLabel(""); txtVisor.setBounds(10, 60, 240, 20);
    //Alinhamento a Direita
    txtCalculo.setHorizontalAlignment(SwingConstants.RIGHT);
    txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
    //Definindo fonte
    txtCalculo.setFont(new Font("Arial", Font.PLAIN, 14));
    txtVisor.setFont(new Font("Arial", Font.PLAIN, 20));
    //Adicionando ao JFrame
    add(txtCalculo);
    add(txtVisor);

    //BOTOES NUMERICOS
    botao1 = new JButton("1"); botao1.setBounds(10, 70, 50, 40);
    botao2 = new JButton("2"); botao2.setBounds(70, 70, 50, 40);
    botao3 = new JButton("3"); botao3.setBounds(130, 70, 50, 40);
    botao4 = new JButton("4"); botao4.setBounds(10, 120, 50, 40);
    botao5 = new JButton("5"); botao5.setBounds(70, 120, 50, 40);
    botao6 = new JButton("6"); botao6.setBounds(130, 120, 50, 40);
    botao7 = new JButton("7"); botao7.setBounds(10, 170, 50, 40);
    botao8 = new JButton("8"); botao8.setBounds(70, 170, 50, 40);
    botao9 = new JButton("9"); botao9.setBounds(130, 170, 50, 40);
    botao0 = new JButton("0"); botao0.setBounds(70, 220, 50, 40);
    //BOTOES OPERADORES  
    botaoPonto = new JButton("."); botaoPonto.setBounds(190, 170, 50, 40);
    botaoIgual = new JButton("="); botaoIgual.setBounds(190, 220, 50, 40);
    botaoSoma = new JButton("+"); botaoSoma.setBounds(10, 20, 50, 40);
    botaoSubt = new JButton("-"); botaoSubt.setBounds(70, 20, 50, 40);
    botaoMult = new JButton("*"); botaoMult.setBounds(130, 20, 50, 40);
    botaoDiv = new JButton("/"); botaoDiv.setBounds(190, 20, 50, 40);
    botaoC = new JButton("C"); botaoC.setBounds(190, 70, 50, 40);
    botaoCE = new JButton("CE"); botaoCE.setBounds(190, 120, 50, 40);
    botaoExpo = new JButton("x²"); botaoExpo.setBounds(10, 220, 50, 40);
    botaoRaiz = new JButton("√"); botaoRaiz.setBounds(130, 220, 50, 40);
    
    //Definindo Fonte
    String familia = "Arial";
    int estilo = Font.PLAIN;
    int tamanho = 20;
    Font f = new Font(familia, estilo, tamanho);
    
    botaoPonto.setFont(f);
    botaoIgual.setFont(f);
    botaoSoma.setFont(f);
    botaoSubt.setFont(f);
    botaoMult.setFont(f);
    botaoDiv.setFont(f);
    botaoC.setFont(new Font("Arial", Font.PLAIN, 11));
    botaoCE.setFont(new Font("Arial", Font.PLAIN, 11));
    botaoExpo.setFont(f);
    botaoRaiz.setFont(f);
    //
    botaoPonto.setBackground(Color.WHITE);
    botaoIgual.setBackground(Color.WHITE);
    botaoSoma.setBackground(Color.white);
    botaoSubt.setBackground(Color.white);
    botaoMult.setBackground(Color.white);
    botaoDiv.setBackground(Color.white);
    botaoC.setBackground(Color.white);
    botaoCE.setBackground(Color.white);
    botaoExpo.setBackground(Color.white);
    botaoRaiz.setBackground(Color.white);

    //criando painel e adicionando objetos
    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(10, 80, 240, 260);
    painel.add(botao1);
    painel.add(botao2);
    painel.add(botao3);
    painel.add(botao4);
    painel.add(botao5);
    painel.add(botao6);
    painel.add(botao7);
    painel.add(botao8);
    painel.add(botao9);
    painel.add(botao0);
    painel.add(botaoIgual);
    painel.add(botaoPonto);
    painel.add(botaoSoma);
    painel.add(botaoSubt);
    painel.add(botaoMult);
    painel.add(botaoDiv);
    painel.add(botaoC);
    painel.add(botaoCE);
    painel.add(botaoExpo);
    painel.add(botaoRaiz);
    add(painel);
  }
  

  public void funcoesBotoes(){
    //Ações botões numéricos 
    
    botao1.addActionListener(new ActionListener() { //1
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "1"); 
			}
    });

    botao2.addActionListener(new ActionListener() { //2
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "2"); 
			}
    });

    botao3.addActionListener(new ActionListener() { //3
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "3"); 
			}
    });

    botao4.addActionListener(new ActionListener() { //4
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "4"); 
			}
    });

    botao5.addActionListener(new ActionListener() { //5
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "5"); 
			}
    });

    botao6.addActionListener(new ActionListener() { //6
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "6"); 
      }
    });
  
    botao7.addActionListener(new ActionListener() { //7
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "7"); 
			}
    });

    botao8.addActionListener(new ActionListener() { //8
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "8"); 
			}
    });

    botao9.addActionListener(new ActionListener() {//9
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "9"); 
			}
    });

    botao0.addActionListener(new ActionListener() { //0
			public void actionPerformed(ActionEvent e) {
				String valor = txtVisor.getText();
        txtVisor.setText(valor + "0"); 
			}
    });

    //Ações botões operadores
    botaoSoma.addActionListener(new ActionListener() { //Soma
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtVisor.setText(valor + "+");
			}
    });

    botaoSubt.addActionListener(new ActionListener() { //Subtração
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtVisor.setText(valor + "-");
			}
    });

    botaoMult.addActionListener(new ActionListener() { //Multiplicação
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtVisor.setText(valor + "*");
			}
    });

    botaoDiv.addActionListener(new ActionListener() { //Divisão
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtVisor.setText(valor + "/");
			}
    });

    botaoExpo.addActionListener(new ActionListener() { //Exponenciação
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtCalculo.setText(valor + "²");

        String resultado = String.valueOf(Math.pow(Double.parseDouble(valor), 2));
        DecimalFormat f = new DecimalFormat("0.#");
        if ((Double.parseDouble(resultado) * 2) % 2 == 0) {
          resultado =  "" + f.format(Double.parseDouble(resultado.replaceAll(",", ".")));
        } 

        txtVisor.setText(resultado);
			}
    });

    botaoRaiz.addActionListener(new ActionListener() { //Raiz
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtCalculo.setText("√(" + valor + ")");

        String resultado = String.valueOf(Math.sqrt(Double.parseDouble(valor)));
        DecimalFormat f = new DecimalFormat("0.#");
        if ((Double.parseDouble(resultado) * 2) % 2 == 0) {
          resultado =  "" + f.format(Double.parseDouble(resultado.replaceAll(",", ".")));
        } 

        txtVisor.setText(resultado);
			}
    });

    botaoC.addActionListener(new ActionListener() { //C
			public void actionPerformed(ActionEvent e) {
        txtVisor.setText("");
        txtCalculo.setText("");
			}
    });

    botaoCE.addActionListener(new ActionListener() { //CE
			public void actionPerformed(ActionEvent e) {
        txtVisor.setText("");
			}
    });

    botaoPonto.addActionListener(new ActionListener() { //Ponto
			public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();
        txtVisor.setText(valor + "."); 
			}
    });

    botaoIgual.addActionListener(new ActionListener(){ //Igual
      public void actionPerformed(ActionEvent e) {
        String valor = txtVisor.getText();

        Calculo calculo = new Calculo();
        String m = txtVisor.getText();
        calculo.setOperacao(m); //jogar a equaçao para class calculo
        
        txtCalculo.setText(valor + " ="); //mostrar a equação
        
        String r= calculo.retornaResultado(); //Atriu resultado
        txtVisor.setText(r); //mostra o resultado
      }
    });
  }

}