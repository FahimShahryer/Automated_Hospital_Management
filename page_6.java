package com.mycompany.java_anik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class page_6 extends javax.swing.JFrame {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/java_anik";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "anik";
    
    static private String userid;
    
    public page_6(String userid) {
        initComponents();
        this.userid = userid;
        
        // Populate user details from the database
        populateUserDetails(userid);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name_lb = new javax.swing.JLabel();
        age_lb = new javax.swing.JLabel();
        phone_lb = new javax.swing.JLabel();
        gender_lb = new javax.swing.JLabel();
        add_info_lb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        notification_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cardiologist_btn = new javax.swing.JButton();
        child_specialist_btn = new javax.swing.JButton();
        haematology_btn = new javax.swing.JButton();
        dermatologist_btn = new javax.swing.JButton();
        medicine_btn = new javax.swing.JButton();
        ent_btn = new javax.swing.JButton();
        chat_history_btn = new javax.swing.JButton();
        notification_number = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Infos:");

        name_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name_lb.setForeground(new java.awt.Color(255, 255, 255));
        name_lb.setText("Name:");

        age_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        age_lb.setForeground(new java.awt.Color(255, 255, 255));
        age_lb.setText("Name:");

        phone_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        phone_lb.setForeground(new java.awt.Color(255, 255, 255));
        phone_lb.setText("xx");

        gender_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gender_lb.setForeground(new java.awt.Color(255, 255, 255));
        gender_lb.setText("xx");

        add_info_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        add_info_lb.setForeground(new java.awt.Color(255, 255, 255));
        add_info_lb.setText("xx");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CareConnectChat");

        logout_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_info_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_btn)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(age_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phone_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gender_lb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(add_info_lb))
                .addGap(26, 26, 26)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        notification_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        notification_btn.setForeground(new java.awt.Color(54, 33, 89));
        notification_btn.setText("Notifications");
        notification_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notification_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 33, 89));
        jLabel2.setText("The Patient Page");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 33, 89));
        jLabel5.setText("Available Specialists:");

        cardiologist_btn.setBackground(new java.awt.Color(54, 33, 89));
        cardiologist_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardiologist_btn.setForeground(new java.awt.Color(255, 255, 255));
        cardiologist_btn.setText("Cardiologist");
        cardiologist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardiologist_btnActionPerformed(evt);
            }
        });

        child_specialist_btn.setBackground(new java.awt.Color(54, 33, 89));
        child_specialist_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        child_specialist_btn.setForeground(new java.awt.Color(255, 255, 255));
        child_specialist_btn.setText("Child Specialist");
        child_specialist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                child_specialist_btnActionPerformed(evt);
            }
        });

        haematology_btn.setBackground(new java.awt.Color(54, 33, 89));
        haematology_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        haematology_btn.setForeground(new java.awt.Color(255, 255, 255));
        haematology_btn.setText("Haematology");
        haematology_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haematology_btnActionPerformed(evt);
            }
        });

        dermatologist_btn.setBackground(new java.awt.Color(54, 33, 89));
        dermatologist_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dermatologist_btn.setForeground(new java.awt.Color(255, 255, 255));
        dermatologist_btn.setText("Dermatologist");
        dermatologist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dermatologist_btnActionPerformed(evt);
            }
        });

        medicine_btn.setBackground(new java.awt.Color(54, 33, 89));
        medicine_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medicine_btn.setForeground(new java.awt.Color(255, 255, 255));
        medicine_btn.setText("Medicine");
        medicine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicine_btnActionPerformed(evt);
            }
        });

        ent_btn.setBackground(new java.awt.Color(54, 33, 89));
        ent_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ent_btn.setForeground(new java.awt.Color(255, 255, 255));
        ent_btn.setText("ENT");
        ent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ent_btnActionPerformed(evt);
            }
        });

        chat_history_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chat_history_btn.setForeground(new java.awt.Color(54, 33, 89));
        chat_history_btn.setText("Chat History");
        chat_history_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat_history_btnActionPerformed(evt);
            }
        });

        notification_number.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        notification_number.setForeground(new java.awt.Color(255, 0, 0));
        notification_number.setText("No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chat_history_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notification_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addComponent(notification_number, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(child_specialist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardiologist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(haematology_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dermatologist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notification_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notification_number, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chat_history_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardiologist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(child_specialist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(haematology_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(dermatologist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medicine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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


    private int getUnreadMessageCount(String userid) {
    int count = 0;
    try {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Retrieve patient_id based on userid
        String getPatientIdQuery = "SELECT patient_id FROM patient WHERE userid = ?";
        PreparedStatement getPatientIdStatement = connection.prepareStatement(getPatientIdQuery);
        getPatientIdStatement.setString(1, userid);

        ResultSet patientIdResult = getPatientIdStatement.executeQuery();

        if (patientIdResult.next()) {
            int patientId = patientIdResult.getInt("patient_id");

            // Query to count unread messages for the specific patient (receiver)
            String query = "SELECT COUNT(*) FROM chat WHERE receiver_id = ? AND is_read = FALSE AND sent_by = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, patientId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                count = resultSet.getInt(1);
            }

            resultSet.close();
            preparedStatement.close();
        }

        patientIdResult.close();
        getPatientIdStatement.close();
        connection.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
    return count;
}
    
    
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
        
        // Get the count of unread messages
        int unreadCount = getUnreadMessageCount(userid);

        // Update the notification_number label
        notification_number.setText("Unread Messages: " + unreadCount);
    }
    
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        page_1 p1 = new page_1();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void notification_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notification_btnActionPerformed
        // TODO add your handling code here:
        page_11 p11 = new page_11(userid);
        p11.setVisible(true);
        dispose();
    }//GEN-LAST:event_notification_btnActionPerformed

    private void cardiologist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardiologist_btnActionPerformed
        // TODO add your handling code here:
        page_7 p7 = new page_7(userid,"Cardiologist");
        p7.setVisible(true);
        dispose();
    }//GEN-LAST:event_cardiologist_btnActionPerformed

    private void child_specialist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_child_specialist_btnActionPerformed
        // TODO add your handling code here:
        page_7 p7 = new page_7(userid,"Child Specialist");
        p7.setVisible(true);
        dispose();
    }//GEN-LAST:event_child_specialist_btnActionPerformed

    private void haematology_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haematology_btnActionPerformed
        // TODO add your handling code here:
        page_7 p7 = new page_7(userid,"Haematology");
        p7.setVisible(true);
        dispose();
    }//GEN-LAST:event_haematology_btnActionPerformed

    private void dermatologist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dermatologist_btnActionPerformed
        // TODO add your handling code here:
        page_7 p7 = new page_7(userid,"Dermatologist");
        p7.setVisible(true);
        dispose();
    }//GEN-LAST:event_dermatologist_btnActionPerformed

    private void medicine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_btnActionPerformed
        // TODO add your handling code here:
        page_7 p7 = new page_7(userid,"Medicine");
        p7.setVisible(true);
        dispose();
    }//GEN-LAST:event_medicine_btnActionPerformed

    private void ent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ent_btnActionPerformed
        // TODO add your handling code here:
        page_7 p7 = new page_7(userid,"ENT");
        p7.setVisible(true);
        dispose();
    }//GEN-LAST:event_ent_btnActionPerformed

    private void chat_history_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat_history_btnActionPerformed
        // TODO add your handling code here:
        page_10 p10 = new page_10(userid);
        p10.setVisible(true);
        dispose();
    }//GEN-LAST:event_chat_history_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        page_1 p1 = new page_1();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page_6(userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_info_lb;
    private javax.swing.JLabel age_lb;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton cardiologist_btn;
    private javax.swing.JButton chat_history_btn;
    private javax.swing.JButton child_specialist_btn;
    private javax.swing.JButton dermatologist_btn;
    private javax.swing.JButton ent_btn;
    private javax.swing.JLabel gender_lb;
    private javax.swing.JButton haematology_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton medicine_btn;
    private javax.swing.JLabel name_lb;
    private javax.swing.JButton notification_btn;
    private javax.swing.JLabel notification_number;
    private javax.swing.JLabel phone_lb;
    // End of variables declaration//GEN-END:variables
}
