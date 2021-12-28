package vistas;

import Clases.*;
import javax.swing.JOptionPane;


public class FramePreguntas extends javax.swing.JFrame {

    public FramePreguntas() {
        initComponents();
        txtNombre.setText(FrameInicial.Nombre);             //Capta y envia la variable a jLabel
        IniciarJuego();                                     //Metodo creado para iniciar el juego
        
        
    }

    int i = 0;                                                      //Declaracion de valores iniciales
    public static int nivel = 1;
    int posicion = 0;
    public static int acumulado = 0;
    Respuesta res = new Respuesta();
    Pregunta pr = new Pregunta();
    FrameInicial ini = new FrameInicial();
    Object[] select = {"", "", "", "", ""};                 
    
    
    
    
    public final void IniciarJuego(){
        txtNivel.setText(String.valueOf(nivel));            //Envia el nivel actual al jLavel
        txtPregunta.setText(pr.getPregunta(posicion));      //Trae la pregunta segun la posicion en el array que se encuentra en la clase Pregunta
        btngroupRespuestas.clearSelection();                //Limpia el btnGroup
        String[] a = res.setRespuestas(posicion);           //Trae la opcion correcta segun la posicion en el Array
        opc1.setText(a[0]);                                 //Envia la info de los botones
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();                                //Resalta texto del primer radiobutton 
    }
    
    public void ReiniciarJuego() {                          //Metodo creado para reiniciar el juego una vez terminado

        new FrameInicial().setVisible(true);
        this.setVisible(false);

        i = 0;
        nivel = 1;
        posicion = 0;
        Object[] select = {"", "", "", "", ""};
        txtNivel.setText(String.valueOf(nivel));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupRespuestas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JLabel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Preguntas y Respuestas"));

        jLabel8.setText("Acumulado:");

        txtAcumulado.setText("0");

        btnValidar.setText("Validar Pregunta");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnTerminar.setText("Terminar Juego");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Hola:");

        txtNombre.setText("xxxx");

        jLabel3.setText("Nivel:");

        txtNivel.setText("0");

        txtPregunta.setText("¿Aqui va la pregunta?");

        btngroupRespuestas.add(opc1);
        opc1.setText("event1");
        opc1.setActionCommand("");
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        btngroupRespuestas.add(opc2);
        opc2.setText("event2");
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        btngroupRespuestas.add(opc3);
        opc3.setText("event3");
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        btngroupRespuestas.add(opc4);
        opc4.setText("event4");
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPregunta)
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAcumulado))
                    .addComponent(opc3)
                    .addComponent(opc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnValidar)
                        .addGap(18, 18, 18)
                        .addComponent(btnTerminar))
                    .addComponent(opc2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNombre)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNivel)
                    .addGap(172, 172, 172)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtPregunta)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc1)
                    .addComponent(opc2))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc3)
                    .addComponent(opc4))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerminar)
                    .addComponent(btnValidar)
                    .addComponent(jLabel8)
                    .addComponent(txtAcumulado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNivel)
                            .addComponent(jLabel3))
                        .addComponent(txtNombre)
                        .addComponent(jLabel1))
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed

        if (select[i].equals(res.getRespuestas(posicion))) {            //Valida la variable posicion y la compara con las respuestas
            acumulado = acumulado + 1000000;                            //si es correcto se suma premio
            i++;                                                        //Se aumenta el iterador para validar cuando se realicen las 5 respuestas
            nivel++;                                                    //se aumenta el nivel

            if (i == 5) {                                               //Si a 5 preguntas correctas se considera ganador y entra en este ciclo
                acumulado = acumulado + 5000000;                        //se aumentra premio por ganar
                txtAcumulado.setText(String.valueOf(acumulado));        //Se envia el acumulado actualizado a la ventana
                JOptionPane.showMessageDialog(null, "Felicidades acabas de ganar: " + acumulado);       //Mensaje de felicitacion con valor de premio
                ReiniciarJuego();                                       //Se reinicia el juego

            } else {                                                    //Si no es ganador aun se continua el ciclo con una validacion
                int msn = JOptionPane.showConfirmDialog(null, "Respuesta Correcta, Acumuluste:" + acumulado + " ¿desea continuar?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (msn == JOptionPane.YES_OPTION) {                    //Respuesta de validacion, el usuario decide si continuar o retirarse con su premio
                    txtAcumulado.setText(String.valueOf(acumulado));    
                    posicion++;
                    IniciarJuego();
                    

                } else {                                            //Si el usuario confirma negativo, se retira con su premio
                    JOptionPane.showMessageDialog(null, "Gracias por participar! su acumulado fue de: " + acumulado);
                    ReiniciarJuego();

                }
            }
        } else {                        //Si la respuesta es incorrecta se retira sin premio
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, Perdiste");
            acumulado=0;
            ReiniciarJuego();
        }

    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        int msn2 = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea retirarse? solo se llevara: " + acumulado, "Confirmacion", JOptionPane.YES_NO_OPTION);   //Bonton de retiro con confirmacion
        if (msn2 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por participar su acumulado fue de: " + acumulado);
            ReiniciarJuego();

        } else {

        }
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        select[posicion] = opc1.getLabel();                         //Validacion de opcion 
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        select[posicion] = opc2.getLabel();
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        select[posicion] = opc3.getLabel();
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        select[posicion] = opc4.getLabel();
    }//GEN-LAST:event_opc4ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton btnValidar;
    private javax.swing.ButtonGroup btngroupRespuestas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel txtAcumulado;
    private javax.swing.JLabel txtNivel;
    public javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPregunta;
    // End of variables declaration//GEN-END:variables

}
