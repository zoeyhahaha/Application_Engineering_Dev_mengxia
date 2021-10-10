/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Car;
import model.CarHistory;

/**
 *
 * @author mengxiazhang
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     * @param history
     */
    CarHistory history;
    
    
    public CreateJPanel(CarHistory history) {
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

        lblTitle = new javax.swing.JLabel();
        lblCarBrand = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblSeatsNum = new javax.swing.JLabel();
        lblSerialNum = new javax.swing.JLabel();
        lblCarModel = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblExpireDate = new javax.swing.JLabel();
        txtCarBrand = new javax.swing.JTextField();
        txtSerialNum = new javax.swing.JTextField();
        txtCarModel = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtExpireDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        ckbAvail = new java.awt.Checkbox();
        ckbUber = new java.awt.Checkbox();
        cmbYear = new javax.swing.JComboBox<>();
        cmbSeats = new javax.swing.JComboBox<>();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Car Information");

        lblCarBrand.setText("Car Brand:");

        lblYear.setText("Year:");

        lblSeatsNum.setText("Seats Number:");

        lblSerialNum.setText("Serial Number:");

        lblCarModel.setText("Model:");

        lblCity.setText("Expire Date:");

        lblExpireDate.setText("City:");

        txtCarBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarBrandActionPerformed(evt);
            }
        });

        txtSerialNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumActionPerformed(evt);
            }
        });

        txtCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarModelActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtExpireDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpireDateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        ckbAvail.setLabel("Available");

        ckbUber.setLabel("Uber");

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        cmbSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity)
                            .addComponent(lblExpireDate)
                            .addComponent(lblCarModel)
                            .addComponent(lblSerialNum)
                            .addComponent(lblSeatsNum)
                            .addComponent(lblYear)
                            .addComponent(lblCarBrand))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave)
                            .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(ckbAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(ckbUber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarBrand)
                    .addComponent(txtCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatsNum)
                    .addComponent(cmbSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNum)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarModel)
                    .addComponent(txtCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpireDate)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbUber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnSave)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarBrandActionPerformed

    private void txtSerialNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumActionPerformed

    private void txtCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarModelActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        Car car = history.addNewCar(); 
        
        String carBrand = txtCarBrand.getText();
        car.setCarBrand(carBrand);
        
//        String str1 = txtYear.getText();
//        isNum(str1);
//        String str2 = txtSeatsNum.getText();
//        isNum(str2);
        
        int Year = Integer.parseInt(cmbYear.getSelectedItem().toString());
        int carSeats = Integer.parseInt(cmbSeats.getSelectedItem().toString());
        String serialNum = txtSerialNum.getText();
        String carModel = txtCarModel.getText();
        String uber = String.valueOf(ckbUber.getState());
        String city = txtCity.getText();
        String expireDate = txtExpireDate.getText();
        
        String avail = String.valueOf(ckbAvail.getState());
        
        
        
        
        car.setYear(Year);
        car.setCarSeats(carSeats);
        car.setSerialNum(serialNum);
        car.setCarModel(carModel);
        car.setUsedByUber(uber);
        car.setCity(city);
        car.setExpireDate(expireDate);
        
        car.setAvail(avail);
        
        JOptionPane.showMessageDialog(this, "New Car added");
        
        Date d1 = new Date();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        car.setDate(date.format(d1));
        
        System.out.println(date.format(d1));
        
        txtCarBrand.setText("");
//        txtYear.setText("");
//        txtSeatsNum.setText("");
        txtSerialNum.setText("");
        txtCarModel.setText("");
//        txtUber.setText("");
        ckbUber.setState(false);
        txtCity.setText("");
        txtExpireDate.setText("");
        ckbAvail.setState(false);
        
        
                
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtExpireDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpireDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpireDateActionPerformed

    public static void isNum(String str){
        if (str.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please complete all information");
                try {
                    str.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                str.notify();
            }
        
        for (int i = 0; i < str.length(); i++) {
            
            //System.out.println(i);
            if (!Character.isDigit(str.charAt(i))){
                JOptionPane.showMessageDialog(null, "Please enter correct data type.");
                try {
                    str.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                str.notify();
                
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private java.awt.Checkbox ckbAvail;
    private java.awt.Checkbox ckbUber;
    private javax.swing.JComboBox<String> cmbSeats;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel lblCarBrand;
    private javax.swing.JLabel lblCarModel;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblExpireDate;
    private javax.swing.JLabel lblSeatsNum;
    private javax.swing.JLabel lblSerialNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtCarBrand;
    private javax.swing.JTextField txtCarModel;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpireDate;
    private javax.swing.JTextField txtSerialNum;
    // End of variables declaration//GEN-END:variables
}
