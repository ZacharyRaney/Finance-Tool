/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeapp;
import java.awt.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class Report extends javax.swing.JDialog {
    public String toDate;
    public String fromDate;
    public String type;
    public Vector lstAccounts;
    public Account selectedAccount;
    /**
     * Creates new form Report
     */
    public Report(java.awt.Frame parent, boolean modal ) {
        
        initComponents();
    }

    Report(java.awt.Frame parent, boolean modal, Vector lstAccounts, Account selectedAccount) {
        this.lstAccounts = lstAccounts;
        this.selectedAccount = selectedAccount;
         initComponents();
         //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFromDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        reportType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        genReport = new javax.swing.JButton();
        txtToDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportPane = new javax.swing.JTextPane();

        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel2.setMinimumSize(new java.awt.Dimension(600, 300));

        jLabel1.setText("Date Range:");

        //Set todays date as the default when the dialog opens
        SimpleDateFormat dateformat = new SimpleDateFormat ("MM/dd/yyyy");
        Date date = new Date();
        txtFromDate.setText("01/01/2015");
        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        jLabel2.setText("to");

        reportType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Balance", "Income", "Spending Transaction", "Spending Analysis" }));
        reportType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Type:");

        genReport.setText("Generate Report");
        genReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genReportActionPerformed(evt);
            }
        });

        Date tdate = new Date();
        txtToDate.setText(dateformat.format(tdate));
        txtToDate.setToolTipText("");

        reportPane.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(reportPane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genReport)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(genReport)
                    .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void genReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genReportActionPerformed
       
       toDate = txtToDate.getText();
       fromDate = txtFromDate.getText();
       type = (String) reportType.getSelectedItem();
        System.out.println(toDate + fromDate + type);
       // Balance, Income, Spending Transaction, Sending Analysis
        if(type.equals("Balance")) genBalance(toDate,fromDate);
        if(type.equals("Income")) genIncome(toDate,fromDate);
        if(type.equals("Spending Transaction")) genSpendTr(toDate,fromDate);
        if(type.equals("Spending Analysis")) genSpendAn(toDate,fromDate);
        
    }//GEN-LAST:event_genReportActionPerformed

    private void reportTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportTypeActionPerformed
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
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Report dialog = new Report(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton genReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane reportPane;
    private javax.swing.JComboBox reportType;
    private javax.swing.JTextField txtFromDate;
    private javax.swing.JTextField txtToDate;
    // End of variables declaration//GEN-END:variables

    private void genBalance(String toDate, String fromDate) {
        //String output = "";
        String formatStr = "%-16s %-20s%n";
        String output = String.format(formatStr,"Name", "Balance");
        Double totalBalance = 0.0;
        Iterator itr = lstAccounts.iterator();
        while (itr.hasNext()) {
                Account q = (Account) itr.next();
                 output+= String.format(formatStr,q.getName(), Double.toString(q.getTotal()));
                System.out.println(q.getName());
                totalBalance+=q.getTotal();
            }
         output+= '\n';
        output+= String.format(formatStr,"Total Balance ",totalBalance);
        reportPane.setText(output);
    }

    private void genSpendAn(String toDate, String fromDate) {
     String formatStr = "%-16s %-20s%-20s %n";
         
         
        String output = "Period: " + fromDate + " to " + toDate  + "\n\n";
                Map<String, Double> map = new HashMap<String, Double>();
                //String.format(formatStr,"Name", "Balance");
                Double totalIncome = 0.0;
                Account q = (Account) this.selectedAccount;
                ArrayList<Transaction> y = selectedAccount.getTrans();
                for (int i = 0; i < y.size(); i++) {
			Transaction cur = (Transaction)(y.get(i));
                        if (cur.type.equals("Expense") && (fromDate.compareTo(cur.date) * cur.date.compareTo(toDate) >= 0) ){
                            if(map.containsKey(cur.category)){
                                map.put(cur.category, map.get(cur.category) + cur.ammount);
                                        }
                            else map.put(cur.category, cur.ammount);
                            totalIncome += cur.ammount;
                        }
		}
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry)it.next();
                    System.out.println(pair.getKey() + " = " + pair.getValue());
                    output+= String.format(formatStr,pair.getKey(), pair.getValue(),(int)Math.ceil(((Double)pair.getValue()*100)/totalIncome) + "%");
                    it.remove(); // avoids a ConcurrentModificationException
                }
        output+="\n";
        output+= String.format(formatStr,"Total Expenditure",totalIncome,"","");
        reportPane.setText(output);
    }

    private void genSpendTr(String toDate, String fromDate) {
       String formatStr = "%-16s %-20s%-20s%-20s% %n";
         
         
        String output = "Period: " + fromDate + " to " + toDate  + "\n\n";
        
                //String.format(formatStr,"Name", "Balance");
                Double totalIncome = 0.0;
                Account q = (Account) this.selectedAccount;
                ArrayList<Transaction> y = selectedAccount.getTrans();
                for (int i = 0; i < y.size(); i++) {
			Transaction cur = (Transaction)(y.get(i));
                        if (cur.type.equals("Expense") && (fromDate.compareTo(cur.date) * cur.date.compareTo(toDate) >= 0) ){
                            output+= String.format(formatStr,cur.category,cur.comments,cur.ammount,cur.date);
                            totalIncome += cur.ammount;
                        }
		}
        output+="\n";
        output+= String.format(formatStr,"Total Expenditure",totalIncome,"","");
        reportPane.setText(output);
    }

    private void genIncome(String toDate, String fromDate) {
         String formatStr = "%-16s %-20s%-20s %n";
         
         
        String output = "Period: " + fromDate + " to " + toDate  + "\n\n";
        
                //String.format(formatStr,"Name", "Balance");
                Double totalIncome = 0.0;
                Account q = (Account) this.selectedAccount;
                ArrayList<Transaction> y = selectedAccount.getTrans();
                for (int i = 0; i < y.size(); i++) {
			Transaction cur = (Transaction)(y.get(i));
                        if (cur.type.equals("Income") && (fromDate.compareTo(cur.date) * cur.date.compareTo(toDate) >= 0) ){
                            output+= String.format(formatStr,cur.category,cur.ammount,cur.date);
                            totalIncome += cur.ammount;
                        }
		}
        output+="\n";
        output+= String.format(formatStr,"Total Income",totalIncome,"");
        reportPane.setText(output);
    }
}
