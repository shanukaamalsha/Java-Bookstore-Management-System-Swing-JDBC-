
package littlebookhaven;

public class MainMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenu.class.getName());

    private User loggedInUser;  
    
    public MainMenu(User authenticatedUser) {
        this.loggedInUser = authenticatedUser;

        initComponents(); 

        welcomeLabel.setText("Welcome, " + loggedInUser.getUsername() + "!");
        loggedUser.setText("Logged in as: " + loggedInUser.getRole());

        if (!(loggedInUser instanceof Manager)) {
            createCashierAcc.setVisible(false); 
        }
    }

    MainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LittleBookHaven = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        loggedUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LittleBookHaven1 = new javax.swing.JLabel();
        viewBookList = new javax.swing.JButton();
        searchBookBycate = new javax.swing.JButton();
        addNewBook = new javax.swing.JButton();
        createCashierAcc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(242, 227, 198));

        LittleBookHaven.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LittleBookHaven.setForeground(new java.awt.Color(108, 73, 73));
        LittleBookHaven.setText("The Little Book Haven");

        jButton1.setBackground(new java.awt.Color(139, 94, 60));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(139, 94, 60));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        jButton2.setText("Log Out");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(108, 73, 73));
        welcomeLabel.setText("Welcome,");

        loggedUser.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        loggedUser.setForeground(new java.awt.Color(108, 73, 73));
        loggedUser.setText("Logged in as: ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo200x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loggedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(LittleBookHaven)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LittleBookHaven)
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 227, 198), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/underline.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 300, 50));

        LittleBookHaven1.setBackground(new java.awt.Color(0, 204, 255));
        LittleBookHaven1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        LittleBookHaven1.setForeground(new java.awt.Color(139, 94, 60));
        LittleBookHaven1.setText("MENU");
        jPanel3.add(LittleBookHaven1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 55, -1, -1));

        viewBookList.setBackground(new java.awt.Color(139, 94, 60));
        viewBookList.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        viewBookList.setForeground(new java.awt.Color(255, 255, 255));
        viewBookList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewallmenu.png"))); // NOI18N
        viewBookList.setText("View Book Details");
        viewBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookListActionPerformed(evt);
            }
        });
        jPanel3.add(viewBookList, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 178, 176, 45));

        searchBookBycate.setBackground(new java.awt.Color(139, 94, 60));
        searchBookBycate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        searchBookBycate.setForeground(new java.awt.Color(255, 255, 255));
        searchBookBycate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchbook.png"))); // NOI18N
        searchBookBycate.setText("Search Book");
        searchBookBycate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookBycateActionPerformed(evt);
            }
        });
        jPanel3.add(searchBookBycate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 178, 200, 45));

        addNewBook.setBackground(new java.awt.Color(139, 94, 60));
        addNewBook.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        addNewBook.setForeground(new java.awt.Color(255, 255, 255));
        addNewBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addbook.png"))); // NOI18N
        addNewBook.setText("Add New Book");
        addNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBookActionPerformed(evt);
            }
        });
        jPanel3.add(addNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 268, 176, 45));

        createCashierAcc.setBackground(new java.awt.Color(139, 94, 60));
        createCashierAcc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        createCashierAcc.setForeground(new java.awt.Color(255, 255, 255));
        createCashierAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adduser.png"))); // NOI18N
        createCashierAcc.setText("Create Cashier Account");
        createCashierAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCashierAccActionPerformed(evt);
            }
        });
        jPanel3.add(createCashierAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 268, -1, 45));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit (0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loginFrame lf=new loginFrame();
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookListActionPerformed
        BookDetailsFrame bd = new BookDetailsFrame(loggedInUser);
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewBookListActionPerformed

    private void searchBookBycateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookBycateActionPerformed
        SearchBookFrame ab = new SearchBookFrame (loggedInUser);
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchBookBycateActionPerformed

    private void addNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBookActionPerformed
        AddNewBookFrame ab = new AddNewBookFrame (loggedInUser);
        ab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addNewBookActionPerformed

    private void createCashierAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCashierAccActionPerformed
        CreateCashierAccountFrame cc = new CreateCashierAccountFrame(loggedInUser);
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createCashierAccActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LittleBookHaven;
    private javax.swing.JLabel LittleBookHaven1;
    private javax.swing.JButton addNewBook;
    private javax.swing.JButton createCashierAcc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loggedUser;
    private javax.swing.JButton searchBookBycate;
    private javax.swing.JButton viewBookList;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
