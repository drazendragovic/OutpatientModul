/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Console.outpatient_consola.Consola;
import Gui.forms.MainForm;
import static Main.Utilities.Utils.*;


/**
 *
 * @author Drazen Dragovic
 */
public class OptionFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form OptionFrame
     */
    public OptionFrame() {
        initComponents();
        SetFramePosition(this);
        currentDate(txtDate, txtTime);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsole = new javax.swing.JButton();
        btnGui = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtDate = new javax.swing.JMenu();
        txtTime = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        btnConsole.setText("Console");
        btnConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsoleActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsole);
        btnConsole.setBounds(240, 290, 130, 40);

        btnGui.setText("GUI");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });
        getContentPane().add(btnGui);
        btnGui.setBounds(240, 350, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/images/OptionFrameLogo.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 450);

        jMenuBar1.setBackground(new java.awt.Color(235, 235, 235));

        txtDate.setText("Date");
        jMenuBar1.add(txtDate);

        txtTime.setText("Time");
        jMenuBar1.add(txtTime);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        MainForm mf = new MainForm();
        mf.setVisible(true);
        SetFramePosition(mf);
        this.dispose();
        
    }//GEN-LAST:event_btnGuiActionPerformed

    private void btnConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsoleActionPerformed
        this.dispose();
        Consola con = new Consola();
        con.run();
    }//GEN-LAST:event_btnConsoleActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsole;
    private javax.swing.JButton btnGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu txtDate;
    private javax.swing.JMenu txtTime;
    // End of variables declaration//GEN-END:variables


}
