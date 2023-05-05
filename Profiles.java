
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class Profiles extends javax.swing.JFrame {

    public Profiles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FrontEnd();

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProfileActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomePageActionPerformed(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePageMouseClicked(evt);
            }
        });
    }// </editor-fold>                        

    private void showProfileActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        showProfile Jf = new showProfile();
        Jf.setVisible(true);
    }

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
        EditProfile Jf = new EditProfile();
        Jf.setVisible(true);
    }

    private void welcomePageActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         dispose();
        Account Jf = new Account();
        Jf.setVisible(true);
    }

    private void HomePageMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        dispose();
        Main Jf = new Main();
        Jf.setVisible(true);
    }

    private void FrontEnd() {
        javax.swing.JPanel jPanel1;
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2;
        javax.swing.JLabel jLabel3;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE
        );
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(55, 165, 251));
        jButton1.setText("تعديل المعلومات الشخصيه ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 3, true));
        //BUTTON2
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(55, 165, 251));
        jButton2.setText("عرض المعلومات الشخصيه ");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 3, true));
        //BUTTON 3
        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(251, 55, 55));
        jButton3.setText("الخروج");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 55, 55), 3, true));
        //Label 3 for the personal info
        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("المعلومات الشخصية");
        //Lebel 2 for design
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\boy1.png")); // NOI18N
        //Label 5 for go back
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\arrow.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel3)
                                                .addGap(52, 52, 52)))
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();

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
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   
}

class EditProfile extends javax.swing.JFrame {

    String newFirstName, newLastName, newUsername, newEmail, newPassword;
    private String[] UserInformation;

