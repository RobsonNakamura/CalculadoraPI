/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadorapi;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Robson
 */
public class JFrameCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCalculadora
     */
    public JFrameCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonTotal = new javax.swing.JButton();
        jTextFieldDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("1");
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButtonSoma.setText("+");
        jButtonSoma.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButtonMultiplicacao.setText("*");
        jButtonMultiplicacao.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonMultiplicacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButtonDivisao.setText("/");
        jButtonDivisao.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonDivisao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButtonSubtracao.setText("-");
        jButtonSubtracao.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonSubtracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButtonTotal.setText("=");
        jButtonTotal.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButtonTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDisplay)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.operarComBotaoClicado(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        this.operarComTeclaDigitada(evt);
    }//GEN-LAST:event_jButton1KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCalculadora().setVisible(true);
            }
        });
    }
    
        private double resultado;
    private String modelo = "";
    private String marca = "";

    // Estados da calculadora
    public enum estadosDaCalculadora {

        INICIANDO,
        PRIMEIRA_DIGITACAO,
        EM_OPERACAO,
        NOVA_DIGITACAO,
        TOTALIZANDO
    }

    // Operações da calculadora
    public enum operacoesCalculadora {

        SOMA,
        SUBTRAI,
        MULTIPLICA,
        DIVIDI
    }

    // Propriedades para controle interno
    private estadosDaCalculadora estado = estadosDaCalculadora.INICIANDO;
    private operacoesCalculadora operacao;
    private double acumulador;


    public void operarComTeclaDigitada(java.awt.event.KeyEvent evt) {
        // Se foi digitado uma das teclas a seguir
        if ((evt.getKeyCode() == KeyEvent.VK_0)
                || (evt.getKeyCode() == KeyEvent.VK_1)
                || (evt.getKeyCode() == KeyEvent.VK_2)
                || (evt.getKeyCode() == KeyEvent.VK_3)
                || (evt.getKeyCode() == KeyEvent.VK_4)
                || (evt.getKeyCode() == KeyEvent.VK_5)
                || (evt.getKeyCode() == KeyEvent.VK_6)
                || (evt.getKeyCode() == KeyEvent.VK_7)
                || (evt.getKeyCode() == KeyEvent.VK_8)
                || (evt.getKeyCode() == KeyEvent.VK_9)
                || (evt.getKeyCode() == KeyEvent.VK_ADD)
                || (evt.getKeyCode() == KeyEvent.VK_SUBTRACT)
                || (evt.getKeyCode() == KeyEvent.VK_DIVIDE)
                || (evt.getKeyCode() == KeyEvent.VK_MULTIPLY)
                || (evt.getKeyCode() == KeyEvent.VK_EQUALS)) {

            // Opera com tecla digitada
            this.operarConformeEstado("" + evt.getKeyChar());

            // Caso foi a tecla definida como limpar "L"
        } else if (evt.getKeyCode() == KeyEvent.VK_L) {
            this.operarConformeEstado("Limpar");
        }
    }

    public void operarComBotaoClicado(java.awt.event.ActionEvent evt) {
        // Descobre o botão que foi clicado e devolve o caractere, nele, na variável texto
        JButton botao = (JButton) evt.getSource(); // Retorna o botão clicado
        String caractereDigitado = botao.getText(); // Retorna o texto do botão que foi clicado
        this.operarConformeEstado(caractereDigitado); // Oferece o texto do botão para calculadora executar a operação
    }

    public void operarConformeEstado(String caractereDigitado) {

        if (this.estado == estadosDaCalculadora.INICIANDO) {

            //Limpa tudo para começar novamente
            this.limpar();

            if (this.eNumero(caractereDigitado)) { // Se digitado algum número
                this.setVisor(caractereDigitado);
                this.estado = estadosDaCalculadora.PRIMEIRA_DIGITACAO;
            } else if (this.eLimpar(caractereDigitado)) {
                this.limpar();
            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.EM_OPERACAO) {

            if (this.eNumero(caractereDigitado)) {
                this.setVisor(caractereDigitado);
                this.estado = estadosDaCalculadora.NOVA_DIGITACAO;
            } else if (this.eLimpar(caractereDigitado)) {
                this.limpar();
                this.acumulador = 0;
                this.estado = estadosDaCalculadora.INICIANDO;
            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.TOTALIZANDO) {

            if (this.eOperacao(caractereDigitado)) {
                this.setOperacao(caractereDigitado);
                this.estado = estadosDaCalculadora.EM_OPERACAO;
            } else if (this.eNumero(caractereDigitado)) { // Se digitado número
                this.setVisor(caractereDigitado);
                this.estado = estadosDaCalculadora.PRIMEIRA_DIGITACAO;
            } else if (this.eLimpar(caractereDigitado)) {
                this.limpar();
                this.acumulador = 0;
                this.estado = estadosDaCalculadora.INICIANDO;
            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.NOVA_DIGITACAO) {

            if (this.eNumero(caractereDigitado)) {
                this.setVisor(this.getVisor() + caractereDigitado);
            } else if (caractereDigitado.equals("Limpar")) {
                this.jTextFieldDisplay.setText("");
                this.estado = estadosDaCalculadora.EM_OPERACAO;
            } else if ((this.eIgual(caractereDigitado)) || (this.eNumero(caractereDigitado))) {

                this.calcular(); // Aqui é que utilizamos as operações da Calculadora
               
                this.acumulador = this.getResultado();

                this.setVisor(Double.toString(this.acumulador));

                if (this.eIgual(caractereDigitado)) {
                    this.estado = estadosDaCalculadora.TOTALIZANDO;
                } else {
                    this.setOperacao(caractereDigitado);
                    this.estado = estadosDaCalculadora.EM_OPERACAO;
                }

            } else {
                this.erro("Erro de operação");
            }

        } else if (this.estado == estadosDaCalculadora.PRIMEIRA_DIGITACAO) {

            if (this.eNumero(caractereDigitado)) {
                this.setVisor(this.getVisor() + caractereDigitado);
            } else if (caractereDigitado.equals("Limpar")) {
                this.limpar();
                this.estado = estadosDaCalculadora.INICIANDO;
            } else if (this.eOperacao(caractereDigitado)) {
                this.setOperacao(caractereDigitado);
                this.acumulador = Double.parseDouble(this.jTextFieldDisplay.getText());
                this.estado = estadosDaCalculadora.EM_OPERACAO;
            } else {
                this.erro("Erro de operação");
            }
        }
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setOperacao(String caractere) {
        switch (caractere) {
            case "+":
                this.operacao = operacoesCalculadora.SOMA;
                break;
            case "-":
                this.operacao = operacoesCalculadora.SUBTRAI;
                break;
            case "*":
                this.operacao = operacoesCalculadora.MULTIPLICA;
                break;
            case "/":
                this.operacao = operacoesCalculadora.DIVIDI;
                break;
        }
    }

    public void setVisor(String caractere) {
        this.jTextFieldDisplay.setText(caractere);
    }

    public String getVisor() {
        return this.jTextFieldDisplay.getText();
    }

    public boolean eNumero(String caractere) {
        return "0123456789".indexOf(caractere) != -1;
    }

    public boolean eLimpar(String cadeiaCaractere) {
        return cadeiaCaractere.equals("Limpar");
    }

    public boolean eIgual(String cadeiaCaractere) {
        return cadeiaCaractere.equals("=");
    }

    public boolean eOperacao(String caractere) {
        return "+-*/".indexOf(caractere) != -1;
    }

    public void limpar() {
        this.jTextFieldDisplay.setText("");
    }

    public void calcular() {
        switch (this.operacao) {
            case MULTIPLICA:
                this.multiplicar(this.acumulador,
                        Double.parseDouble(this.getVisor()));
                break;
            case SUBTRAI:
                this.subtrair(this.acumulador,
                        Double.parseDouble(this.getVisor()));
                break;
            case SOMA:
                this.somar(this.acumulador,
                        Double.parseDouble(this.getVisor()));
                break;
            case DIVIDI:
                this.dividir(this.acumulador,
                        Double.parseDouble(this.getVisor()));
        }
    }

    public void somar(double a, double b) {
        this.resultado = a + b;
    }

    public void multiplicar(double a, double b) {
        this.resultado = a * b;
    }

    public void dividir(double a, double b) {
        this.resultado = a - b;
    }

    public void subtrair(double a, double b) {
        this.resultado = a - b;

    }

    public void erro(String erro) {
        JOptionPane.showMessageDialog(rootPane, erro);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JTextField jTextFieldDisplay;
    // End of variables declaration//GEN-END:variables
}
