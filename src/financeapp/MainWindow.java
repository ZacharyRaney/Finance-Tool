package financeapp;

import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Zack
 */
public class MainWindow extends javax.swing.JFrame {

    Vector lstAccounts; //jList only takes Vectors?
    Account selectedAccount;
    DefaultTableModel emptyModel;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        this.lstAccounts = new Vector();
        initComponents();
        emptyModel = (DefaultTableModel) accountTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        accountList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btdDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAddTransaction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accountList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                accountListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(accountList);

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Category", "Comments/Payee", "Ammount", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(accountTable);

        btnAdd.setText("Add...");
        btnAdd.setToolTipText("");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btdDelete.setText("Delete");
        btdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAddTransaction.setText("Add Transaction");
        btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransactionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btdDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddTransaction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReport)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnReport)
                    .addComponent(btdDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnAddTransaction))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AddAccount frmAddAccount = new AddAccount(this, true); //Make the window
        frmAddAccount.setLocationRelativeTo(this);//Always keeps the dialog in the center of the MainWindow
        frmAddAccount.setTitle("Add New Account");
        frmAddAccount.setVisible(true);

        if (!"".equals(frmAddAccount.name)) {
            Account account = new Account(frmAddAccount.name);

            Iterator itr = lstAccounts.iterator();
            boolean canAdd = true;

            while (itr.hasNext()) {
                Account q = (Account) itr.next();
                if (q.getName().equals(account.getName())) {
                    JOptionPane.showMessageDialog(this, "Account with that name already exists");
                    canAdd = false;
                }
            }
            if (canAdd) {
                lstAccounts.add(account);
                accountList.setListData(lstAccounts);
            }

            //refreshes the list of accounts
            jScrollPane1.revalidate();
            jScrollPane1.repaint();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdDeleteActionPerformed
        if (accountList.getSelectedValue() != null) { //is there something to delete?
            //create a yes, no dialogue
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this account?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                lstAccounts.removeElementAt(accountList.getSelectedIndex()); //remove the account from the vector
                accountList.setSelectedIndex(0); //set the selected index to another in the list

                //resets the list
                accountList.setListData(lstAccounts);
                jScrollPane1.revalidate();
                jScrollPane1.repaint();
            }
        }
    }//GEN-LAST:event_btdDeleteActionPerformed

    private void accountListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_accountListValueChanged
        if (accountList.getSelectedValue() != null) {
            selectedAccount = (Account) accountList.getSelectedValue();
            accountTable.setModel(selectedAccount.model);
            jScrollPane2.revalidate();
            jScrollPane2.repaint();
        } else {
            accountTable.setModel(emptyModel);
        }
    }//GEN-LAST:event_accountListValueChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //Reusing add account form
        AddAccount frmAddAccount = new AddAccount(this, true, selectedAccount.getName()); //Make the window
        frmAddAccount.setVisible(true);
        
        if (!"".equals(frmAddAccount.name)) {
            Account account = new Account(frmAddAccount.name);

            Iterator itr = lstAccounts.iterator();
            boolean canAdd = true;

            while (itr.hasNext()) {
                Account q = (Account) itr.next();
                if (q.getName().equals(account.getName())) {
                    JOptionPane.showMessageDialog(this, "Account with that name already exists");
                    canAdd = false;
                }
            }
            if (canAdd) {
                selectedAccount.setName(frmAddAccount.name);
            }
        
        }
        jScrollPane1.revalidate();
        jScrollPane1.repaint();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransactionActionPerformed
        //model.insertRow(model.getRowCount(), new Object[]{"Test","Type","t","e","s","t"});
        if (selectedAccount != null) {
            AddTransaction frmAddTransaction = new AddTransaction(this, true);

            frmAddTransaction.setLocationRelativeTo(this);//Always keeps the dialog in the center of the MainWindow
            frmAddTransaction.setTitle("Add New Account");
            frmAddTransaction.setVisible(true);

            if (!(frmAddTransaction.date).equals("")) {
                if (((String) frmAddTransaction.type).equals("Expense")) {
                    selectedAccount.total -= frmAddTransaction.ammount;
                    selectedAccount.model.insertRow(0, new Object[]{
                    frmAddTransaction.date,
                    frmAddTransaction.type,
                    frmAddTransaction.category,
                    frmAddTransaction.comments,
                    "("+ frmAddTransaction.ammount + ")",
                    selectedAccount.total
                });
                } else {
                    selectedAccount.total += frmAddTransaction.ammount;
                    selectedAccount.model.insertRow(0, new Object[]{
                    frmAddTransaction.date,
                    frmAddTransaction.type,
                    frmAddTransaction.category,
                    frmAddTransaction.comments,
                    frmAddTransaction.ammount,
                    selectedAccount.total
                });
                }
                Transaction newtrans = new Transaction(frmAddTransaction.date,
                    frmAddTransaction.type,
                    frmAddTransaction.category,
                    frmAddTransaction.comments,
                    frmAddTransaction.ammount, selectedAccount.total);
                selectedAccount.addTrans(newtrans);    
                //selectedAccount.model.insertRow(0, lstAccounts);
            }
        }
    }//GEN-LAST:event_btnAddTransactionActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
         selectedAccount = (Account) accountList.getSelectedValue();
        
        Report viewReport = new Report(this,true,lstAccounts,selectedAccount);
        
        viewReport.setLocationRelativeTo(this);//Always keeps the dialog in the center of the MainWindow
            viewReport.setTitle("Add New Account");
            viewReport.setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList accountList;
    private javax.swing.JTable accountTable;
    private javax.swing.JButton btdDelete;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTransaction;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