    public EditProfile() {
        UserInformation = Login.customerInformation;
        firstnamefield = new JTextField();
        firstnamefield.setText(UserInformation[0]);
        lastnamefield = new JTextField();
        lastnamefield.setText(UserInformation[1]);
        usernamefield = new JTextField();
        usernamefield.setText(UserInformation[2]);
        emailfield = new JTextField();
        emailfield.setText(UserInformation[3]);
        passwordfield = new JTextField();
        passwordfield.setText(UserInformation[4]);
        initComponents();

        // Initialize the UI components and set the text of the text fields
        firstnamefield.setText(UserInformation[0]);
        lastnamefield.setText(UserInformation[1]);
        usernamefield.setText(UserInformation[2]);
        emailfield.setText(UserInformation[3]);
        passwordfield.setText(UserInformation[4]);
        File file = new File(UserInformation[2] + ".txt");
        file.delete();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        firstnamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        usernamefield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        Design();

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfilesButtonActionPerformed(evt);
            }
        });

    }// </editor-fold>                        

    private void ProfilesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        saveProfile();
        dispose();
        Profiles Jf = new Profiles();
        Jf.setVisible(true);
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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    public void saveProfile() {
        // Get the new information entered by the user from the text fields
        newFirstName = firstnamefield.getText();
        newLastName = lastnamefield.getText();
        newUsername = usernamefield.getText();
        newEmail = emailfield.getText();
        newPassword = passwordfield.getText();
        UserInformation = Login.customerInformation;
        // Check if the new username is already in use
        if (!newUsername.equals(UserInformation[2])) {
            File file = new File(newUsername + ".txt");
            if (file.exists()) {
                JOptionPane.showMessageDialog(this, "Username is already in use", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Validate the email address entered by the user
            String input = newEmail;
            if (!isValidEmail(input)) {
                JOptionPane.showMessageDialog(this, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate the password entered by the user
            String password = newPassword;
            if (!isPasswordValid(password)) {
                JOptionPane.showMessageDialog(this, "Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate the first name and last name entered by the user
            if (!isValidName(newFirstName, newLastName)) {
                JOptionPane.showMessageDialog(this, "Please enter valid first and last names", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate the username entered by the user
            if (!isValidUsername(newUsername)) {
                JOptionPane.showMessageDialog(this, "Please enter a valid username (alphanumeric characters and underscores only, 5-20 characters long)", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Delete the existing file
            File file = new File(UserInformation[2] + ".txt");
            file.delete();

            // Update the customerInformation array with the new information
            UserInformation[0] = newFirstName;
            UserInformation[1] = newLastName;
            UserInformation[2] = newUsername;
            UserInformation[3] = newEmail;
            UserInformation[4] = newPassword;

            // Write the updated information to the file
            // Write the updated information to the file
            boolean success = updateProfileFile(UserInformation);
            if (success) {
                JOptionPane.showMessageDialog(this, "Profile updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error updating profile", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private boolean updateProfileFile(String[] UserInformation) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(UserInformation[2] + ".txt"));
            writer.write("First Name: " + UserInformation[0]);
            writer.newLine();
            writer.write("Last Name: " + UserInformation[1]);
            writer.newLine();
            writer.write("Username: " + UserInformation[2]);
            writer.newLine();
            writer.write("Email: " + UserInformation[3]);
            writer.newLine();
            writer.write("Password: " + UserInformation[4]);
            writer.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public boolean isValidEmail(String email) {
        // Define the regular expression pattern for a valid email address
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+..[.a-z]";
        // Create a Pattern object with the emailRegex pattern
        Pattern pattern = Pattern.compile(emailRegex);
        // Create a Matcher object to check if the email matches the pattern
        Matcher matcher = pattern.matcher(email);
        // Return true if the email matches the pattern, false otherwise
        return matcher.matches();
    }

    public boolean isPasswordValid(String password) {
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
        // Check each character in the password string
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowercase = true;
            } else if (Character.isDigit(c)) {
                containsDigit = true;
            }
        }
        boolean meetsLengthRequirement = password.length() >= 8;
        // Return true if the password contains at least one uppercase letter, one lowercase letter, and one digit
        return containsUppercase && containsLowercase && containsDigit && meetsLengthRequirement;
    }

    public boolean isValidName(String firstname, String lastname) {
        // Check if the first and last names are not empty
        if (firstname.isEmpty() || lastname.isEmpty()) {
            return false;
        }
        // Check if the first and last names contain only letters and whitespace
        if (!firstname.matches("[a-zA-Z ]+") || !lastname.matches("[a-zA-Z ]+")) {
            return false;
        }
        // Check if the first and last names are not too short or too long
        if (firstname.length() < 2 || firstname.length() > 20 || lastname.length() < 2 || lastname.length() > 20) {
            return false;
        }
        // All checks passed, the names are valid
        return true;
    }

    public boolean isValidUsername(String username) {
        // Check if the username contains only alphanumeric characters and underscores
        if (!username.matches("[a-zA-Z0-9_]+")) {
            return false;
        }
        // Check if the username is not too short or too long
        if (username.length() < 5 || username.length() > 20) {
            return false;
        }
        // All checks passed, the username is valid
        return true;
    }

    private void Design() {
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel10;
        javax.swing.JLabel jLabel11;
        javax.swing.JLabel jLabel2;
        javax.swing.JLabel jLabel4;
        javax.swing.JLabel jLabel5;
        javax.swing.JLabel jLabel6;
        javax.swing.JLabel jLabel7;
        javax.swing.JLabel jLabel8;
        javax.swing.JLabel jLabel9;
        javax.swing.JPanel jPanel1;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\free shape2.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\free shape.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("تعديل المعلومات الشخصية :");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("الاسم الاول:");
        jLabel6.setToolTipText("");

        firstnamefield.setBackground(new java.awt.Color(255, 255, 255));
        firstnamefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("اسم العائلة:  ");

        lastnamefield.setBackground(new java.awt.Color(255, 255, 255));
        lastnamefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("اسم المستخدم :");

        usernamefield.setBackground(new java.awt.Color(255, 255, 255));
        usernamefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("البريد الاكتروني: ");

        emailfield.setBackground(new java.awt.Color(255, 255, 255));
        emailfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("كلمة السر: ");

        passwordfield.setBackground(new java.awt.Color(255, 255, 255));
        passwordfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(55, 165, 251));
        jButton1.setText("حفظ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 3, true));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\boy2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel10))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel7)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(firstnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(emailfield, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(usernamefield))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(51, 51, 51)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel9))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel8)))))
                                                .addGap(42, 42, 42))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(125, 125, 125)))
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGap(224, 224, 224)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(34, 34, 34)))))
                                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(firstnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(119, 119, 119)
                                                .addComponent(jLabel4))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JTextField passwordfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration                   
}

class showProfile extends javax.swing.JFrame {

    public showProfile() {
        String[] customerInformation;
        customerInformation = Login.customerInformation;
        firstNameField = new JTextField();
        firstNameField.setText(customerInformation[0]);
        lastNameField = new JTextField();
        lastNameField.setText(customerInformation[1]);
        usernameField = new JTextField();
        usernameField.setText(customerInformation[2]);
        emailField = new JTextField();
        emailField.setText(customerInformation[3]);
        passwordField = new JTextField();
        passwordField.setText(customerInformation[4]);
        initComponents();

        // Initialize the UI components and set the text of the text fields
        firstNameField.setText(customerInformation[0]);
        lastNameField.setText(customerInformation[1]);
        usernameField.setText(customerInformation[2]);
        emailField.setText(customerInformation[3]);
        passwordField.setText(customerInformation[4]);
    }
    @SuppressWarnings("unchecked")                        
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
    }// </editor-fold>                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        dispose();
        Profiles Jf = new Profiles();
        Jf.setVisible(true);
    }

    private void FronEnd() {
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel10;
        javax.swing.JLabel jLabel3;
        javax.swing.JLabel jLabel4;
        javax.swing.JLabel jLabel5;
        javax.swing.JLabel jLabel6;
        javax.swing.JLabel jLabel7;
        javax.swing.JLabel jLabel8;
        javax.swing.JLabel jLabel9;
        javax.swing.JPanel jPanel1;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setResizable(
                false);

        jPanel1.setBackground(
                new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        jLabel2.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\arrow.png")); // NOI18N
        jLabel3.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\free shape.png")); // NOI18N

        jLabel4.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\boy3.png")); // NOI18N

        jLabel5.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel5.setText(
                "عرض المعلومات الشخصية :");

        jLabel6.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel6.setText(
                "الاسم الاول");

        firstNameField.setEditable(
                false);
        firstNameField.setBackground(
                new java.awt.Color(255, 255, 255));
        firstNameField.setBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel7.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel7.setText(
                "اسم المستخدم");

        usernameField.setEditable(
                false);
        usernameField.setBackground(
                new java.awt.Color(255, 255, 255));
        usernameField.setBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        lastNameField.setEditable(
                false);
        lastNameField.setBackground(
                new java.awt.Color(255, 255, 255));
        lastNameField.setBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel8.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel8.setText(
                "اسم العائلة");

        jLabel9.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel9.setText(
                "البريد الاكتروني");

        emailField.setEditable(
                false);
        emailField.setBackground(
                new java.awt.Color(255, 255, 255));
        emailField.setBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        jLabel10.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel10.setText(
                "كلمة السر");

        passwordField.setEditable(
                false);
        passwordField.setBackground(
                new java.awt.Color(255, 255, 255));
        passwordField.setBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(55, 165, 251), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(27, 27, 27))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane()
                .setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration                   
}
