/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarHistory;
import java.util.*;

/**
 *
 * @author mengxiazhang
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    CarHistory history;
    
    public SearchJPanel(CarHistory history) {
        initComponents();
        
        this.history = history;
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
        tblCar = new javax.swing.JTable();
        btnAvail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        btnBrand = new javax.swing.JButton();
        btnYear = new javax.swing.JButton();
        cmbYear = new javax.swing.JComboBox<>();
        btnSeats = new javax.swing.JButton();
        cmbMinSeats = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMaxSeats = new javax.swing.JComboBox<>();
        btnSerialNum = new javax.swing.JButton();
        txtSerialNum = new javax.swing.JTextField();
        btnModel = new javax.swing.JButton();
        txtModel = new javax.swing.JTextField();
        btnUber = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        btnExpireDate = new javax.swing.JButton();
        btnUpdata = new javax.swing.JButton();

        tblCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Year", "Seats", "Serial Number", "Model", "City", "Expire Date", "Used by Uber", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCar);

        btnAvail.setText("Available");
        btnAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailActionPerformed(evt);
            }
        });

        jLabel1.setText("Search by");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        btnBrand.setText("Brand");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        btnYear.setText("Year");
        btnYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearActionPerformed(evt);
            }
        });

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        btnSeats.setText("Seats");
        btnSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeatsActionPerformed(evt);
            }
        });

        cmbMinSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));

        jLabel2.setText("Min");

        jLabel3.setText("Max");

        cmbMaxSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "7", "6", "5", "4", "3", "2" }));

        btnSerialNum.setText("Serial Number");
        btnSerialNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumActionPerformed(evt);
            }
        });

        txtSerialNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumActionPerformed(evt);
            }
        });

        btnModel.setText("Model");
        btnModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelActionPerformed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        btnUber.setText("Uber");
        btnUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUberActionPerformed(evt);
            }
        });

        btnCity.setText("City");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnExpireDate.setText("Expire Date");
        btnExpireDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpireDateActionPerformed(evt);
            }
        });

        btnUpdata.setText("Last updata");
        btnUpdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnUber, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCity, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdata, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYear)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeats)
                    .addComponent(cmbMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cmbMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSerialNum)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExpireDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdata)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(518, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        
        int avail = 0;
        int unavail = 0;
        
        //String avail = txtAvail.getText();
               
        for (Car car : history.getHistory()){
            if (car.getAvail() == "true"){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                ++avail;
                model.addRow(row);
            } else {
                ++unavail;
            }    
        }
        JOptionPane.showMessageDialog(null, "Available search succeed.");
        JOptionPane.showMessageDialog(null, avail + "car(s) is(are) available, " + unavail + " car(s) is(are) unavailable.");
    }//GEN-LAST:event_btnAvailActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        

        
        //String avail = txtAvail.getText();
               
        for (Car car : history.getHistory()){
            if (car.getCarBrand().equals(txtBrand.getText().toLowerCase())){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Brand search succeed.");
        
    }//GEN-LAST:event_btnBrandActionPerformed

    private void btnYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        
        int year = Integer.parseInt(cmbYear.getSelectedItem().toString());
               
        for (Car car : history.getHistory()){
            if (car.getYear() == year){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Year search succeed.");
        
    }//GEN-LAST:event_btnYearActionPerformed

    private void btnSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeatsActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        
        int min = Integer.parseInt(cmbMinSeats.getSelectedItem().toString());
        int max = Integer.parseInt(cmbMaxSeats.getSelectedItem().toString());
               
        for (Car car : history.getHistory()){
            if (car.getCarSeats() >= min && car.getCarSeats() <= max){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Seats search succeed.");
    }//GEN-LAST:event_btnSeatsActionPerformed

    private void btnSerialNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
               
        for (Car car : history.getHistory()){
            if (car.getSerialNum().equals(txtSerialNum.getText())){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Serial Number search succeed.");
        
    }//GEN-LAST:event_btnSerialNumActionPerformed

    private void txtSerialNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumActionPerformed

    private void btnModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
               
        for (Car car : history.getHistory()){
            if (car.getCarModel().equals(txtModel.getText())){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Model search succeed.");
    }//GEN-LAST:event_btnModelActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
               
        for (Car car : history.getHistory()){
            if (car.getCity().equals(txtCity.getText().toLowerCase())){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "City search succeed.");
    }//GEN-LAST:event_btnCityActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnExpireDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpireDateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        
        Calendar cal = Calendar.getInstance();
        
        for (Car car : history.getHistory()){
            if (Integer.parseInt(car.getExpireDate().toString()) >= Integer.valueOf(cal.get(Calendar.YEAR))){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Expire date search succeed.");
        
    }//GEN-LAST:event_btnExpireDateActionPerformed

    private void btnUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUberActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCar.getModel();
        model.setRowCount(0);
        
        
        for (Car car : history.getHistory()){
            if (car.getUsedByUber() == "true"){
                Object[] row = new Object[9];
                row[0] = car;
                row[1] = car.getYear();
                row[2] = car.getCarSeats();
                row[3] = car.getSerialNum();
                row[4] = car.getCarModel();
                row[5] = car.getCity();
                row[6] = car.getExpireDate();
                row[7] = car.getUsedByUber();
                row[8] = car.getAvail();
                
                model.addRow(row);
            }     
        }
        JOptionPane.showMessageDialog(null, "Uber search succeed.");
        
    }//GEN-LAST:event_btnUberActionPerformed

    private void btnUpdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdataActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, history.lastUpdata());
    }//GEN-LAST:event_btnUpdataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvail;
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnExpireDate;
    private javax.swing.JButton btnModel;
    private javax.swing.JButton btnSeats;
    private javax.swing.JButton btnSerialNum;
    private javax.swing.JButton btnUber;
    private javax.swing.JButton btnUpdata;
    private javax.swing.JButton btnYear;
    private javax.swing.JComboBox<String> cmbMaxSeats;
    private javax.swing.JComboBox<String> cmbMinSeats;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCar;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSerialNum;
    // End of variables declaration//GEN-END:variables
}
