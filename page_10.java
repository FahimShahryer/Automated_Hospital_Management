package com.mycompany.java_anik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class page_10 extends javax.swing.JFrame {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/java_anik";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "anik";
    
    static private String userid;

   
    public page_10(String userid) {
        initComponents();
        this.userid = userid;
        
        loadChatHistory();
        populateUserDetails(userid);
    }

    
    @SuppressWarnings("unchecked")
    
    private void populateUserDetails(String userid) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT name, age, phone, gender, add_info FROM patient WHERE userid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userid);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phone = resultSet.getString("phone");
                String gender = resultSet.getString("gender");
                String addInfos = resultSet.getString("add_info");

                // Set the labels with retrieved information
                name_lb.setText(name);
                age_lb.setText(String.valueOf(age));
                phone_lb.setText(phone);
                gender_lb.setText(gender);
                add_info_lb.setText(addInfos);
            } else {
                JOptionPane.showMessageDialog(null, "Patient not found in the database.");
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        back_btn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name_lb = new javax.swing.JLabel();
        age_lb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        phone_lb = new javax.swing.JLabel();
        gender_lb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        add_info_lb = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout_btn2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        doctor_id_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        reopen_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Chat_history = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 250, 240));

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));

        back_btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_btn1.setText("Back");
        back_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        name_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name_lb.setForeground(new java.awt.Color(255, 255, 255));
        name_lb.setText("Name:");

        age_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        age_lb.setForeground(new java.awt.Color(255, 255, 255));
        age_lb.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone:");

        phone_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        phone_lb.setForeground(new java.awt.Color(255, 255, 255));
        phone_lb.setText("xx");

        gender_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gender_lb.setForeground(new java.awt.Color(255, 255, 255));
        gender_lb.setText("xx");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Infos:");

        add_info_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add_info_lb.setForeground(new java.awt.Color(255, 255, 255));
        add_info_lb.setText("xx");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CareConnectChat");

        logout_btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_btn2.setText("Logout");
        logout_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(9, 9, 9)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_info_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(back_btn1)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_btn2)
                .addGap(197, 197, 197))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(back_btn1)
                .addGap(123, 123, 123)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(age_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phone_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gender_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(add_info_lb))
                .addGap(18, 18, 18)
                .addComponent(logout_btn2)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 33, 89));
        jLabel5.setText("The Chat History");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(54, 33, 89));
        jLabel6.setText("List of the Doctor You Have Messaged");

        doctor_id_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_id_tf.setForeground(new java.awt.Color(54, 33, 89));
        doctor_id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_id_tfActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 33, 89));
        jLabel7.setText("Type the Doctors ID to reopen the Chat");

        reopen_btn.setBackground(new java.awt.Color(54, 33, 89));
        reopen_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reopen_btn.setForeground(new java.awt.Color(255, 255, 255));
        reopen_btn.setText("Reopen");
        reopen_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reopen_btnActionPerformed(evt);
            }
        });

        Chat_history.setColumns(20);
        Chat_history.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Chat_history.setForeground(new java.awt.Color(54, 33, 89));
        Chat_history.setRows(5);
        jScrollPane1.setViewportView(Chat_history);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(reopen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(doctor_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctor_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reopen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void loadChatHistory() {
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Find the patient_id from the patient table using userid
        String findPatientIdQuery = "SELECT patient_id FROM patient WHERE userid = ?";
        PreparedStatement findPatientIdStatement = connection.prepareStatement(findPatientIdQuery);
        findPatientIdStatement.setString(1, userid);
        ResultSet patientIdResultSet = findPatientIdStatement.executeQuery();

        if (patientIdResultSet.next()) {
            int patientId = patientIdResultSet.getInt("patient_id");

            // Query unique doctors that the patient has interacted with and the last chat date
            String chatHistoryQuery = "SELECT DISTINCT chat.receiver_id, doctor.name, doctor.speciallization, MAX(chat.timestamp) AS last_chat_date " +
                "FROM chat " +
                "INNER JOIN doctor ON chat.receiver_id = doctor.doctor_id " +
                "WHERE chat.sender_id = ? " +
                "GROUP BY chat.receiver_id";

            PreparedStatement chatHistoryStatement = connection.prepareStatement(chatHistoryQuery);
            chatHistoryStatement.setInt(1, patientId);
            ResultSet chatHistoryResultSet = chatHistoryStatement.executeQuery();

            StringBuilder chatHistory = new StringBuilder();

            while (chatHistoryResultSet.next()) {
                int doctorId = chatHistoryResultSet.getInt("receiver_id");
                String doctorName = chatHistoryResultSet.getString("name");
                String specialization = chatHistoryResultSet.getString("speciallization");
                String lastChatDate = chatHistoryResultSet.getString("last_chat_date"); // Retrieve the last chat date

                chatHistory.append("Doctor ID: ").append(doctorId).append("\n");
                chatHistory.append("Doctor Name: ").append(doctorName).append("\n");
                chatHistory.append("Specialization: ").append(specialization).append("\n");
                chatHistory.append("Last Chat Date: ").append(lastChatDate).append("\n\n");
            }

            Chat_history.setText(chatHistory.toString());
        }

        patientIdResultSet.close();
        findPatientIdStatement.close();
        //chatHistoryStatement.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}
    
    private void doctor_id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_id_tfActionPerformed

    private void reopen_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reopen_btnActionPerformed
        // TODO add your handling code here:
        String selectedDoctorId = doctor_id_tf.getText();
        int doctorId = 123;
        int patientId = 123;
        String specialization = "";

    if (selectedDoctorId.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Doctor ID to reopen the chat.");
        return;
    }

    try {
        doctorId = Integer.parseInt(selectedDoctorId);

        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Find the specialization of the selected doctor from the doctor table
        String findSpecializationQuery = "SELECT speciallization FROM doctor WHERE doctor_id = ?";
        PreparedStatement findSpecializationStatement = connection.prepareStatement(findSpecializationQuery);
        findSpecializationStatement.setInt(1, doctorId);
        ResultSet specializationResultSet = findSpecializationStatement.executeQuery();

        

        if (specializationResultSet.next()) {
            specialization = specializationResultSet.getString("speciallization");
        } else {
            JOptionPane.showMessageDialog(null, "Doctor not found with the provided ID.");
        }

        // Find the patient_id from the patient table using userid
        String findPatientIdQuery = "SELECT patient_id FROM patient WHERE userid = ?";
        PreparedStatement findPatientIdStatement = connection.prepareStatement(findPatientIdQuery);
        findPatientIdStatement.setString(1, userid);
        ResultSet patientIdResultSet = findPatientIdStatement.executeQuery();

        patientId = 0;

        if (patientIdResultSet.next()) {
            patientId = patientIdResultSet.getInt("patient_id");
        }

        specializationResultSet.close();
        findSpecializationStatement.close();
        patientIdResultSet.close();
        findPatientIdStatement.close();
        connection.close();

        if (patientId != 0) {
            // Reopen the chat using the obtained specialization and patient_id
            // You can write the code here to open the chat with the selected doctor
            // and pass the values (specialization, patient_id, doctorId) to the new chat window.
        } else {
            JOptionPane.showMessageDialog(null, "Patient not found.");
        }
    } catch (NumberFormatException | SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    
    String dr_id = doctorId + "";
    String pat_id = patientId + "";
    page_9 p9 = new page_9(userid,specialization,dr_id,pat_id,"patient");
    p9.setVisible(true);
    dispose();
    }//GEN-LAST:event_reopen_btnActionPerformed

    private void back_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn1ActionPerformed
        // TODO add your handling code here:
        page_6 p6 = new page_6(userid);
        p6.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btn1ActionPerformed

    private void logout_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn2ActionPerformed
        // TODO add your handling code here:
        page_1 p1 = new page_1();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page_10(userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Chat_history;
    private javax.swing.JLabel add_info_lb;
    private javax.swing.JLabel age_lb;
    private javax.swing.JButton back_btn1;
    private javax.swing.JTextField doctor_id_tf;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton logout_btn1;
    private javax.swing.JButton logout_btn2;
    private javax.swing.JLabel name_lb;
    private javax.swing.JLabel phone_lb;
    private javax.swing.JButton reopen_btn;
    // End of variables declaration//GEN-END:variables
}
