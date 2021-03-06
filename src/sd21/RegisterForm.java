/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd21;

import javax.swing.JFrame;
import java.util.regex.*;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author mbc
 */
public class RegisterForm extends javax.swing.JFrame {
      
    RegisterForm rg;
    PreparedStatement ps;
    ResultSet rs;
    Connection cn;
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        minimise1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        passes = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        repass = new javax.swing.JPasswordField();
        gotologin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ulev = new javax.swing.JLabel();
        nlev = new javax.swing.JLabel();
        llev = new javax.swing.JLabel();
        elev = new javax.swing.JLabel();
        plev = new javax.swing.JLabel();
        rlev = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        alev = new javax.swing.JLabel();
        bck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(497, 606));

        box2.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registration Form");

        close1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("X");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });

        minimise1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimise1.setForeground(new java.awt.Color(255, 255, 255));
        minimise1.setText(" -");
        minimise1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimise1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(minimise1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(close1)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close1)
                    .addComponent(minimise1)
                    .addComponent(jLabel4))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(191, 191, 191));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First Name      :");

        passes.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        passes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passesActionPerformed(evt);
            }
        });
        passes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passesKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PassWord       :");

        lastname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameKeyReleased(evt);
            }
        });

        signup.setBackground(new java.awt.Color(149, 165, 166));
        signup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signup.setText("Sign in");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        cancle.setBackground(new java.awt.Color(65, 131, 215));
        cancle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancle.setText("Cancle");
        cancle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancleMouseClicked(evt);
            }
        });
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Last Name      :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User Name     :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email  Id         :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Age                 :");

        firstname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstnameKeyReleased(evt);
            }
        });

        uname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        age.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Confirm pass  :");

        repass.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        repass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repassActionPerformed(evt);
            }
        });
        repass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                repassKeyReleased(evt);
            }
        });

        gotologin.setBackground(new java.awt.Color(150, 40, 27));
        gotologin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gotologin.setText("           Click here to LOGIN");
        gotologin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotologinMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));

        ulev.setForeground(new java.awt.Color(204, 0, 0));

        nlev.setForeground(new java.awt.Color(204, 0, 0));

        llev.setForeground(new java.awt.Color(204, 0, 0));

        elev.setForeground(new java.awt.Color(204, 0, 0));

        plev.setForeground(new java.awt.Color(204, 0, 0));

        rlev.setForeground(new java.awt.Color(204, 0, 0));

        jLabel20.setForeground(new java.awt.Color(204, 0, 0));

        alev.setForeground(new java.awt.Color(204, 0, 0));

        bck.setBackground(new java.awt.Color(149, 165, 166));
        bck.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bck.setText("Back");
        bck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckMouseClicked(evt);
            }
        });
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(cancle))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(elev, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(plev, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                        .addComponent(firstname)
                                        .addComponent(uname)
                                        .addComponent(passes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(llev, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rlev, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(alev, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(nlev, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(signup)
                        .addGap(31, 31, 31)
                        .addComponent(bck))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(gotologin, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(ulev, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(nlev, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(llev, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(ulev, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(elev, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(passes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addComponent(rlev, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addComponent(alev, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup)
                    .addComponent(bck)
                    .addComponent(cancle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gotologin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void minimise1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimise1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimise1MouseClicked

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
       String Fname=firstname.getText().toString();
       String Lname=lastname.getText().toString();
       String Uname=uname.getText().toString();
       String Eid=email.getText().toString();
       String Pass=passes.getText().toString();
       String Repass=repass.getText().toString();
       String Age=age.getText().toString();
       if(Fname.equals("")){
           JOptionPane.showMessageDialog(null,"Enter first name ");
       }
      if(Lname.equals("")){
           JOptionPane.showMessageDialog(null,"Enter last name ");
       }
       
      if(Eid.equals("")){
           JOptionPane.showMessageDialog(null,"Email is mandotory ");
       }
      if(Pass.equals("")){
           JOptionPane.showMessageDialog(null,"Password please. ");
       }
      if(Repass.equals("")){
           JOptionPane.showMessageDialog(null,"Enter Password Again. ");
       }
      if(Age.equals("")){
           JOptionPane.showMessageDialog(null,"Enter your age");
       }
      else{
          JOptionPane.showMessageDialog(null,"Validation succeeded ...");
      } 
       try {
           
          
           String dbURL="net.ucanaccess.jdbc.UcanaccessDriver";
           Class.forName(dbURL);
           String log="jdbc:ucanaccess://D:/sdDatabase.accdb";
           cn= DriverManager.getConnection(log);
           
           JOptionPane.showMessageDialog(null, "connected..");
          saveData();
          
           
    
}catch(Exception e){
    e.printStackTrace();
    
}
    }//GEN-LAST:event_signupActionPerformed
    
    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
        // TODO add your handling code here:
      firstname.setText(null);
      lastname.setText(null);
      uname.setText(null);
      email.setText(null);
      passes.setText(null);
      repass.setText(null);
      age.setText(null);
    }//GEN-LAST:event_cancleActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void gotologinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotologinMouseClicked
       Login log1 =new Login();
        log1.setVisible(true);
        log1.pack();
        log1.setLocationRelativeTo(null);
        log1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_gotologinMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signupMouseClicked

    private void cancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancleMouseClicked
        
    }//GEN-LAST:event_cancleMouseClicked

    private void repassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repassActionPerformed

    private void bckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckMouseClicked
        Login log2 =new Login();
        log2.setVisible(true);
        log2.pack();
        log2.setLocationRelativeTo(null);
        log2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_bckMouseClicked

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bckActionPerformed

    private void passesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passesActionPerformed

    private void firstnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstnameKeyReleased
String PATTERN="[a-zA-Z ]{0,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(firstname.getText());
if(!match.matches()){
    nlev.setText("Please enter correctly.");
}
else{
    nlev.setText(null);
}
    }//GEN-LAST:event_firstnameKeyReleased

    private void lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyReleased
      String PATTERN="[a-zA-Z]{0,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(lastname.getText());
if(!match.matches()){
    llev.setText("Please enter correctly.");
}
else{
    llev.setText(null);
}
    }//GEN-LAST:event_lastnameKeyReleased

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyReleased
    String PATTERN="[a-zA-Z0-9@._-]{0,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(uname.getText());
if(!match.matches()){
    ulev.setText("Please enter correctly.");
}
else{
    ulev.setText(null);
}
    }//GEN-LAST:event_unameKeyReleased

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        String PATTERN="[0-9]{0,2}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(age.getText());
if(!match.matches()){
    alev.setText("Please enter correctly.");
}
else{
    alev.setText(null);
    }//GEN-LAST:event_ageKeyReleased
    }
    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
         String PATTERN="[a-z0-9@._-]{0,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(email.getText());
if(!match.matches()){
    elev.setText("Please enter correctly.");
}
else{
    elev.setText(null);
    }//GEN-LAST:event_emailKeyReleased
    }
    private void passesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passesKeyReleased
        // TODO add your handling code here:
         String PATTERN="[a-zA-Z0-9]{0,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(passes.getText());
if(!match.matches()){
    plev.setText("Please enter correctly.");
}
else{
    plev.setText(null);
    }//GEN-LAST:event_passesKeyReleased
    }
    private void repassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repassKeyReleased
        // TODO add your handling code here:
         String PATTERN="[a-zA-Z0-9]{0,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match =patt.matcher(repass.getText());
if(!match.matches()){
    rlev.setText("Please enter correctly.");
}
else{
    rlev.setText(null);
    }//GEN-LAST:event_repassKeyReleased
    }
    
    
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JLabel alev;
    private javax.swing.JButton bck;
    private javax.swing.JPanel box2;
    private javax.swing.JButton cancle;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel elev;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel gotologin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel llev;
    private javax.swing.JLabel minimise1;
    private javax.swing.JLabel nlev;
    private javax.swing.JPasswordField passes;
    private javax.swing.JLabel plev;
    private javax.swing.JPasswordField repass;
    private javax.swing.JLabel rlev;
    private javax.swing.JButton signup;
    private javax.swing.JLabel ulev;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

    private void saveData() throws SQLException {
        try{
            
       Statement st=cn.createStatement();
        String str="select * from Data";
        rs=st.executeQuery(str);
        while(rs.next()){
            //for each row in table data
        }
        ps=cn.prepareStatement("insert into Data(First Name,Last Name,User Name,Email Id,Password,Confirm Password,Age)values(?,?,?,?,?,?,?)");
        ps.setString(1,firstname.getText());
        ps.setString(2,lastname.getText());
        ps.setString(3,uname.getText());
        ps.setString(4,email.getText());
        ps.setString(5,passes.getText());
        ps.setString(6,repass.getText());
        ps.setString(7,age.getText());
        ps.executeUpdate();
      
        JOptionPane.showMessageDialog(null, "successful..");
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
    }
}
