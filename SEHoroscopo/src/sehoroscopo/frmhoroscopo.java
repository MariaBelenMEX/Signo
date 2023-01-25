/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sehoroscopo;

import javax.swing.ImageIcon;

/**
 *
 * @author María Belén Martínez Sánchez TIN 200315 
 */
public class frmhoroscopo extends javax.swing.JFrame {
          ImageIcon Signo=new ImageIcon();
          
    public frmhoroscopo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtdia = new javax.swing.JTextField();
        combomes = new javax.swing.JComboBox<>();
        resultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combosexo = new javax.swing.JComboBox<>();
        resultado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Día:");

        jLabel2.setText("Mes:");

        jLabel3.setText("Ingresar los datos correspondientes");

        btncalcular.setText("Calcular signo");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        combomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Signo Zodiacal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel4.setText("Género:");

        combosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Mujer", "Hombre" }));

        resultado2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        resultado2.setForeground(new java.awt.Color(0, 153, 255));
        resultado2.setToolTipText("");
        resultado2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personalidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 153))); // NOI18N
        resultado2.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(combosexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdia)
                                .addComponent(combomes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btncalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
       //DECLARACIÓN DE VARIABLES
        int dia=Integer.parseInt(txtdia.getText());
        String mes=(String)combomes.getSelectedItem();
        String genero=(String)combosexo.getSelectedItem();
        
        
        //INICIO DE LAS REGLAS DEL SIGNO
        if(dia>=21 && mes.equals("Marzo")||dia<=20 &&mes.equals("Abril")){
            resultado.setText("Aries");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres Impulsiva, orgullosa y mandona");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres divertido, fuerte y valiente");
                  }
            
           }else if (dia>=21 && mes.equals("Abril")||dia<=20 &&mes.equals("Mayo")){
           resultado.setText("Tauro");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres muy estable, tranquila y leal");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres muy estable, confiable y leal");
                  }
                  
           }else if (dia>=21 && mes.equals("Mayo")||dia<=21 &&mes.equals("Junio")){
           resultado.setText("Gemenis");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres muy sociable, comunicativa e inquieta");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres inteligente, comunicativo y curioso");
                  }
                  
           }else if (dia>=22 && mes.equals("Junio")||dia<=22 &&mes.equals("Julio")){
           resultado.setText("Cancer");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres emocional, intuitiva y hogareña");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres muy tímido, sensible y cariñoso ");
                  }
                  
           }else if (dia>=23 && mes.equals("Julio")||dia<=22 &&mes.equals("Agosto")){
           resultado.setText("Leo");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres narcisista, persistente y sociable");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres valiente, seguro y confiable");
                  }
                  
           }else if (dia>=23 && mes.equals("Agosto")||dia<=22 &&mes.equals("Septiembre")){
           resultado.setText("Virgo");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres analítica, intelectual y comprometida");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres atractivo, inteligente y analítico");
                  }
                  
           }else if (dia>=23 && mes.equals("Septiembre")||dia<=22 &&mes.equals("Octubre")){
           resultado.setText("Libra");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres muy amorosa, idealista y pacífica");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres divertido, sincero y muy creativo");
                  }
                  
           }else if (dia>=23 && mes.equals("Octubre")||dia<=21 &&mes.equals("Noviembre")){
           resultado.setText("Escorpio");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres misteriosa, responsable y fuerza de voluntad");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres intenso, radical y determinado");
                  }
                  
           }else if (dia>=22 && mes.equals("Noviembre")||dia<=21 &&mes.equals("Diciembre")){
           resultado.setText("Sagitario");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres honesta, optimista y generosa");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres alegre, optimista y te aterra el compromiso");
                  }
                  
           }else if (dia>=22 && mes.equals("Diciembre")||dia<=20 &&mes.equals("Enero")){
           resultado.setText("Capricornio");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres metódica, exigente y discreta");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres reservado, tranquilo y muy noble");
                  }
                  
           }else if (dia>=21 && mes.equals("Enero")||dia<=19 &&mes.equals("Febrero")){
           resultado.setText("Acuario");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres creativa, genuina y humanitaria");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres impredecible, creativo e innovador");
                  }
                  
           }else if (dia>=20 && mes.equals("Febrero")||dia<=20 &&mes.equals("Marzo")){
           resultado.setText("Picis");
                  if (genero=="Mujer"){
                      resultado2.setText("Eres intuitiva, independiente y aventurera ");
                  } else if (genero=="Hombre"){
                      resultado2.setText("Eres servicial, tierno y protector");
                  }
           }//FINAL DE LAS REGLAS DEL SIGNO
        
        
        
        //MOSTAR IMAGEN EN VEZ DEL TEXTO DEL SIGNO ZODIACAL  
        Signo=new ImageIcon(getClass().getResource("/Imagenes/"+resultado.getText()+".jpg"));
        resultado.setIcon(Signo);
        
        Signo=new ImageIcon(getClass().getResource("/Imagenes/"+resultado2.getText()+""));
        resultado2.setIcon(Signo);
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
       txtdia.setText("");
       combomes.setSelectedIndex(0);
       combosexo.setSelectedIndex(0);
       resultado.setText("");
       resultado.setIcon(null);
       resultado2.setText("");
       resultado2.setIcon(null);       
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmhoroscopo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> combomes;
    private javax.swing.JComboBox<String> combosexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultado2;
    private javax.swing.JTextField txtdia;
    // End of variables declaration//GEN-END:variables
}
