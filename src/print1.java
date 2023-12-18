
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobinath
 */
public class print1 extends javax.swing.JFrame {

    /**
     * Creates new form print1
     */
    public print1() {
        initComponents();
    }
   String repaino;
     String model;
     String sn;  
     String price;
     String pay;
     String due;
   public print1(String repaino, String model, String sn,String price, String pay, String due) throws PrinterException {
        initComponents();
        
         this.repaino = repaino;
        this.model = model;
        this.sn = sn;
        this.price = price;
        this.pay = pay;
        this.due = due;
               
    txtprint.setText(txtprint.getText()+ "*********************************\n");
    txtprint.setText(txtprint.getText()+ "**********SuperPos***************\n");
    txtprint.setText(txtprint.getText()+ "\n");
         

       txtprint.setText(txtprint.getText()+ " " + "Repair No : " + repaino +    "\n");
       txtprint.setText(txtprint.getText()+ " " + "Device Model : " + model +    "\n");
       txtprint.setText(txtprint.getText()+ " " + "Device S/N : " + sn +    "\n");
         
       txtprint.setText(txtprint.getText()+"\n");
       txtprint.setText(txtprint.getText()+"\n");
         
       txtprint.setText(txtprint.getText()+ "      "    + "Repair Fee : " + price +    "\n");
       txtprint.setText(txtprint.getText()+ "      "    + "Pay : " +     pay +    "\n");
       txtprint.setText(txtprint.getText()+ "      "    + "Due : " +  due +    "\n");
         
         txtprint.setText(txtprint.getText()+ "*************************************\n");
        txtprint.setText(txtprint.getText()+ "*************************************\n");
         txtprint.setText(txtprint.getText()+ "Thank you come again..................\n");
         
        
       
    }

    print1(String repaino, String model, String sn, String price, String pay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void printt()
{
     try {
             txtprint.print();
         } catch (PrinterException ex) {
             Logger.getLogger(print.class.getName()).log(Level.SEVERE, null, ex);
         }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtprint.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(print1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtprint;
    // End of variables declaration//GEN-END:variables
}
