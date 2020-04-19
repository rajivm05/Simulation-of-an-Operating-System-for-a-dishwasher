
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajiv
 */
public class input extends javax.swing.JFrame {

    /**
     * Creates new form input
     */
    public input(String id) {
        initComponents();
        this.getContentPane().setBackground(Color.black);
        this.setSize(920, 419);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        id_label.setText(id);
        id_label.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        id_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        sl1 = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 419));
        setPreferredSize(new java.awt.Dimension(920, 419));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/auto.PNG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cooker.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eco.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glass.PNG"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiet.PNG"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rinse.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, -1));

        rb1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb1.setForeground(new java.awt.Color(255, 255, 255));
        rb1.setText("Heavy Utensils");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        rb2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb2.setForeground(new java.awt.Color(255, 255, 255));
        rb2.setText("Auto");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, -1));

        rb4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rb4);
        rb4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb4.setForeground(new java.awt.Color(255, 255, 255));
        rb4.setText("Glassware");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        getContentPane().add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 103, -1));

        rb3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb3.setForeground(new java.awt.Color(255, 255, 255));
        rb3.setText("Eco");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        getContentPane().add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 70, -1));

        rb5.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rb5);
        rb5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb5.setForeground(new java.awt.Color(255, 255, 255));
        rb5.setText("Quiet");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });
        getContentPane().add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 103, -1));

        rb6.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rb6);
        rb6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb6.setForeground(new java.awt.Color(255, 255, 255));
        rb6.setText("Qucik Rinse");
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });
        getContentPane().add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 103, -1));

        sl1.setBackground(new java.awt.Color(0, 0, 0));
        sl1.setForeground(new java.awt.Color(255, 255, 255));
        sl1.setMajorTickSpacing(5);
        sl1.setMaximum(50);
        sl1.setMinorTickSpacing(5);
        sl1.setPaintLabels(true);
        sl1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl1StateChanged(evt);
            }
        });
        getContentPane().add(sl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 280, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 150, 30));

        l1.setBackground(new java.awt.Color(0, 0, 0));
        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 50, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb6ActionPerformed

    private void sl1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl1StateChanged
        l1.setText(""+(sl1.getValue()));        // TODO add your handling code here:
    }//GEN-LAST:event_sl1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //CODE FOR I/O MANAGEMENT
double wt=0;
double mul=0;
int temp=0,arms=0;
String type="";
boolean flag=false;
if(rb1.isSelected()==true)
{
    mul=2;
    temp=70;
    arms=2;
    type=rb1.getText();
}
else if(rb2.isSelected()==true || rb3.isSelected()==true || rb5.isSelected()==true || rb6.isSelected()==true)
{
    mul=0.5;
    if(rb2.isSelected()==true)
    {
        temp=45;
        arms=2;
        type=rb2.getText();
    }
    if(rb3.isSelected()==true)
    {
        temp=50;
        arms=1;
        type=rb3.getText();
    }
    if(rb5.isSelected()==true)
    {
        temp=50;
        arms=1;
        type=rb5.getText();
    }
    if(rb6.isSelected()==true)
    {
        temp=28;
        arms=2;
        type=rb6.getText();
    }
}
else if(rb4.isSelected()==true)
{
    mul=0.38;
    temp=40;
    arms=1;
    type=rb4.getText();
}
wt=sl1.getValue()*mul;
double energy= wt*temp*arms;
if(wt>15)
    JOptionPane.showMessageDialog(null,"The drum is overloaded! Kindly remove some dishes!");
else if(wt<2)
    JOptionPane.showMessageDialog(null,"The drum is underloaded! Kindly put in some more dishes!");
else
{
    this.dispose();
    if(rb3.isSelected()==true)
    {
        flag=true;
    }
    else
        flag=false;
    new output(id_label.getText(),type,arms,temp,energy,wt,flag).setVisible(true);
    //show output frame!!
    System.out.println(type);
    System.out.println(arms);
    System.out.println(temp);
    System.out.println(energy);
    System.out.println(wt);
    System.out.println(flag);
}


        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String id="";
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel id_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JSlider sl1;
    // End of variables declaration//GEN-END:variables
}
