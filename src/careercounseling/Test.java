
package careercounseling;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;


public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
        Container c=getContentPane();
        c.setBackground(Color.white);  
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C A R E E R     C O U N S E L I N G  ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 470, 30));

        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Answers of this will help you to explore your career ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 560, 20));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("What is your interest?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, -1));

        buttonGroup4.add(jRadioButton1);
        jRadioButton1.setText("Science/Maths");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, 20));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Subjects with fact");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 20));

        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("What you prefer?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        jLabel12.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Are you interested in?");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, -1));

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Which activity will you prefer?");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, -1));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("to draw with your computer");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, 20));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Theoritical Subjects");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 20));

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setText("Engineering");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 120, 20));

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("to draw figure by pencil");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 45, 170, -1));

        buttonGroup4.add(jRadioButton7);
        jRadioButton7.setText("Economics/Finance");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 170, 20));

        buttonGroup5.add(jRadioButton8);
        jRadioButton8.setText("Research new medicine");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 180, 20));

        buttonGroup5.add(jRadioButton9);
        jRadioButton9.setText("Design software/apps/games");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 200, 20));

        buttonGroup6.add(jRadioButton10);
        jRadioButton10.setText("Company secretaries/financial advisor");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 270, 20));

        buttonGroup6.add(jRadioButton11);
        jRadioButton11.setText("Journalism/literature/social works");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 230, 20));

        buttonGroup7.add(jRadioButton12);
        jRadioButton12.setText("Marketing,Administration");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 170, 20));

        buttonGroup7.add(jRadioButton13);
        jRadioButton13.setText("Microbiology,Genetics,Anatomy");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 210, 20));

        buttonGroup8.add(jRadioButton14);
        jRadioButton14.setText("Philosophy/political science");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, 20));

        buttonGroup8.add(jRadioButton15);
        jRadioButton15.setText("Radiobiology/Neuroscience/physiology");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 250, 20));

        buttonGroup3.add(jRadioButton18);
        jRadioButton18.setText("to server the nation");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, 20));

        buttonGroup3.add(jRadioButton19);
        jRadioButton19.setText("to server the nation");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, 20));

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Are you interested in?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, -1));

        jLabel16.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("What you like most?");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, -1));

        jLabel18.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("What you like to do?");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, -1));

        jLabel14.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("What you like to?");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 800, 360));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String q1="";
        if(jRadioButton4.isSelected())
        {
            q1="Theoritical Subjects";
        }
        if(jRadioButton2.isSelected())
        {
           q1="Subjects with fact";
        }
        
        String q2="";
        if(jRadioButton6.isSelected())
        {
            q2="to draw figure by pencil";
        }
        if(jRadioButton3.isSelected())
        {
           q2="to draw with your computer";
        }
        
        String q3="";
        if(jRadioButton18.isSelected())
        {
            q3="to server the nation";
        }
        if(jRadioButton5.isSelected())
        {
           q3="Engineer";
        }
        String q4="";
        if(jRadioButton1.isSelected())
        {
            q4="Science/Maths";
        }
        if(jRadioButton7.isSelected())
        {
           q4="Economics/Finance";
        }
        String q5="";
        if(jRadioButton8.isSelected())
        {
            q5="Research new medicine";
        }
        if(jRadioButton9.isSelected())
        {
           q5="Design software/apps/games";
        }
        
        String q6="";
        if(jRadioButton10.isSelected())
        {
            q6="Company secretaries/financial advisor";
        }
        if(jRadioButton11.isSelected())
        {
           q6="Journalism/literature/social works";
        }
        String q7="";
        if(jRadioButton13.isSelected())
        {
            q7="Microbiology,Genetics,Anatomy";
        }
        if(jRadioButton12.isSelected())
        {
           q7="Marketing,Administration";
        }
        String q8="";
        if(jRadioButton14.isSelected())
        {
            q8="Philosophy/political science";
        }
        if(jRadioButton15.isSelected())
        {
           q8="Radiobiology/Neuroscience/physiology";
        }
        
        
        
        
  JOptionPane.showMessageDialog(this,"Check your result analysis,We hope your choice is now clear!!!");   
  
  
  
        if( q1.equals("Subjects with fact") && q4.equals("Science/Maths")|| q5.equals("Design software/apps/games")||q3.equals("Engineer"))
                    {
                JOptionPane.showMessageDialog(this,"Science/MATHS is the stream,in which you are most interested.GOOD LUCK!!!\n"+
                        "Benefits and advantages of choosing Science stream\n" +
"\n" +
"\n" +
"1.The technological development and the innovations is a new hallmark of the world today. The science\n" +
"  stream will give you more opportunities to prosper.\n" +
"\n" +
"2.Science stream lets you become Smarter, progressive and intelligent.\n" +
"\n" +
"3.As you invariably study the subjects like Physics and Chemistry you will develop the\n" +
"  scientific knowledge and theory and the understanding of the world with the causes and \n" +
"  effects.\n" +
"\n" +
"4.Science has the potential of remarkable and progressive developments on many fronts  \n" +
"  which create infinite possibilities. You obviously become the part of this ever-growing\n" +
"  chain of development.\n" +
"\n" +
"5.You will get much more opportunities to learn new things right from Human body to space to \n" +
"  universe.\n" +
"");   
        }
          
        if(q4.equals("Economics/Finance")|| q1.equals("Theoritical Subjects")|| q6.equals("Company secretaries/financial advisor")|| q7.equals("Marketing,Administration"))
                    {
             JOptionPane.showMessageDialog(this,"COMMERCE is the stream,in which you are most interested.GOOD LUCK!!!\n"
             +" The career in Commerce and Economic field is the opportunity to become the part of the\n" +
" businesses at its core because without finance there nothing will happen and you will\n" +
" be at the helm to \n" +
" manage it.\n" +
"1.The Economics as one of the subject in this stream consists of the relation between \n" +
"  production,distribution, and consumption of goods and services. You come to know how\n" +
"  the Economies the world over run.\n" +
"\n" +
"2.In the Business Study subject, you will essentially learn the operations of the \n" +
"  organization and modern business enterprises.\n" +
"\n" +
"3.In Accountancy, which contains some form of mathematics is actually related to the \n" +
"  financial information about a business entity");   
        }
        if(q2.equals("to draw figure by pencil")&& q6.equals("Journalism/literature/social works")|| q8.equals("Philosophy/political science"))
        {
             JOptionPane.showMessageDialog(this,"ARTS is the stream,in which you are most interested.GOOD LUCK!!!\n"
             +"Benefits and advantages of choosing Arts stream\n" +
"\n" +
"\n" +
"  Studying Arts or Humanities help a student develop powers of analysis and expression.\n" +
"\n" +
"1.Though the study of arts may not make you directly employable, it prepares you for \n" +
"  future jobs that require good communication skills, logical reasoning and analytical \n" +
"  ability.\n" +
"\n" +
"2.Many employers prefer people from Humanities background because not only do they have\n" +
"  the ability to work independently and analytically but they are also experts in \n" +
"  collecting information and writing clearly and coherently.\n" +
"\n" +
"3.The plethora of subjects that a student gets to study under Humanities stream is huge. Subjects \n" +
"  like Geography, Philosophy, History, Sociology, and Political Science open a wide \n" +
"  variety of career options.");   
        }
        if(q7.equals("Microbiology,Genetics,Anatomy")||q8.equals("Radiobiology/Neuroscience/physiology")|| q5.equals("Research new medicine"))
        {
             JOptionPane.showMessageDialog(this,"MEDICAL SCIENCE is the stream,in which you are most interested.GOOD LUCK!!!");   
        }
        
Mainpage mainpage=new Mainpage();
mainpage.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        Mainpage home=new Mainpage();
        home.setVisible(true);
        
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}

