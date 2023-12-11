package com.mycompany.java_anik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class page_13 extends javax.swing.JFrame {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/java_anik";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "anik";
    
    static private String dr_id;
    static private String userid;
    static private String patient_user_id;
    static private String skill;
    static private String patient_id;
    
    public page_13(String dr_id, String userid) {
        initComponents();
        this.dr_id = dr_id;
        this.userid = userid;
        
        // Populate notifications for the doctor
        populateDoctorNotifications(dr_id);
        // Populate doctor details from the database
        populateDoctorDetails(userid);
        populateDoctorDetails_2(userid);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        name_lb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone_lb = new javax.swing.JLabel();
        gender_lb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        add_info_lb = new javax.swing.JLabel();
        chamber_lb = new javax.swing.JLabel();
        speciallization_lb = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout_btn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notification_ta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        patient_id_tf = new javax.swing.JTextField();
        open_chat_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        name_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name_lb.setForeground(new java.awt.Color(255, 255, 255));
        name_lb.setText("jLabel9");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone:");

        phone_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        phone_lb.setForeground(new java.awt.Color(255, 255, 255));
        phone_lb.setText("jLabel9");

        gender_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gender_lb.setForeground(new java.awt.Color(255, 255, 255));
        gender_lb.setText("jLabel9");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Speciality:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Chamber:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Extra Info:");

        add_info_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add_info_lb.setForeground(new java.awt.Color(255, 255, 255));
        add_info_lb.setText("jLabel9");

        chamber_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        chamber_lb.setForeground(new java.awt.Color(255, 255, 255));
        chamber_lb.setText("jLabel9");

        speciallization_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        speciallization_lb.setForeground(new java.awt.Color(255, 255, 255));
        speciallization_lb.setText("jLabel9");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CareConnectChat");

        logout_btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_btn1.setText("Logout");
        logout_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(back_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_info_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chamber_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speciallization_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_btn1)
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phone_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gender_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(speciallization_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(chamber_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_info_lb)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 33, 89));
        jLabel5.setText("The Doctor's Notifications");

        notification_ta.setColumns(20);
        notification_ta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notification_ta.setForeground(new java.awt.Color(54, 33, 89));
        notification_ta.setRows(5);
        jScrollPane1.setViewportView(notification_ta);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 33, 89));
        jLabel7.setText("Type the Patient ID to open the Chat");

        patient_id_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_id_tf.setForeground(new java.awt.Color(54, 33, 89));
        patient_id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_id_tfActionPerformed(evt);
            }
        });

        open_chat_btn.setBackground(new java.awt.Color(54, 33, 89));
        open_chat_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        open_chat_btn.setForeground(new java.awt.Color(255, 255, 255));
        open_chat_btn.setText("Open");
        open_chat_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_chat_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(patient_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(open_chat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patient_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(open_chat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void populateDoctorDetails(String userid) {
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        
        // Fetch the doctor's ID from the doctor table
        String doctorIdQuery = "SELECT doctor_id FROM doctor WHERE userid = ?";
        PreparedStatement doctorIdStatement = connection.prepareStatement(doctorIdQuery);
        doctorIdStatement.setString(1, userid);
        ResultSet doctorIdResultSet = doctorIdStatement.executeQuery();

        if (doctorIdResultSet.next()) {
            String doctorId = doctorIdResultSet.getString("doctor_id");
            dr_id = doctorId;
            
            // Fetch the count of unread messages for the doctor
            String unreadMessageCountQuery = "SELECT COUNT(*) AS unreadCount FROM chat WHERE receiver_id = ? AND is_read = FALSE";
            PreparedStatement unreadMessageCountStatement = connection.prepareStatement(unreadMessageCountQuery);
            unreadMessageCountStatement.setString(1, doctorId);
            ResultSet unreadMessageCountResultSet = unreadMessageCountStatement.executeQuery();
            
            if (unreadMessageCountResultSet.next()) {
                int unreadCount = unreadMessageCountResultSet.getInt("unreadCount");
             //   notification_number.setText(Integer.toString(unreadCount));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Doctor not found in the database.");
        }
        
        doctorIdResultSet.close();
        doctorIdStatement.close();
        //unreadMessageCountResultSet.close();
        //unreadMessageCountStatement.close();
        
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}
    
    private void populateDoctorDetails_2(String userid) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT name, phone, gender, speciallization, chamber, add_info FROM doctor WHERE userid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userid);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String gender = resultSet.getString("gender");
                String specialization = resultSet.getString("speciallization");
                String chamber = resultSet.getString("chamber");
                String addInfos = resultSet.getString("add_info");

                // Set the labels with retrieved information
                name_lb.setText(name);
                phone_lb.setText(phone);
                gender_lb.setText(gender);
                speciallization_lb.setText(specialization);
                chamber_lb.setText(chamber);
                add_info_lb.setText(addInfos);
            } else {
                JOptionPane.showMessageDialog(null, "Doctor not found in the database.");
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
    
    
    private String getPatientName(String patientId) {
    String patientName = null;
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        String query = "SELECT name FROM patient WHERE patient_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, patientId);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            patientName = resultSet.getString("name");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
    return patientName;
}

private void markChatAsRead(int chatId) {
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        String query = "UPDATE chat SET is_read = 1 WHERE chat_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, chatId);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}
    
    private void populateDoctorNotifications(String doctorId) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Step 1: Find all unread messages for the doctor
            String query = "SELECT chat_id, sender_id FROM chat WHERE receiver_id = ? AND is_read = 0";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, doctorId);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Counter for notifications
            int notificationCount = 0;

            while (resultSet.next()) {
                int chatId = resultSet.getInt("chat_id");
                String senderId = resultSet.getString("sender_id");

                // Step 2: Find the patient's name and ID
                String patientName = getPatientName(senderId);

                // Step 3: Display the information in the notification_ta
                notification_ta.append("Notification " + (notificationCount + 1) + "\n");
                notification_ta.append("Patient Name: " + patientName + "\n");
                notification_ta.append("Patient ID: " + senderId + "\n\n");

                // Mark the message as read
                markChatAsRead(chatId);

                notificationCount++;
            }

            if (notificationCount == 0) {
                notification_ta.setText("No new notifications");
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
    
    
    
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        page_12 p12 = new page_12(userid);
        p12.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void patient_id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_id_tfActionPerformed

    private void open_chat_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_chat_btnActionPerformed
        // TODO add your handling code here:
        String patientId = patient_id_tf.getText().trim();

    if (patientId.isEmpty()) {
        // Handle the case where the patient ID is empty
        JOptionPane.showMessageDialog(this, "Please enter a valid Patient ID.");
        return;
    }

    // Update the patient_id
    patient_id = patientId;

    String patientUserId = null;
    String specialization = null;

    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Retrieve the patient's user_id using patient_id
        String patientUserIdQuery = "SELECT userid FROM patient WHERE patient_id = ?";
        PreparedStatement patientUserIdStatement = connection.prepareStatement(patientUserIdQuery);
        patientUserIdStatement.setInt(1, Integer.parseInt(patientId));
        ResultSet patientUserIdResult = patientUserIdStatement.executeQuery();

        if (patientUserIdResult.next()) {
            patientUserId = patientUserIdResult.getString("userid");
        }

        patientUserIdResult.close();
        patientUserIdStatement.close();

        // Retrieve the doctor's specialization using dr_id
        String specializationQuery = "SELECT speciallization FROM doctor WHERE doctor_id = ?";
        PreparedStatement specializationStatement = connection.prepareStatement(specializationQuery);
        specializationStatement.setInt(1, Integer.parseInt(dr_id));
        ResultSet specializationResult = specializationStatement.executeQuery();

        if (specializationResult.next()) {
            specialization = specializationResult.getString("speciallization");
        }

        specializationResult.close();
        specializationStatement.close();

        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
    }

    if (patientUserId != null && specialization != null) {
        // Update the patient_user_id and skill
        patient_user_id = patientUserId;
        skill = specialization;

        // Now you have patient_user_id, patient_id, and skill
        // You can proceed to open the chat with the updated variables

        // For example, you can create an instance of page_9 and pass these values
        page_9 p9 = new page_9(patient_user_id, skill, dr_id, patient_id,"doctor");
        p9.setVisible(true);
        dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Failed to retrieve patient's user ID or doctor's specialization.");
    }

    }//GEN-LAST:event_open_chat_btnActionPerformed

    private void logout_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn1ActionPerformed
        // TODO add your handling code here:
        page_1 p1 = new page_1();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btn1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page_13(dr_id,userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_info_lb;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel chamber_lb;
    private javax.swing.JLabel gender_lb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_btn1;
    private javax.swing.JLabel name_lb;
    private javax.swing.JTextArea notification_ta;
    private javax.swing.JButton open_chat_btn;
    private javax.swing.JTextField patient_id_tf;
    private javax.swing.JLabel phone_lb;
    private javax.swing.JLabel speciallization_lb;
    // End of variables declaration//GEN-END:variables
}
