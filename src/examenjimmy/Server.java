package examenjimmy;

import java.math.BigInteger;
import java.util.ArrayList;

public class Server extends javax.swing.JFrame {

    public Server() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFTamano_numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFQ = new javax.swing.JTextField();
        JTFP = new javax.swing.JTextField();
        JTFN = new javax.swing.JTextField();
        JTFPhi_n = new javax.swing.JTextField();
        JTFD = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAMensaje = new javax.swing.JTextArea();
        JBCifrar = new javax.swing.JButton();
        JBDecifrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTFE = new javax.swing.JTextField();
        guardarRSA = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JBObtener = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setText("Tamaño del Número");

        JTFTamano_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTamano_numeroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel2.setText("Número q");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel3.setText("Número p");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel4.setText("Número n");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel5.setText("Número d");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel6.setText("Número phi(n)");

        JTFQ.setEditable(false);
        JTFQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQActionPerformed(evt);
            }
        });

        JTFP.setEditable(false);

        JTFN.setEditable(false);

        JTFPhi_n.setEditable(false);

        JTFD.setEditable(false);
        JTFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDActionPerformed(evt);
            }
        });

        JTAMensaje.setColumns(20);
        JTAMensaje.setForeground(new java.awt.Color(255, 51, 51));
        JTAMensaje.setRows(5);
        jScrollPane1.setViewportView(JTAMensaje);

        JBCifrar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        JBCifrar.setText("Cifrar");
        JBCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCifrarActionPerformed(evt);
            }
        });

        JBDecifrar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        JBDecifrar.setText("Descifrar");
        JBDecifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDecifrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCifrar)
                    .addComponent(JBDecifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBCifrar)
                        .addGap(28, 28, 28)
                        .addComponent(JBDecifrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel7.setText("Número e");

        JTFE.setEditable(false);
        JTFE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFEActionPerformed(evt);
            }
        });

        guardarRSA.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        guardarRSA.setText("Guardar RSA");
        guardarRSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarRSAActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JBObtener.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        JBObtener.setText("Obtener RSA");
        JBObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBObtenerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("CIFRADO RSA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFP, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(JTFPhi_n, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(JTFE, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(JTFTamano_numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(guardarRSA)
                                .addGap(18, 18, 18)
                                .addComponent(JBObtener)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarRSA)
                            .addComponent(JBObtener))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTFTamano_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(JTFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFPhi_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTamano_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTamano_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTamano_numeroActionPerformed

    private void JTFQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQActionPerformed

    private void JTFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDActionPerformed
    DataL ld = new DataL();
    ArrayList<DataRec> ListaDatitos;
    File objArchivo = new File();
    private void JBDecifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDecifrarActionPerformed
        ListaDatitos = objArchivo.leerCif();
        String cifrado = String.valueOf(ListaDatitos.get(0).getMsjCifrado());
        String descifrado = String.valueOf(ListaDatitos.get(0).getMensaje());

        ld.getDescifrado();
        JTAMensaje.setText("Mensaje cifrado: " + cifrado + "\nMensaje descifrado: " + descifrado);
    }//GEN-LAST:event_JBDecifrarActionPerformed

    Rsa rsa = new Rsa();
    BigInteger n, q, p, totien, e, d;
    BigInteger[] msjCifrado;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int tamanoPrimo = Integer.parseInt(JTFTamano_numero.getText());
        this.JTFE.setText("0");
        this.JTFD.setText("0");
        this.JTFN.setText("0");
        this.JTFP.setText("0");
        this.JTFPhi_n.setText("0");
        this.JTFQ.setText("0");
        this.JTAMensaje.setText("");
        DataS data = new DataS(tamanoPrimo, JTFP, JTFQ, JTFN, JTFPhi_n, JTFD, JTFE, JTAMensaje);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTFEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFEActionPerformed

    private void JBCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCifrarActionPerformed
        n = new BigInteger(JTFN.getText());
        q = new BigInteger(JTFQ.getText());
        p = new BigInteger(JTFP.getText());
        totien = new BigInteger(JTFPhi_n.getText());
        e = new BigInteger(JTFE.getText());
        d = new BigInteger(JTFD.getText());
        msjCifrado = rsa.encriptar(JTAMensaje.getText(), e, n);
        ld.addCifrado(0, n, q, p, totien, e, d, "porto", Integer.parseInt(JTAMensaje.getText()), msjCifrado);
        ld.grabarCifrado();
    }//GEN-LAST:event_JBCifrarActionPerformed

    private void JBObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBObtenerActionPerformed

        ld.getDatosArch();
        ListaDatitos = objArchivo.leer();

        JTFE.setText(ListaDatitos.get(0).getE().toString());
        JTFD.setText(ListaDatitos.get(0).getD().toString());
        JTFN.setText(ListaDatitos.get(0).getN().toString());
        JTFP.setText(ListaDatitos.get(0).getP().toString());
        JTFPhi_n.setText(ListaDatitos.get(0).getTotient().toString());
        JTFQ.setText(ListaDatitos.get(0).getQ().toString());
        JTAMensaje.setText("");

    }//GEN-LAST:event_JBObtenerActionPerformed

    private void guardarRSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarRSAActionPerformed
        n = new BigInteger(JTFN.getText());
        q = new BigInteger(JTFQ.getText());
        p = new BigInteger(JTFP.getText());
        totien = new BigInteger(JTFPhi_n.getText());
        e = new BigInteger(JTFE.getText());
        d = new BigInteger(JTFD.getText());
        ld.addRSA(Integer.parseInt(JTFTamano_numero.getText()), n, q, p, totien, e, d, "porto");
        ld.grabarRSA();
    }//GEN-LAST:event_guardarRSAActionPerformed

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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCifrar;
    private javax.swing.JButton JBDecifrar;
    private javax.swing.JButton JBObtener;
    private javax.swing.JTextArea JTAMensaje;
    private javax.swing.JTextField JTFD;
    private javax.swing.JTextField JTFE;
    private javax.swing.JTextField JTFN;
    private javax.swing.JTextField JTFP;
    private javax.swing.JTextField JTFPhi_n;
    private javax.swing.JTextField JTFQ;
    private javax.swing.JTextField JTFTamano_numero;
    private javax.swing.JButton guardarRSA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
