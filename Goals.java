
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Goals extends javax.swing.JFrame {

    static String[] goalData;

    String name, goalStr, periodStr, username, Ramount, presentage, Addmount;
    int goal, period;
    double monthlyAmount, currentAmount, currentAmount1, Remainingamount;

    public Goals() {
        FrontEnd();
    }

    @SuppressWarnings("unchecked")

    private void FrontEnd() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Namefield = new javax.swing.JTextField();
        Goalfield = new javax.swing.JTextField();
        Estimatedperiodfield = new javax.swing.JTextField();
        done = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        Namefield.setBackground(new java.awt.Color(255, 255, 255));
        Namefield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم الهدف ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        Goalfield.setBackground(new java.awt.Color(255, 255, 255));
        Goalfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الهدف", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        Estimatedperiodfield.setBackground(new java.awt.Color(255, 255, 255));
        Estimatedperiodfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المدة الزمنية", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        done.setBackground(new java.awt.Color(255, 255, 255));
        done.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        done.setForeground(new java.awt.Color(0, 153, 204));
        done.setText("إضافه");
        done.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 0, 51));
        cancel.setText("إلغاء");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 3, true));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                                .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Estimatedperiodfield, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Goalfield, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Namefield, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(89, 89, 89)
                                .addComponent(Namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Goalfield, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Estimatedperiodfield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>           

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {
        saveGoal();
        dispose();
        Main Jf = new Main();
        Jf.setVisible(true);
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        Main Jf = new Main();
        Jf.setVisible(true);
    }

    public void saveGoal() {
        // Get the information entered by the user from the text fields
        name = Namefield.getText();
        goalStr = Goalfield.getText();
        periodStr = Estimatedperiodfield.getText();
        username = Login.customerInformation[2];
        if (name.isEmpty() || goalStr.isEmpty() || periodStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate the input
        if (!isInteger(goalStr) || !isInteger(periodStr)) {
            JOptionPane.showMessageDialog(this, "Goal and period must be integers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        goal = Integer.parseInt(goalStr);
        period = Integer.parseInt(periodStr);
        monthlyAmount = (double) goal / (double) period;
        currentAmount = 0 + currentAmount1;
        Remainingamount = goal - currentAmount;
        //  double completionPercentage = 0.0;
        // Write the information to the file
        writeGoalToFile(username, name, goalStr, periodStr, monthlyAmount, currentAmount, Remainingamount, 0);
        JOptionPane.showMessageDialog(this, "Goal saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void writeGoalToFile(String username, String name, String goalStr, String periodStr, double monthlyAmount, double currentAmount, double Remainingamount, int completionPercentage) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(username + ".txt", true));
            writer.newLine();
            writer.write("**************GOALS************************");
            writer.newLine();
            writer.write("Goal Name: " + name);
            writer.newLine();
            writer.write("Goal Amount: " + goalStr);
            writer.newLine();
            writer.write("Estimated Period: " + periodStr);
            writer.newLine();
            writer.write("Monthly Amount Needed: " + monthlyAmount);
            writer.newLine();
            writer.write("Current Amount: " + currentAmount);
            writer.newLine();
            writer.write("Remaining Amount: " + Remainingamount);
            writer.newLine();
            writer.write("Completion Percentage: " + completionPercentage + "%");
            writer.newLine();
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving goal", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String[] readGoal(String goalName) {
        String[] goalData = new String[5];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(username + ".txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Goal Name: ") && line.substring(11).equals(goalName)) {
                    // Goal name matches, so read the goal amount
                    line = reader.readLine();
                    if (line.startsWith("Goal Amount: ")) {
                        goalData[0] = line.substring(14);
                    }
                    if (line.startsWith("Estimated Period: ")) {
                        goalData[1] = line.substring(14);
                    }
                    if (line.startsWith("Monthly Amount Needed: ")) {
                        goalData[2] = line.substring(14);
                    }
                    if (line.startsWith("Current Amount: ")) {
                        goalData[3] = line.substring(14);
                    }
                    if (line.startsWith("Remaining Amount:  ")) {
                        goalData[4] = line.substring(14);
                    }
                    break;
                }
            }
            reader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading goal", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return goalData;
    }

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(Goals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Goals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Goals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Goals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Goals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Estimatedperiodfield;
    private javax.swing.JTextField Goalfield;
    private javax.swing.JTextField Namefield;
    private javax.swing.JButton cancel;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration        
}
