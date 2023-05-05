
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Account extends javax.swing.JFrame {
    // Variables declaration      
    javax.swing.JTextField emailfield;
    javax.swing.JTextField firstnameField;
    javax.swing.JTextField lastnameField;
    javax.swing.JPasswordField passwordfield;
    javax.swing.JTextField userfield;
    javax.swing.JLabel LoginB;
    javax.swing.JButton SignUpButton;
    //end of GUI Variables
    String username, email, firstName, lastName;
    private String password;

    public Account() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    public void setPassword() {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    private void initComponents() {
        Design();
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleSignUpButtonAction();
            }
        });
        LoginB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoveToLoginPage(evt);
            }
        });

    }// </editor-fold>                               

    private void MoveToLoginPage(java.awt.event.MouseEvent evt) {
        // Close the current window
        dispose();
        //Create a new instance of the Profiles window
        Login loginWindow = new Login();
        // Show the Profiles window
        loginWindow.setVisible(true);
    }

    private void handleSignUpButtonAction() {
        // Get user inputs from the GUI
        username = userfield.getText();
        email = emailfield.getText();
        password = passwordfield.getText();
        firstName = firstnameField.getText();
        lastName = lastnameField.getText();

        // Check if any of the inputs are empty
        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate the email address
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate the password
        if (!isPasswordValid(password)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid password (8-20 characters, at least one uppercase letter, one lowercase letter, and one digit).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate the first and last names
        if (!isValidName(firstName, lastName)) {
            JOptionPane.showMessageDialog(this, "Please enter valid first and last names (letters and spaces only).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate the username
        if (!isValidUsername(username)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid username (alphanumeric characters and underscores only, 5-20 characters long).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the username already exists
        // Check if the username already exists
        File userFile = new File(username + ".txt");
        if (userFile.exists()) {
            JOptionPane.showMessageDialog(this, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Write the user data to the file
        if (writeUserDataToFile(userFile, firstName, lastName, username, email, password)) {
            JOptionPane.showMessageDialog(this, "Sign up successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Login go = new Login();
            go.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "An error occurred while writing user data to file. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
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
        // Variables declaration   
        javax.swing.JPanel Background;
        javax.swing.JLabel Logo;
        javax.swing.JLabel Q1;
        javax.swing.JLabel Rule1;
        javax.swing.JLabel Rule2;
        javax.swing.JLabel Rule3;
        javax.swing.JLabel Rule4;
        javax.swing.JLabel Title;

        //end of Variables declaration
        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        Q1 = new javax.swing.JLabel();
        LoginB = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        Rule1 = new javax.swing.JLabel();
        Rule2 = new javax.swing.JLabel();
        Rule3 = new javax.swing.JLabel();
        Rule4 = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        lastnameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        Title.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(55, 165, 251));
        Title.setText("إنشاء حساب");

        userfield.setBackground(new java.awt.Color(255, 255, 255));
        userfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم المستخدم", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        userfield.setPreferredSize(new java.awt.Dimension(29, 49));

        passwordfield.setBackground(new java.awt.Color(255, 255, 255));
        passwordfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "كلمة السر", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        SignUpButton.setBackground(new java.awt.Color(255, 255, 255));
        SignUpButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(55, 165, 251));
        SignUpButton.setText("إنشاء حساب");

        Q1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(51, 51, 51));
        Q1.setText("لديك حساب ؟");

        LoginB.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        LoginB.setForeground(new java.awt.Color(55, 165, 251));
        LoginB.setText("تسجيل دخول");
        emailfield.setBackground(new java.awt.Color(255, 255, 255));
        emailfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "البريد الاكتروني", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        Rule1.setForeground(new java.awt.Color(253, 151, 151));
        Rule1.setText("- يجب ان تحتوي على 8 خانات على الاقل ");

        Rule2.setForeground(new java.awt.Color(253, 151, 151));
        Rule2.setText("- يجب ان يحتوي على حرف كبير واحد على الاقل");

        Rule3.setForeground(new java.awt.Color(253, 151, 151));
        Rule3.setText("- يجب ان يحتوي على حرف صغير واحد على الاقل");

        Rule4.setForeground(new java.awt.Color(253, 151, 151));
        Rule4.setText("- يجب ان يحتوي على رقم واحد على الاقل");

        firstnameField.setBackground(new java.awt.Color(255, 255, 255));
        firstnameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الاسم الاول", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        lastnameField.setBackground(new java.awt.Color(255, 255, 255));
        lastnameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم العائلة", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(LoginB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Q1)
                                .addGap(0, 259, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                .addComponent(Title)
                                                .addGap(92, 92, 92)
                                                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(285, 285, 285))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Rule2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                                        .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(passwordfield, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(userfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(emailfield, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(Rule1)
                                                                                .addComponent(Rule3)
                                                                                .addComponent(Rule4))
                                                                        .addGap(8, 8, 8))))
                                                .addGap(176, 176, 176))))
        );
        BackgroundLayout.setVerticalGroup(
                BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(Logo))
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(Title)))
                                .addGap(37, 37, 37)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rule1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rule2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rule3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rule4)
                                .addGap(28, 28, 28)
                                .addComponent(SignUpButton)
                                .addGap(18, 18, 18)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Q1)
                                        .addComponent(LoginB))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private boolean writeUserDataToFile(File file, String firstName, String lastName, String username, String email, String password) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("First name: " + firstName + "\n");
            writer.write("Last name: " + lastName + "\n");
            writer.write("Username: " + username + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Password: " + password);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, "Error writing user data to file.", ex);
            return false;
        }
    }

    public static void main(String args[]) {
        try {
            // Set the look and feel to Nimbus
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Launch the application GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }
}


