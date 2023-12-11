package com.mycompany.java_anik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class page_9 extends javax.swing.JFrame {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/java_anik";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "anik";
    
    static private String userid;
    static private String skill;
    static private String doctor_id;
    static private String patient_id;
    static private String type;

    
    public page_9(String userid, String skill, String doctor_id, String patient_id, String type) {
        initComponents();
        
        this.userid = userid;
        this.skill = skill;
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.type = type;
        
        // Load previous chat history
        loadChatHistory();
       // populateUserDetails(userid);
        populateUserDetails2(doctor_id);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        new_messege = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        send_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        previous_chat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        back_btn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name_lb_doc = new javax.swing.JLabel();
        age_lb_doc = new javax.swing.JLabel();
        phone_lb_doc = new javax.swing.JLabel();
        gender_lb_doc = new javax.swing.JLabel();
        add_info_lb_doc = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        logout_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Previous Chat");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("The Chat History");

        new_messege.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_messege.setForeground(new java.awt.Color(54, 33, 89));
        new_messege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_messegeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Type Messege");

        send_btn.setBackground(new java.awt.Color(54, 33, 89));
        send_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        send_btn.setForeground(new java.awt.Color(255, 255, 255));
        send_btn.setText("Send");
        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });

        previous_chat.setColumns(20);
        previous_chat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        previous_chat.setForeground(new java.awt.Color(54, 33, 89));
        previous_chat.setRows(5);
        jScrollPane1.setViewportView(previous_chat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(new_messege)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(send_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_messege, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(send_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(54, 33, 89));

        back_btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_btn2.setText("Back");
        back_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor Details:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Age:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Phone:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Specialization");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Infos:");

        name_lb_doc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_lb_doc.setForeground(new java.awt.Color(255, 255, 255));
        name_lb_doc.setText("Name:");

        age_lb_doc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        age_lb_doc.setForeground(new java.awt.Color(255, 255, 255));
        age_lb_doc.setText("Name:");

        phone_lb_doc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phone_lb_doc.setForeground(new java.awt.Color(255, 255, 255));
        phone_lb_doc.setText("xx");

        gender_lb_doc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender_lb_doc.setForeground(new java.awt.Color(255, 255, 255));
        gender_lb_doc.setText("xx");

        add_info_lb_doc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_info_lb_doc.setForeground(new java.awt.Color(255, 255, 255));
        add_info_lb_doc.setText("xx");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CareConnectChat");

        logout_btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_btn1.setText("Logout");
        logout_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_info_lb_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone_lb_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_lb_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender_lb_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_lb_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(back_btn2)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_btn1)
                .addGap(170, 170, 170))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(back_btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(name_lb_doc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(age_lb_doc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(phone_lb_doc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(gender_lb_doc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(add_info_lb_doc))
                .addGap(18, 18, 18)
                .addComponent(logout_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
//                name_lb.setText(name);
  //              age_lb.setText(String.valueOf(age));
    //            phone_lb.setText(phone);
      //          gender_lb.setText(gender);
        //        add_info_lb.setText(addInfos);
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
    
    private void populateUserDetails2(String userid) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT name, age, phone, speciallization, add_info FROM doctor WHERE doctor_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, userid);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phone = resultSet.getString("phone");
                String gender = resultSet.getString("speciallization");
                String addInfos = resultSet.getString("add_info");

                // Set the labels with retrieved information
                name_lb_doc.setText(name);
                age_lb_doc.setText(String.valueOf(age));
                phone_lb_doc.setText(phone);
                gender_lb_doc.setText(gender);
                add_info_lb_doc.setText(addInfos);
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
    
        // Add a new method to load chat history
        private void loadChatHistory() {
        try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Query to retrieve chat history for the specific doctor and patient
        String chatHistoryQuery = "SELECT message, sent_by FROM chat WHERE (sender_id = ? AND receiver_id = ?) OR (sender_id = ? AND receiver_id = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(chatHistoryQuery);
        preparedStatement.setInt(1, Integer.parseInt(patient_id));
        preparedStatement.setInt(2, Integer.parseInt(doctor_id));
        preparedStatement.setInt(3, Integer.parseInt(doctor_id));
        preparedStatement.setInt(4, Integer.parseInt(patient_id));

        ResultSet resultSet = preparedStatement.executeQuery();

        StringBuilder chatHistory = new StringBuilder();
        while (resultSet.next()) {
            String message = resultSet.getString("message");
            int sentBy = resultSet.getInt("sent_by");

            // Add sender information before each message
            if (sentBy == 1 && "doctor".equals(type)) {
                chatHistory.append("You: ").append(message).append("\n");
            } else if (sentBy == 1 && "patient".equals(type)) {
                chatHistory.append("Doctor: ").append(message).append("\n");
            } else if (sentBy == 0 && "doctor".equals(type)) {
                chatHistory.append("Patient: ").append(message).append("\n");
            } else if (sentBy == 0 && "patient".equals(type)) {
                chatHistory.append("You: ").append(message).append("\n");
            }
        }

        previous_chat.setText(chatHistory.toString());

        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
    }
    
    // Method to retrieve the user_id of a doctor based on the doctor_id
private String getDoctorUserId(String doctorId) {
    String userId = null;

    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        String query = "SELECT userid FROM doctor WHERE doctor_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, Integer.parseInt(doctorId));

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            userId = resultSet.getString("userid");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }

    return userId;
}
    
    private void new_messegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_messegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_messegeActionPerformed

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        // TODO add your handling code here:

    String newMessage = new_messege.getText().trim();

    if (newMessage.isEmpty()) {
        // Don't send empty messages
        return;
    }

    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Insert the new message into the chat table
        String insertMessageQuery = "INSERT INTO chat (sender_id, receiver_id, message, sent_by) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertMessageQuery);

        if ("patient".equals(type)) {
            // If type is patient, sender is patient and receiver is doctor
            preparedStatement.setInt(1, Integer.parseInt(patient_id));
            preparedStatement.setInt(2, Integer.parseInt(doctor_id));
            preparedStatement.setInt(4, 0); // sent_by is 0 for patients
        } else {
            // If type is doctor, sender is doctor and receiver is patient
            preparedStatement.setInt(1, Integer.parseInt(doctor_id));
            preparedStatement.setInt(2, Integer.parseInt(patient_id));
            preparedStatement.setInt(4, 1); // sent_by is 1 for doctors
        }

        preparedStatement.setString(3, newMessage);

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            // Message sent successfully, clear the new message text field
            new_messege.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to send the message.");
        }

        preparedStatement.close();
        connection.close();

        // Update the chat history after sending the new message
        loadChatHistory();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
    }//GEN-LAST:event_send_btnActionPerformed

    private void back_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn2ActionPerformed
        // Check the "type" variable to determine which page to open
        String id = getDoctorUserId(doctor_id);
        if ("patient".equals(type)) {
            page_6 p6 = new page_6(userid);
            p6.setVisible(true);
        } else {
            page_14 p14 = new page_14(doctor_id,id);
            p14.setVisible(true);
        }
        dispose();
    }//GEN-LAST:event_back_btn2ActionPerformed

    private void logout_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn1ActionPerformed
        // TODO add your handling code here:
        page_1 p1 = new page_1();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page_9(userid,skill,doctor_id,patient_id,type).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_info_lb_doc;
    private javax.swing.JLabel age_lb_doc;
    private javax.swing.JButton back_btn2;
    private javax.swing.JLabel gender_lb_doc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_btn1;
    private javax.swing.JLabel name_lb_doc;
    private javax.swing.JTextField new_messege;
    private javax.swing.JLabel phone_lb_doc;
    private javax.swing.JTextArea previous_chat;
    private javax.swing.JButton send_btn;
    // End of variables declaration//GEN-END:variables
}
