/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCSULibrary;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nisthagarg
 */
public class CameraData extends javax.swing.JFrame {

    /**
     * Creates new form CameraData
     */
    public CameraData() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1AvailableCamera = new javax.swing.JTable();
        jButton1IssueCamera = new javax.swing.JButton();
        jLabel1AvailableCamera = new javax.swing.JLabel();
        jLabel1Checkoutdate = new javax.swing.JLabel();
        jTextField1CheckoutDate = new javax.swing.JTextField();
        jButton1SearchCamera = new javax.swing.JButton();
        jLabel1OnholdCamera = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1OnholdTable = new javax.swing.JTable();
        jButton1CheckoutCamera = new javax.swing.JButton();
        jLabel1checkedoutCamera = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablecheckedoutCamera = new javax.swing.JTable();
        jLabel1QueueCamera = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableQueueCamera = new javax.swing.JTable();
        jButton1returnCamera1 = new javax.swing.JButton();
        jButton1BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1AvailableCamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1AvailableCamera);

        jButton1IssueCamera.setText("issue");
        jButton1IssueCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1IssueCameraActionPerformed(evt);
            }
        });

        jLabel1AvailableCamera.setText("available camera's");

        jLabel1Checkoutdate.setText("checkout date DD-MON-YYYY");

        jTextField1CheckoutDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1CheckoutDateActionPerformed(evt);
            }
        });

        jButton1SearchCamera.setText("search");
        jButton1SearchCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SearchCameraActionPerformed(evt);
            }
        });

        jLabel1OnholdCamera.setText("onhold camera's");

        jTable1OnholdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1OnholdTable);

        jButton1CheckoutCamera.setText("checkout");
        jButton1CheckoutCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CheckoutCameraActionPerformed(evt);
            }
        });

        jLabel1checkedoutCamera.setText("checkedout camera's");

        jTablecheckedoutCamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTablecheckedoutCamera);

        jLabel1QueueCamera.setText("queue");

        jTableQueueCamera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTableQueueCamera);

        jButton1returnCamera1.setText("return");
        jButton1returnCamera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1returnCamera1ActionPerformed(evt);
            }
        });

        jButton1BACK.setText("BACK");
        jButton1BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1IssueCamera))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1Checkoutdate)
                                    .addComponent(jTextField1CheckoutDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1SearchCamera, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1BACK, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1checkedoutCamera)
                            .addComponent(jLabel1OnholdCamera)
                            .addComponent(jLabel1AvailableCamera))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4)
                                .addGap(132, 132, 132))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1QueueCamera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1CheckoutCamera)
                            .addComponent(jButton1returnCamera1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1Checkoutdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1CheckoutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1SearchCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1AvailableCamera)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1IssueCamera))
                .addGap(18, 18, 18)
                .addComponent(jLabel1OnholdCamera)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1CheckoutCamera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1checkedoutCamera)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1returnCamera1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1QueueCamera)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SearchCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SearchCameraActionPerformed
        // TODO add your handling code here:
        
        try {
            //Statement stmt = connection.createStatement();
            CallableStatement stmt3 = GlobalData.connection.prepareCall("{call search_camera(to_char(to_date(?,'DD-MON-YYYY'), 'Day'))}");
                   stmt3.setString(1,jTextField1CheckoutDate.getText());
                   stmt3.executeUpdate();
            if(GlobalData.loginType.equalsIgnoreCase("Students"))    
            {
            PreparedStatement stmt = GlobalData.connection.prepareStatement("SELECT CAMERAID,MAKE,MODEL,CONFIG_LENS,MEMORY_AVAILABLE,LIBRARY_NAME from CAMERA "
                    + "MINUS "
                    + "SELECT c.CAMERAID,c.MAKE,c.MODEL,c.CONFIG_LENS,c.MEMORY_AVAILABLE,c.LIBRARY_NAME from CAMERA c,s_camera_history s, queue_camera q where (s.duedate<to_date(?,'DD-MON-YYYY hh24:mi:ss')) OR (?=s.studentno AND c.CAMERAID=s.camera_name AND (s.status='H' OR s.status='C'))"
                    +"MINUS SELECT c.CAMERAID,c.MAKE,c.MODEL,c.CONFIG_LENS,c.MEMORY_AVAILABLE,c.LIBRARY_NAME from CAMERA c,f_camera_history f, queue_camera q where (f.duedate<to_date(?,'DD-MON-YYYY hh24:mi:ss')) OR (c.CAMERAID=f.camera_name AND f.status='C')");

            stmt.setString(1,jTextField1CheckoutDate.getText());
            stmt.setString(2,GlobalData.loginSession);
            stmt.setString(3,jTextField1CheckoutDate.getText());
            ResultSet rs = stmt.executeQuery();
            jTable1AvailableCamera.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
                PreparedStatement stmt = GlobalData.connection.prepareStatement("SELECT CAMERAID,MAKE,MODEL,CONFIG_LENS,MEMORY_AVAILABLE,LIBRARY_NAME from CAMERA "
                    + "MINUS "
                    + "SELECT c.CAMERAID,c.MAKE,c.MODEL,c.CONFIG_LENS,c.MEMORY_AVAILABLE,c.LIBRARY_NAME from CAMERA c,f_camera_history f, queue_camera q where (f.duedate<to_date(?,'DD-MON-YYYY hh24:mi:ss')) OR (?=f.facultyno AND c.CAMERAID=f.camera_name AND (f.status='H' OR f.status='C'))"
                    + "MINUS SELECT c.CAMERAID,c.MAKE,c.MODEL,c.CONFIG_LENS,c.MEMORY_AVAILABLE,c.LIBRARY_NAME from CAMERA c,s_camera_history s, queue_camera q where (s.duedate<to_date(?,'DD-MON-YYYY hh24:mi:ss')) OR (c.CAMERAID=s.camera_name AND s.status='C')");
 
                        stmt.setString(1,jTextField1CheckoutDate.getText());
            stmt.setString(2,GlobalData.loginSession);
            stmt.setString(3,jTextField1CheckoutDate.getText());
            ResultSet rs = stmt.executeQuery();
            jTable1AvailableCamera.setModel(DbUtils.resultSetToTableModel(rs));
            }
            
            if(GlobalData.loginType.equalsIgnoreCase("Students"))
            {
            PreparedStatement stmt1 = GlobalData.connection.prepareStatement("SELECT s.camera_name,s.checkoutdate,s.status from s_camera_history s where ?=s.studentno and s.status='H'");
            stmt1.setString(1,GlobalData.loginSession);
            ResultSet rs1 = stmt1.executeQuery();
            jTable1OnholdTable.setModel(DbUtils.resultSetToTableModel(rs1));
            }
            else
            {
            PreparedStatement stmt1 = GlobalData.connection.prepareStatement("SELECT f.camera_name,f.checkoutdate,f.status from f_camera_history f where ?=f.facultyno and f.status='H'");
            stmt1.setString(1,GlobalData.loginSession);
            ResultSet rs1 = stmt1.executeQuery();
            jTable1OnholdTable.setModel(DbUtils.resultSetToTableModel(rs1));
            }
            
            
            if(GlobalData.loginType.equalsIgnoreCase("Students"))
            {
            PreparedStatement stmt2 = GlobalData.connection.prepareStatement("SELECT s.camera_name,s.checkoutdate,s.duedate,s.status from s_camera_history s where ?=s.studentno and s.status='C' and s.actualreturndate is NULL");
            stmt2.setString(1,GlobalData.loginSession);
            ResultSet rs2 = stmt2.executeQuery();
            jTablecheckedoutCamera.setModel(DbUtils.resultSetToTableModel(rs2));
            }
            else
            {
            PreparedStatement stmt2 = GlobalData.connection.prepareStatement("SELECT f.camera_name,f.checkoutdate,f.duedate,f.status from f_camera_history f where ?=f.facultyno and f.status='C' and f.actualreturndate is NULL");
            stmt2.setString(1,GlobalData.loginSession);
            ResultSet rs2 = stmt2.executeQuery();
            jTablecheckedoutCamera.setModel(DbUtils.resultSetToTableModel(rs2));
            }
            
            PreparedStatement stmt4 = GlobalData.connection.prepareStatement("SELECT * from queue_camera q where ?=q.patron_id and q.status='H'");
            stmt4.setString(1,GlobalData.loginSession);
            ResultSet rs4 = stmt4.executeQuery();
            jTableQueueCamera.setModel(DbUtils.resultSetToTableModel(rs4));
            
  

            // Close the RseultSet
            //rs.close();

            // Close the Statement
            //stmt.close();
               //stmt1.close();
            // Close the connection
        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }
    }//GEN-LAST:event_jButton1SearchCameraActionPerformed

    private void jTextField1CheckoutDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1CheckoutDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1CheckoutDateActionPerformed

    private void jButton1CheckoutCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CheckoutCameraActionPerformed
        // TODO add your handling code here:
        try { 
            //PreparedStatement stmt = GlobalData.connection.prepareStatement("insert into s_books_history values(?,?,?,?,NULL)");
            if(GlobalData.loginType.equalsIgnoreCase("Students"))
            {
            CallableStatement stmt = GlobalData.connection.prepareCall("{call proc_s_checkout_camera(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'))}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTable1OnholdTable.getValueAt(jTable1OnholdTable.getSelectedRow(),0).toString() );
                   //stmt.setTimestamp(3,java.sql.Timestamp.valueOf(jTextStartDate.getText()));
                   //stmt.setTimestamp(4,java.sql.Timestamp.valueOf(jTextEndDate.getText()));
                   stmt.setString(3,jTextField1CheckoutDate.getText());
                
 
                   stmt.executeUpdate();
            PreparedStatement stmt1 = GlobalData.connection.prepareStatement("SELECT s.camera_name,s.checkoutdate,s.duedate,s.status from s_camera_history s where ?=s.studentno and s.status='C' and s.actualreturndate is NULL");
            stmt1.setString(1,GlobalData.loginSession);
            ResultSet rs = stmt1.executeQuery();
            jTablecheckedoutCamera.setModel(DbUtils.resultSetToTableModel(rs));
            
       
           
            JOptionPane.showMessageDialog(null, "CAMERA CHECKEDOUT", "Success", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                CallableStatement stmt = GlobalData.connection.prepareCall("{call proc_f_checkout_camera(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'))}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTable1OnholdTable.getValueAt(jTable1OnholdTable.getSelectedRow(),0).toString() );
                   //stmt.setTimestamp(3,java.sql.Timestamp.valueOf(jTextStartDate.getText()));
                   //stmt.setTimestamp(4,java.sql.Timestamp.valueOf(jTextEndDate.getText()));
                   stmt.setString(3,jTextField1CheckoutDate.getText());
                
 
                   stmt.executeUpdate();
            PreparedStatement stmt1 = GlobalData.connection.prepareStatement("SELECT f.camera_name,f.checkoutdate,f.duedate,f.status from f_camera_history f where ?=f.facultyno and f.status='C' and f.actualreturndate is NULL");
            stmt1.setString(1,GlobalData.loginSession);
            ResultSet rs = stmt1.executeQuery();
            jTablecheckedoutCamera.setModel(DbUtils.resultSetToTableModel(rs));
            
       
           
            JOptionPane.showMessageDialog(null, "CAMERA CHECKEDOUT", "Success", JOptionPane.PLAIN_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

      //  }
    }  
    }//GEN-LAST:event_jButton1CheckoutCameraActionPerformed

    private void jButton1IssueCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1IssueCameraActionPerformed
        // TODO add your handling code here:
        try { 
            //PreparedStatement stmt = GlobalData.connection.prepareStatement("insert into s_books_history values(?,?,?,?,NULL)");
            if(GlobalData.loginType.equalsIgnoreCase("Students"))
            {
            CallableStatement stmt = GlobalData.connection.prepareCall("{call proc_s_issue_camera(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'))}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTable1AvailableCamera.getValueAt(jTable1AvailableCamera.getSelectedRow(),0).toString() );
                   //stmt.setTimestamp(3,java.sql.Timestamp.valueOf(jTextStartDate.getText()));
                   //stmt.setTimestamp(4,java.sql.Timestamp.valueOf(jTextEndDate.getText()));
                   stmt.setString(3,jTextField1CheckoutDate.getText());
                
 
                   stmt.executeUpdate();
            PreparedStatement stmt1 = GlobalData.connection.prepareStatement("SELECT s.camera_name,s.checkoutdate,s.status from s_camera_history s where ?=s.studentno and s.status='H'");
            stmt1.setString(1,GlobalData.loginSession);
            ResultSet rs = stmt1.executeQuery();
            jTable1OnholdTable.setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "CAMERA ISSUED, CHECKOUT ON HOLD", "Success", JOptionPane.PLAIN_MESSAGE);

            CallableStatement stmt2 = GlobalData.connection.prepareCall("{call proc_queue_camera('S',?,?,?)}");
                   stmt2.setString(1,GlobalData.loginSession);
                   stmt2.setString(2,jTable1AvailableCamera.getValueAt(jTable1AvailableCamera.getSelectedRow(),0).toString() );
                   stmt2.setString(3,jTextField1CheckoutDate.getText());                                   
                   stmt2.executeUpdate();

            PreparedStatement stmt3 = GlobalData.connection.prepareStatement("SELECT * from queue_camera q where ?=q.patron_id");
            stmt3.setString(1,GlobalData.loginSession);
            ResultSet rs2 = stmt3.executeQuery();
            jTableQueueCamera.setModel(DbUtils.resultSetToTableModel(rs2));
            JOptionPane.showMessageDialog(null, "You have been put on waitlist for this queue.", "Success", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                CallableStatement stmt = GlobalData.connection.prepareCall("{call proc_f_issue_camera(?,?,to_date(?,'DD-MON-YYYY hh24:mi:ss'))}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTable1AvailableCamera.getValueAt(jTable1AvailableCamera.getSelectedRow(),0).toString() );
                   //stmt.setTimestamp(3,java.sql.Timestamp.valueOf(jTextStartDate.getText()));
                   //stmt.setTimestamp(4,java.sql.Timestamp.valueOf(jTextEndDate.getText()));
                   stmt.setString(3,jTextField1CheckoutDate.getText());
                
 
                   stmt.executeUpdate();
            PreparedStatement stmt1 = GlobalData.connection.prepareStatement("SELECT f.camera_name,f.checkoutdate,f.status from f_camera_history f where ?=f.facultyno and f.status='H'");
            stmt1.setString(1,GlobalData.loginSession);
            ResultSet rs = stmt1.executeQuery();
            jTable1OnholdTable.setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "CAMERA ISSUED, CHECKOUT ON HOLD", "Success", JOptionPane.PLAIN_MESSAGE);

            
            CallableStatement stmt2 = GlobalData.connection.prepareCall("{call proc_queue_camera('F',?,?,?)}");
                   stmt2.setString(1,GlobalData.loginSession);
                   stmt2.setString(2,jTable1AvailableCamera.getValueAt(jTable1AvailableCamera.getSelectedRow(),0).toString() );
                   stmt2.setString(3,jTextField1CheckoutDate.getText());                                   
                   stmt2.executeUpdate();

            PreparedStatement stmt3 = GlobalData.connection.prepareStatement("SELECT * from queue_camera q where ?=q.patron_id");
            stmt3.setString(1,GlobalData.loginSession);
            ResultSet rs2 = stmt3.executeQuery();
            jTableQueueCamera.setModel(DbUtils.resultSetToTableModel(rs2));
            JOptionPane.showMessageDialog(null, "You have been put on waitlist for this queue.", "Success", JOptionPane.PLAIN_MESSAGE);
            }
            

            
       
            

            // Close the Statement
            
           

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

      //  }
    }         
        
    }//GEN-LAST:event_jButton1IssueCameraActionPerformed

    private void jButton1returnCamera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1returnCamera1ActionPerformed
        // TODO add your handling code here:
        try { 
            if(GlobalData.loginType.equalsIgnoreCase("Students"))
            //PreparedStatement stmt = GlobalData.connection.prepareStatement("insert into s_books_history values(?,?,?,?,NULL)");
            {CallableStatement stmt = GlobalData.connection.prepareCall("{call proc_s_return_camera(?,?)}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTablecheckedoutCamera.getValueAt(jTablecheckedoutCamera.getSelectedRow(),0).toString() );
                   //stmt.setTimestamp(3,java.sql.Timestamp.valueOf(jTextStartDate.getText()));
                   //stmt.setTimestamp(4,java.sql.Timestamp.valueOf(jTextEndDate.getText()));
                  
                
 
                   stmt.executeUpdate();
       
            
       
        
            
           
JOptionPane.showMessageDialog(null, "CAMERA Returned", "Success", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                CallableStatement stmt = GlobalData.connection.prepareCall("{call proc_f_return_camera(?,?)}");
                   stmt.setString(1,GlobalData.loginSession);
                   stmt.setString(2,jTablecheckedoutCamera.getValueAt(jTablecheckedoutCamera.getSelectedRow(),0).toString() );
                   //stmt.setTimestamp(3,java.sql.Timestamp.valueOf(jTextStartDate.getText()));
                   //stmt.setTimestamp(4,java.sql.Timestamp.valueOf(jTextEndDate.getText()));
                  
                
 
                   stmt.executeUpdate();
            }
            
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

      //  }
    }         
 
    }//GEN-LAST:event_jButton1returnCamera1ActionPerformed

    private void jButton1BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BACKActionPerformed
        // TODO add your handling code here:
        new Resources().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1BACKActionPerformed

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
            java.util.logging.Logger.getLogger(CameraData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CameraData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CameraData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CameraData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CameraData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1BACK;
    private javax.swing.JButton jButton1CheckoutCamera;
    private javax.swing.JButton jButton1IssueCamera;
    private javax.swing.JButton jButton1SearchCamera;
    private javax.swing.JButton jButton1returnCamera1;
    private javax.swing.JLabel jLabel1AvailableCamera;
    private javax.swing.JLabel jLabel1Checkoutdate;
    private javax.swing.JLabel jLabel1OnholdCamera;
    private javax.swing.JLabel jLabel1QueueCamera;
    private javax.swing.JLabel jLabel1checkedoutCamera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1AvailableCamera;
    private javax.swing.JTable jTable1OnholdTable;
    private javax.swing.JTable jTableQueueCamera;
    private javax.swing.JTable jTablecheckedoutCamera;
    private javax.swing.JTextField jTextField1CheckoutDate;
    // End of variables declaration//GEN-END:variables
}