/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui.forms;

import BL.DoctorView;
import BL.PersonView;
import DAL.model.Appointment;
import DAL.model.Area;
import DAL.model.City;
import DAL.model.Contact;
import DAL.model.Country;
import DAL.model.Doctor;
import DAL.model.PersonAddress;
import Main.Utilities.Utils;
import static Main.Utilities.Utils.getCountryId;
import java.awt.Font;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Drazen Dragovic
 */
public class DoctorDetails extends javax.swing.JPanel {

    private static final DoctorView DOCTOR_VIEW = new DoctorView();
    private static final PersonView PERSON_VIEW = new PersonView();
    
    private int appId;
    private int idDoc;

    /**
     * Creates new form DocPatientDetails
     */
    public DoctorDetails() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexGroup = new javax.swing.ButtonGroup();
        jpDocPat = new javax.swing.JPanel();
        jpPatDetails = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txfDocID = new javax.swing.JTextField();
        txfDocMiddle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfDocName = new javax.swing.JTextField();
        txfDocSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfDocBirth = new javax.swing.JTextField();
        txfDocMarit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txfDocSpec = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfHomPhon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfDocPag = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txfDocMob = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txfDocFax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txfAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jcbArea = new javax.swing.JComboBox<>();
        jcbCitz = new javax.swing.JComboBox<>();
        jcbCountrz = new javax.swing.JComboBox<>();
        jpPatAppo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAppList = new javax.swing.JTable();
        btnDetails1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1080, 620));
        setMinimumSize(new java.awt.Dimension(1080, 620));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1080, 620));

        jpDocPat.setMaximumSize(new java.awt.Dimension(1080, 600));
        jpDocPat.setMinimumSize(new java.awt.Dimension(1080, 600));
        jpDocPat.setOpaque(false);
        jpDocPat.setLayout(new java.awt.BorderLayout(10, 0));

        jpPatDetails.setMaximumSize(new java.awt.Dimension(630, 600));
        jpPatDetails.setMinimumSize(new java.awt.Dimension(630, 600));
        jpPatDetails.setOpaque(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor Info", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 20), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Doctor ID :");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Middle name :");

        txfDocID.setEditable(false);
        txfDocID.setMinimumSize(new java.awt.Dimension(130, 30));
        txfDocID.setPreferredSize(new java.awt.Dimension(130, 30));
        txfDocID.setRequestFocusEnabled(false);

        txfDocMiddle.setEditable(false);
        txfDocMiddle.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("First name :");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Surname :");

        txfDocName.setEditable(false);

        txfDocSurname.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Date of Birth :");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Marital Stat. :");

        txfDocBirth.setEditable(false);
        txfDocBirth.setPreferredSize(new java.awt.Dimension(130, 24));

        txfDocMarit.setEditable(false);
        txfDocMarit.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Gender:");

        btnSexGroup.add(rbMale);
        rbMale.setText("M");
        rbMale.setEnabled(false);

        btnSexGroup.add(rbFemale);
        rbFemale.setText("F");
        rbFemale.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Spec:");

        txfDocSpec.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Home Tel:");

        txfHomPhon.setEditable(false);
        txfHomPhon.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Pager:");

        txfDocPag.setEditable(false);
        txfDocPag.setMinimumSize(new java.awt.Dimension(130, 24));
        txfDocPag.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("Mobile:");

        txfDocMob.setEditable(false);
        txfDocMob.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Fax:");

        txfDocFax.setEditable(false);
        txfDocFax.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Address:");

        txfAddress.setEditable(false);
        txfAddress.setMinimumSize(new java.awt.Dimension(130, 24));
        txfAddress.setPreferredSize(new java.awt.Dimension(130, 24));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 102));
        jLabel15.setText("Area:");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setText("City:");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("Country:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 102));
        jLabel18.setText("Description");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel7)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txfDocBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfDocMarit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfHomPhon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(64, 64, 64)
                                            .addComponent(txfDocPag, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel16))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jcbCitz, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                    .addComponent(txfDocSpec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfDocMob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfDocFax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCountrz, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(492, 492, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(34, 34, 34)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfDocMiddle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfDocID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txfDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfDocSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 22, Short.MAX_VALUE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDocBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rbMale)
                    .addComponent(rbFemale)
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfDocMarit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfDocSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfDocMob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfHomPhon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txfDocFax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfDocPag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jcbCitz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCountrz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txfDocID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txfDocMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txfDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txfDocSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(474, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpPatDetailsLayout = new javax.swing.GroupLayout(jpPatDetails);
        jpPatDetails.setLayout(jpPatDetailsLayout);
        jpPatDetailsLayout.setHorizontalGroup(
            jpPatDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPatDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jpPatDetailsLayout.setVerticalGroup(
            jpPatDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPatDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDocPat.add(jpPatDetails, java.awt.BorderLayout.LINE_START);

        jpPatAppo.setMaximumSize(new java.awt.Dimension(450, 600));
        jpPatAppo.setMinimumSize(new java.awt.Dimension(450, 600));
        jpPatAppo.setOpaque(false);

        jPanel3.setOpaque(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Appointments List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 500));

        jtblAppList.setAutoCreateRowSorter(true);
        jtblAppList.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jtblAppList.setForeground(new java.awt.Color(0, 51, 102));
        jtblAppList.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblAppList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblAppListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblAppList);

        btnDetails1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/images/attach_icon.png"))); // NOI18N
        btnDetails1.setLabel("Details");
        btnDetails1.setPreferredSize(new java.awt.Dimension(100, 40));
        btnDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetails1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPatAppoLayout = new javax.swing.GroupLayout(jpPatAppo);
        jpPatAppo.setLayout(jpPatAppoLayout);
        jpPatAppoLayout.setHorizontalGroup(
            jpPatAppoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPatAppoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        jpPatAppoLayout.setVerticalGroup(
            jpPatAppoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPatAppoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDocPat.add(jpPatAppo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpDocPat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jpDocPat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jpDocPat.getAccessibleContext().setAccessibleName("jpDocPat");

        getAccessibleContext().setAccessibleName("pnDocPatDet");
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetails1ActionPerformed
        JPanel main = (JPanel) this.getParent();
        PatientAppointment pta = (PatientAppointment) Utils.getPanelByName(main, "PatientAppointment");
        this.setVisible(false);
        pta.setVisible(true);
        pta.InitPanels(appId);
    }//GEN-LAST:event_btnDetails1ActionPerformed

    private void jtblAppListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblAppListMouseClicked
        int row = jtblAppList.getSelectedRow();
        appId = (Integer) jtblAppList.getModel().getValueAt(row, 0);
        System.out.println(appId);
    }//GEN-LAST:event_jtblAppListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails1;
    private javax.swing.ButtonGroup btnSexGroup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jcbArea;
    private javax.swing.JComboBox<String> jcbCitz;
    private javax.swing.JComboBox<String> jcbCountrz;
    private javax.swing.JPanel jpDocPat;
    private javax.swing.JPanel jpPatAppo;
    private javax.swing.JPanel jpPatDetails;
    private javax.swing.JTable jtblAppList;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txfAddress;
    private javax.swing.JTextField txfDocBirth;
    private javax.swing.JTextField txfDocFax;
    private javax.swing.JTextField txfDocID;
    private javax.swing.JTextField txfDocMarit;
    private javax.swing.JTextField txfDocMiddle;
    private javax.swing.JTextField txfDocMob;
    private javax.swing.JTextField txfDocName;
    private javax.swing.JTextField txfDocPag;
    private javax.swing.JTextField txfDocSpec;
    private javax.swing.JTextField txfDocSurname;
    private javax.swing.JTextField txfHomPhon;
    // End of variables declaration//GEN-END:variables

    private void init() {
        loadCitys();
        loadAreas();
        loadCountrys();
    }

    private void loadCitys() {
        List<City> citys = PERSON_VIEW.GetCitys();
        citys.forEach(c -> jcbCitz.addItem(c.getName()));
    }

    private void loadAreas() {
        List<Area> areas = PERSON_VIEW.GetAreas();
        areas.forEach(a -> jcbArea.addItem(a.getName()));
    }

    private void loadCountrys() {
        List<Country> countrys = PERSON_VIEW.GetCountrys();
        countrys.forEach(a -> jcbCountrz.addItem(a.getName()));
    }

    public void loadDoctorById(int idDoctor) {

        Doctor doctor = DOCTOR_VIEW.getDoctorById(idDoctor);
        Contact docCont = PERSON_VIEW.getPersonContact(doctor.getPersonID());
        PersonAddress docAddr = PERSON_VIEW.getPersonAddress(doctor.getPersonID());
        
        idDoc = idDoctor;

        txfDocID.setText(Integer.toString(doctor.getiDDoctor()));
        txfDocName.setText(doctor.getFirstName());
        txfDocMiddle.setText(doctor.getMiddleName());
        txfDocSurname.setText(doctor.getSurname());
        txfDocBirth.setText(doctor.getDateOFBirth().toLocalDate().toString());
        Boolean gender = doctor.getSex();

        if (gender.equals(true)) {
            rbMale.setSelected(true);
        } else {
            rbFemale.setSelected(true);
        }

        txfDocMarit.setText(doctor.getMaritalStatus());
        txfDocSpec.setText(doctor.getSpec());
        txfHomPhon.setText(docCont.getHomeTel());
        txfDocMob.setText(docCont.getMobile());
        txfDocPag.setText(docCont.getPager());
        txfDocFax.setText(docCont.getFax());
        txfAddress.setText(docAddr.toString());
        jcbCitz.setSelectedIndex(docAddr.getCityID() - 1);
        jcbArea.setSelectedIndex(docAddr.getAreaID() - 1);
        jcbCountrz.setSelectedIndex(getCountryId(docAddr.getCityID()) - 1);

    }
    
    DefaultTableModel dtm = new DefaultTableModel();

    public void loadList(int idDoc) {
        
        dtm.setRowCount(0); 
        
        dtm.setColumnIdentifiers(Appointment.appointmentDocColumns());

        List<Appointment> appointments = DOCTOR_VIEW.getAppointmentsForDoctor(idDoc);

        for (int i = 0; i < appointments.size(); i++) {
            
            Object[] row = new Object[Appointment.appointmentDocColumns().length];
            row[0] = appointments.get(i).getiDAppoint();
            row[1] = appointments.get(i).getTitle();
            row[2] = appointments.get(i).getPreferredDate().toLocalDate();
            row[3] = appointments.get(i).getOutpatientID();

            dtm.addRow(row);
        }

        jtblAppList.setModel(dtm);
        jtblAppList.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 14));
        jtblAppList.setRowHeight(20);
        
        ListSelectionModel select = jtblAppList.getSelectionModel();
        select.setSelectionInterval(0, 0);
        select.setSelectionMode(0);
        jtblAppList.setDefaultEditor(Object.class, null);
        
        dtm.addTableModelListener((TableModelEvent tme) -> {
            DefaultTableModel tm = (DefaultTableModel) tme.getSource();
        });
    }
}
