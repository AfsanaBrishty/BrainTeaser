/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd21;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.awt.Rectangle;
//import javafx.scene.paint.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author HP
 */
public class CoverPage extends javax.swing.JFrame {

    /**
     * Creates new form CoverPage
     */
    public CoverPage() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
       /* ber.setUI(new BasicProgressBarUI()
        {
           protected void paintDeterminate(Graphics g,JComponent jc){
               Graphics g2d=(Graphics2D)g;
               int bwidth=ber.getWidth();
               int bheight=ber.getHeight();
               g2d.setColor(Color.DARK_GRAY);
               double percentage=ber.getPercentComplete();
               bwidth=(int)(bwidth*percentage);
             Rectangle progress = new Rectangle();
              g2d.fillRect(0, 0, bwidth, bheight);
               
           }
        });*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        close4 = new javax.swing.JLabel();
        minimise4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ber = new javax.swing.JProgressBar();
        per = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(34, 49, 63));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        close4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close4.setForeground(new java.awt.Color(255, 255, 255));
        close4.setText("X");
        close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close4MouseClicked(evt);
            }
        });

        minimise4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimise4.setForeground(new java.awt.Color(255, 255, 255));
        minimise4.setText(" -");
        minimise4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimise4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("    BRAINTEASER");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(66, 66, 66)
                .addComponent(minimise4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(close4)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close4)
                    .addComponent(minimise4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 590, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd21/b2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 40, 600, 390);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("                                     Loading...........");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 430, 590, 40);

        ber.setBackground(new java.awt.Color(153, 153, 153));
        ber.setForeground(new java.awt.Color(102, 0, 51));
        ber.setToolTipText("");
        ber.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ber.setDoubleBuffered(true);
        ber.setNextFocusableComponent(ber);
        ber.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                berAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ber.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                berStateChanged(evt);
            }
        });
        getContentPane().add(ber);
        ber.setBounds(0, 456, 590, 10);

        per.setBackground(new java.awt.Color(51, 51, 51));
        per.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        per.setForeground(new java.awt.Color(153, 153, 0));
        per.setToolTipText("");
        per.setOpaque(true);
        getContentPane().add(per);
        per.setBounds(330, 430, 90, 20);

        setSize(new java.awt.Dimension(586, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_close4MouseClicked

    private void minimise4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimise4MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimise4MouseClicked

    private void berAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_berAncestorMoved
         ber.setUI(new BasicProgressBarUI()
        {
           // CoverPage cv=new CoverPage();
           protected void paintDeterminate(Graphics g,JComponent jc){
               Graphics g2d=(Graphics2D)g;
               int bwidth=ber.getWidth();
               int bheight=ber.getHeight();
               g2d.setColor(Color.RED);
               double percentage=ber.getPercentComplete();
               bwidth=(int)(bwidth*percentage);
             Rectangle progress = new Rectangle();
              g2d.fillRect(0, 0, bwidth, bheight);
              // String i = ber.getString();
            //  ber.setValue(0);
            //  ber.setStringPainted(true);
            //jc.setText(Integer.toString(i)+"%");
           }
        });
    }//GEN-LAST:event_berAncestorMoved

    private void berStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_berStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_berStateChanged

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
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
CoverPage cv=new CoverPage();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cv.setVisible(true);
            }
        });
        Identify n=new Identify();
       try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                cv.ber.setValue(i);
              cv.per.setText(Integer.toString(i)+"%");
            }
        }catch(Exception e){
            
        }
        new CoverPage().setVisible(false);
        n.setVisible(true);
        cv.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ber;
    private javax.swing.JLabel close4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel minimise4;
    private javax.swing.JLabel per;
    // End of variables declaration//GEN-END:variables
}
