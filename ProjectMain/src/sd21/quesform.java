package sd21;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class quesform extends javax.swing.JFrame 
{
   
   int n=1;
   int n1=1;
   int n2=1;

   public String t1;
   
    public quesform() 
    {
       initComponents();
       this.setLocationRelativeTo(null);
          
    }
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        QT = new javax.swing.JTextField();
        OpATxt = new javax.swing.JTextField();
        OpCTxt = new javax.swing.JTextField();
        OpBTxt = new javax.swing.JTextField();
        OpDTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ques_typeTxt = new javax.swing.JComboBox<>();
        AnsTypeTxt = new javax.swing.JComboBox<>();
        com = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        minimise2 = new javax.swing.JLabel();
        maximiser = new java.awt.Button();
        exit = new javax.swing.JLabel();
        QuesTxt = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Question No:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Question  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Option A:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Option B:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Option C:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Option D:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Answer:");

        add.setBackground(new java.awt.Color(0, 51, 51));
        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 204, 204));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        QT.setToolTipText("");
        QT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        QT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTActionPerformed(evt);
            }
        });

        OpATxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OpATxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpATxtActionPerformed(evt);
            }
        });

        OpCTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OpBTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OpBTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpBTxtActionPerformed(evt);
            }
        });

        OpDTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Question Type:");

        Ques_typeTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));

        AnsTypeTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setToolTipText("      ");

        jTextField1.setBackground(new java.awt.Color(0, 51, 51));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 255, 255));
        jTextField1.setText("       QUESTION FORM");
        jTextField1.setBorder(null);

        minimise2.setBackground(new java.awt.Color(204, 255, 255));
        minimise2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimise2.setForeground(new java.awt.Color(255, 204, 204));
        minimise2.setText(" -");
        minimise2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimise2MouseClicked(evt);
            }
        });

        maximiser.setBackground(new java.awt.Color(255, 204, 204));
        maximiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximiserMouseClicked(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 51, 51));
        exit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 204, 204));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(minimise2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(exit)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(minimise2)
                            .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(maximiser, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        QuesTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        QuesTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        QuesTxt.setMinimumSize(new java.awt.Dimension(20, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ques_typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OpATxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OpCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(86, 86, 86)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OpBTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OpDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(AnsTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(QuesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpATxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnsTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ques_typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 919, 504);
    }// </editor-fold>//GEN-END:initComponents

    private void QuesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuesTxtActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       File fr=new File("NewFileE.txt");
       try { 
           Scanner sc=new Scanner(fr);
           String str=sc.next();
           n=Integer.valueOf(str)+1;
       } catch (FileNotFoundException ex) {
           Logger.getLogger(quesform.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       File fr1=new File("NewFileM.txt");
       try { 
           Scanner sc=new Scanner(fr1);
           String str1=sc.next();
           n1=Integer.valueOf(str1)+1;
       } catch (FileNotFoundException ex) {
           Logger.getLogger(quesform.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       File fr2=new File("NewFileH.txt");
       try { 
           Scanner sc=new Scanner(fr2);
           String str2=sc.next();
           n2=Integer.valueOf(str2)+1;
       } catch (FileNotFoundException ex) {
           Logger.getLogger(quesform.class.getName()).log(Level.SEVERE, null, ex);
       }
      
       
     String s=QT.getText(); 
     String Ques=QuesTxt.getText();
     String Option_A =OpATxt.getText(); 
     String Option_B =OpBTxt.getText(); 
     String Option_C =OpCTxt.getText(); 
     String Option_D =OpDTxt.getText();
    
       // int a=Integer.parseInt(s);
      // a=a+1;
     //qt.setText("  " +a );
       
         /*if(a>10){
                 qt.setText(null );
             com.setText("Sorry!You cannot insert anymore...");*/
        
     String Answer=(String)AnsTypeTxt.getSelectedItem();
    // JOptionPane.showMessageDialog(this, "You have selected "+Answer);
     String QuesType=(String)Ques_typeTxt.getSelectedItem();
     //JOptionPane.showMessageDialog(this, "You have selected "+QuesType);
   if(QT.getText().isEmpty() || QuesTxt.getText().isEmpty() || OpATxt.getText().isEmpty() || OpBTxt.getText().isEmpty() || OpCTxt.getText().isEmpty() || OpDTxt.getText().isEmpty()){
    //if(QT.equals("") || QuesTxt.equals("") || OpATxt.equals("") || OpBTxt.equals("") || OpCTxt.equals("") || OpDTxt.equals("")){
           JOptionPane.showMessageDialog(null,"Enter necessery data .. ");
       }
   else if (QuesType== "Easy"){
       try{
        
         FileWriter writer=new FileWriter("EasyQuestion.txt",true);
         BufferedWriter WriteFileBuffer=new  BufferedWriter(writer); 
         
         
         //WriteFileBuffer.write(""+n );
         //WriteFileBuffer.write(";");
         
         WriteFileBuffer.write( s);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Ques);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_A);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_B);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_C);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_D);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Answer);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(QuesType);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(""+n );
        
         WriteFileBuffer.newLine();
       
        
         
         FileWriter wr=new FileWriter("NewFileE.txt",false);
         
         
         BufferedWriter WrFileBuffer=new  BufferedWriter(wr); 
         WrFileBuffer.write( Integer.toString(n));
         n++;
       
         WrFileBuffer.close();
         WriteFileBuffer.close();
         
         int a=Integer.parseInt(s);
          a=a+1;
           if(a<=10){
           QT.setText(""+a );
           }
           else if (a>10){
             QT.setText(null );
             com.setText("Sorry!You cannot insert anymore...");
        }
          QuesTxt.setText(null);
          OpATxt.setText(null);
          OpBTxt.setText(null);
          OpCTxt.setText(null);
          OpDTxt.setText(null);
          
         if(a==10 ){
          JOptionPane.showMessageDialog(rootPane,"All qsns saved successfully ");
         }
          }catch(Exception e)
         {
          JOptionPane.showMessageDialog(rootPane,"Error");   
         }
     
      }
  else if (QuesType== "Medium"){
       try{
         FileWriter writer=new FileWriter("MediumQuestion.txt",true);
         BufferedWriter WriteFileBuffer=new  BufferedWriter(writer); 
         
          
        // WriteFileBuffer.write(""+n1 );
         //WriteFileBuffer.write(";");
         WriteFileBuffer.write( s);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Ques);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_A);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_B);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_C);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_D);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Answer);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(QuesType);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(""+n1 );
         WriteFileBuffer.newLine();
         
         FileWriter wr1=new FileWriter("NewFileM.txt",false);
         
         
         BufferedWriter WrFileBuffer=new  BufferedWriter(wr1); 
         WrFileBuffer.write( Integer.toString(n1));
         n1++;
       
         WrFileBuffer.close();
         WriteFileBuffer.close();
         int a=Integer.parseInt(s);
          a=a+1;
           if(a<=10){
           QT.setText(""+a );
           }
           else if (a>10){
             QT.setText(null );
             com.setText("Sorry!You cannot insert anymore...");
        }
          QuesTxt.setText(null);
          OpATxt.setText(null);
          OpBTxt.setText(null);
          OpCTxt.setText(null);
          OpDTxt.setText(null);
          
         if(a==10){
          JOptionPane.showMessageDialog(rootPane,"All qsns saved successfully ");
         }
          }catch(Exception e)
         {
            // e.printStackTrace();
          JOptionPane.showMessageDialog(rootPane,"Error");   
         }
  }else if (QuesType=="Hard"){
       try{
         FileWriter writer=new FileWriter("HardQuestion.txt",true);
         BufferedWriter WriteFileBuffer=new  BufferedWriter(writer); 
         
          
         //WriteFileBuffer.write(""+n2 );
         //WriteFileBuffer.write(";");
         WriteFileBuffer.write( s);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Ques);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_A);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_B);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_C);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Option_D);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(Answer);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(QuesType);
         WriteFileBuffer.write(";");
         WriteFileBuffer.write(""+n2 );
         WriteFileBuffer.newLine();
         
        FileWriter wr2=new FileWriter("NewFileH.txt",false);
         
         
         BufferedWriter WrFileBuffer=new  BufferedWriter(wr2); 
         WrFileBuffer.write( Integer.toString(n2));
         n2++;
       
         WrFileBuffer.close();
         WriteFileBuffer.close();
         int a=Integer.parseInt(s);
          a=a+1;
           if(a<=10){
           QT.setText(""+a );
           }
           else if (a>10){
             QT.setText(null );
             com.setText("Sorry!You cannot insert anymore...");
        }
          QuesTxt.setText(null);
          OpATxt.setText(null);
          OpBTxt.setText(null);
          OpCTxt.setText(null);
          OpDTxt.setText(null);
          
         if(a==10){
          JOptionPane.showMessageDialog(rootPane,"All qsns saved successfully ");
         }
          }catch(Exception e)
         {
            // e.printStackTrace();
          JOptionPane.showMessageDialog(rootPane,"Error");   
         }
   }
    }//GEN-LAST:event_addActionPerformed

    private void QTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTActionPerformed
    /* String s=qt.getText();
      int a;
              a=Integer.parseInt(s);
        /*if(a<10){
            com.setText("You have to enter atleast 10 question...");
        
    }
        else if(a>10){
             com.setText("Sorry!You cannot insert anymore...");
        }*/
    }//GEN-LAST:event_QTActionPerformed

    private void OpATxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpATxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpATxtActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void OpBTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpBTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpBTxtActionPerformed

    private void minimise2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimise2MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimise2MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
           System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void maximiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximiserMouseClicked
      /* boolean maximised =true;
        // TODO add your handling code here:
        if(maximised){
            quesform.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
            quesform.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximised=false;
        }
        else{
            setExtendedState(JFrame.NORMAL);
            maximised=true;
        }*/
    }//GEN-LAST:event_maximiserMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         boolean maximised =false;
        // TODO add your handling code here:
        if(maximised){
            quesform.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
            quesform.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximised=false;
        }
        else{
            setExtendedState(JFrame.NORMAL);
            maximised=true;
        }
        
    }//GEN-LAST:event_formWindowOpened
  
    
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
            java.util.logging.Logger.getLogger(quesform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quesform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quesform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quesform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quesform().setVisible(true);
                
              //quesform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnsTypeTxt;
    private javax.swing.JTextField OpATxt;
    private javax.swing.JTextField OpBTxt;
    private javax.swing.JTextField OpCTxt;
    private javax.swing.JTextField OpDTxt;
    private javax.swing.JTextField QT;
    private java.awt.TextArea QuesTxt;
    private javax.swing.JComboBox<String> Ques_typeTxt;
    private javax.swing.JButton add;
    private javax.swing.JLabel com;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Button maximiser;
    private javax.swing.JLabel minimise2;
    // End of variables declaration//GEN-END:variables

    private void getExtendedState(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