class Login extends javax.swing.JFrame {
    // Variables declaration
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField userfield;
    private javax.swing.JLabel jLabel4;
    //end of GUI Variables
    public static String[] customerInformation;
    String username, password;
    private String storedfirstname, storedlastname, storedusername, storedemail, storedPassword;

    public Login() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
                        
    private void initComponents() {
        FrontEnd();
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignUpMouseClicked(evt);
            }
        });

    }// </editor-fold>     

    private void FrontEnd() {
        // Variables declaration - do not modify                     
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2;
        javax.swing.JLabel jLabel3;
        javax.swing.JPanel jPanel1;

        // End of variables declaration        
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setResizable(
                false);

        jPanel1.setBackground(
                new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(
                new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        jLabel2.setFont(
                new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(
                new java.awt.Color(55, 165, 251));
        jLabel2.setText(
                "تسجيل دخول");

        userfield.setBackground(
                new java.awt.Color(255, 255, 255));
        userfield.setFont(
                new java.awt.Font("sansserif", 0, 14)); // NOI18N
        userfield.setForeground(
                new java.awt.Color(51, 51, 51));
        userfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اسم المستخدم", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        passwordfield.setBackground(
                new java.awt.Color(255, 255, 255));
        passwordfield.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "كلمة السر", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton1.setBackground(
                new java.awt.Color(255, 255, 255));
        jButton1.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton1.setForeground(
                new java.awt.Color(55, 165, 251));
        jButton1.setText(
                "تسجيل");
        jLabel3.setFont(
                new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(
                new java.awt.Color(51, 51, 51));
        jLabel3.setText(
                "ليس لديك حساب ؟");

        jLabel4.setFont(
                new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(
                new java.awt.Color(55, 165, 251));
        jLabel4.setText(
                "إنشاء حساب ");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(169, 169, 169)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(106, 106, 106))
                                                                        .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(263, 263, 263)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 165, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(240, 240, 240))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(168, Short.MAX_VALUE))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void gotoSignUpMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        dispose();
        //Create a new instance of the sign up window
        Account sginupWindow = new Account();
        // Show the sign up window
        sginupWindow.setVisible(true);

    }

    public void Logic(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in both fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(username + ".txt"));
                storedfirstname = reader.readLine().substring(12);
                storedlastname = reader.readLine().substring(11);
                storedusername = reader.readLine().substring(10);
                storedemail = reader.readLine().substring(8);
                storedPassword = reader.readLine().substring(10);
                reader.close();
                customerInformation = new String[]{storedfirstname, storedlastname, storedusername, storedemail, storedPassword};
                if (password.equals(storedPassword)) {
                    JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    Main go =new Main();
                    go.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        username = userfield.getText();
        password = passwordfield.getText();
        Logic(username, password);

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
            java.util.logging.Logger.getLogger(Profiles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profiles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profiles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profiles.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

}

 class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked") 
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\logo.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("تحدي الإدخار");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\boy.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\saving.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\goals.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive\\Documents\\uni\\sem 7\\software process\\project\\profile.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("تحدي الأهداف");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("الملف الشخصي");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)))
                        .addGap(74, 74, 74))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(71, 71, 71)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         dispose();
        Profiles Jf = new Profiles();
        Jf.setVisible(true);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        dispose();
        Goals gg = new Goals();
        gg.setVisible(true);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
