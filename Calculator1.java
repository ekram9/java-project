package calculator;


public class Calculator1 extends javax.swing.JFrame {

    double f_num,s_num,result;
    String operation,answer;
    public Calculator1() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Disply = new javax.swing.JTextField();
        cal1 = new javax.swing.JButton();
        cal3 = new javax.swing.JButton();
        cal2 = new javax.swing.JButton();
        cal4 = new javax.swing.JButton();
        cal5 = new javax.swing.JButton();
        cal6 = new javax.swing.JButton();
        calminus = new javax.swing.JButton();
        calplus = new javax.swing.JButton();
        cal7 = new javax.swing.JButton();
        calentu = new javax.swing.JButton();
        cal8 = new javax.swing.JButton();
        cal9 = new javax.swing.JButton();
        Ok = new javax.swing.JButton();
        cal0 = new javax.swing.JButton();
        caldivid = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Disply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplyActionPerformed(evt);
            }
        });

        cal1.setText("1");
        cal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal1ActionPerformed(evt);
            }
        });

        cal3.setText("3");
        cal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal3ActionPerformed(evt);
            }
        });

        cal2.setText("2");
        cal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal2ActionPerformed(evt);
            }
        });

        cal4.setText("4");
        cal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal4ActionPerformed(evt);
            }
        });

        cal5.setText("5");
        cal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal5ActionPerformed(evt);
            }
        });

        cal6.setText("6");
        cal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal6ActionPerformed(evt);
            }
        });

        calminus.setText("-");
        calminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calminusActionPerformed(evt);
            }
        });

        calplus.setText("+");
        calplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calplusActionPerformed(evt);
            }
        });

        cal7.setText("7");
        cal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal7ActionPerformed(evt);
            }
        });

        calentu.setText("*");
        calentu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calentuActionPerformed(evt);
            }
        });

        cal8.setText("8");
        cal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal8ActionPerformed(evt);
            }
        });

        cal9.setText("9");
        cal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal9ActionPerformed(evt);
            }
        });

        Ok.setText("=");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        cal0.setText("0");
        cal0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal0ActionPerformed(evt);
            }
        });

        caldivid.setText("/");
        caldivid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caldividActionPerformed(evt);
            }
        });

        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 255, 0));
        jTextField1.setText("MD:Ekram Hossen.CSE02006897");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Disply)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cal1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cal2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cal4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cal5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cal7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(cal0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                            .addComponent(cal8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cal9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ok, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(cal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caldivid, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(calminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calentu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addComponent(calplus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Disply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cal1)
                    .addComponent(cal2)
                    .addComponent(cal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calplus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calminus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cal4)
                            .addComponent(cal5)
                            .addComponent(cal6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cal7)
                            .addComponent(cal8)
                            .addComponent(cal9)
                            .addComponent(calentu))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cal0)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ok)
                            .addComponent(caldivid))))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal1ActionPerformed

    String get=Disply.getText();
    Disply.setText(get+ "1");
    
    }//GEN-LAST:event_cal1ActionPerformed

    private void DisplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplyActionPerformed

    private void cal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal2ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+"2");
    }//GEN-LAST:event_cal2ActionPerformed

    private void cal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal3ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+ "3");
    }//GEN-LAST:event_cal3ActionPerformed

    private void calplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calplusActionPerformed
    f_num = Double.parseDouble(Disply.getText());
    Disply.setText("");
    operation="+";
    
    
    
    
    }//GEN-LAST:event_calplusActionPerformed

    private void cal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal4ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+ "4");
    }//GEN-LAST:event_cal4ActionPerformed

    private void cal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal5ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+ "5");
    }//GEN-LAST:event_cal5ActionPerformed

    private void cal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal6ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+ "6");
    }//GEN-LAST:event_cal6ActionPerformed

    private void calminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calminusActionPerformed
    f_num = Double.parseDouble(Disply.getText());
    Disply.setText("");
    operation="-";
    }//GEN-LAST:event_calminusActionPerformed

    private void cal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal7ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+ "7");
    }//GEN-LAST:event_cal7ActionPerformed

    private void cal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal8ActionPerformed
    String get=Disply.getText();
    Disply.setText(get+ "8");
    }//GEN-LAST:event_cal8ActionPerformed

    private void cal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal9ActionPerformed
      String get=Disply.getText();
    Disply.setText(get+ "9");
    }//GEN-LAST:event_cal9ActionPerformed

    private void calentuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calentuActionPerformed
    f_num = Double.parseDouble(Disply.getText());
    Disply.setText("");
    operation="*";
    }//GEN-LAST:event_calentuActionPerformed

    private void cal0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal0ActionPerformed
   String get=Disply.getText();
    Disply.setText(get+ "0");
    }//GEN-LAST:event_cal0ActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
   s_num=Double.parseDouble(Disply.getText());
   switch (operation)
   {
       case "+" :
           result = f_num + s_num;
           answer= String.format("%.0f",result);
           Disply.setText(answer);
           
           break;
           
       case "-" :
            result = f_num - s_num;
           answer= String.format("%.0f",result);
           Disply.setText(answer);
           break ;
           
        case "*" :
            result = f_num * s_num;
            answer= String.format("%.0f",result);
           Disply.setText(answer);
            
           break ;
           
         case "/" :
            result = f_num / s_num;
            answer= String.format("%.0f",result);
           Disply.setText(answer);
           
           break ;  
   
    }//GEN-LAST:event_OkActionPerformed

    private void caldividActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caldividActionPerformed
    f_num = Double.parseDouble(Disply.getText());
    Disply.setText("");
    operation="/";
    }//GEN-LAST:event_caldividActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Disply.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Disply;
    private javax.swing.JButton Ok;
    private javax.swing.JButton cal0;
    private javax.swing.JButton cal1;
    private javax.swing.JButton cal2;
    private javax.swing.JButton cal3;
    private javax.swing.JButton cal4;
    private javax.swing.JButton cal5;
    private javax.swing.JButton cal6;
    private javax.swing.JButton cal7;
    private javax.swing.JButton cal8;
    private javax.swing.JButton cal9;
    private javax.swing.JButton caldivid;
    private javax.swing.JButton calentu;
    private javax.swing.JButton calminus;
    private javax.swing.JButton calplus;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
