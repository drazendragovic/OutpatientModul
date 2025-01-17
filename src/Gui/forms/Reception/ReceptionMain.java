/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui.forms.Reception;

import BL.MedicPersonView;
import DAL.model.MedicalPerson;
import DAL.model.WorkingTime;
import Gui.forms.BillsList;
import Gui.forms.PatientsList;
import Gui.forms.DoctorDetails;
import Gui.forms.DoctorList;
import Gui.forms.PatientAppointment;
import Gui.forms.PatientDetails;
import Gui.forms.PatientsAppsList;
import Main.Utilities.Utils;
import static Main.Utilities.Utils.CloseOpenPanel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Drazen Dragovic
 */
public class ReceptionMain extends javax.swing.JPanel {

    private static final MedicPersonView MEDPERSON_VIEW = new MedicPersonView();
    
    /**
     * Creates new form DoctorMainPanel
     */
    public ReceptionMain() {
        initComponents();
    }

    public ReceptionMain(MedicalPerson mp) {
        initComponents();
        InitPanels(mp);
        showRecepInfo(mp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpRecNav = new javax.swing.JPanel();
        jifNav = new javax.swing.JInternalFrame();
        jmbRecNav = new javax.swing.JMenuBar();
        jmRecReg = new javax.swing.JMenu();
        jmiRegMin = new javax.swing.JMenuItem();
        jmiRegComp = new javax.swing.JMenuItem();
        jmRecPat = new javax.swing.JMenu();
        jmRecDoc = new javax.swing.JMenu();
        jmRecApp = new javax.swing.JMenu();
        jmRecBill = new javax.swing.JMenu();
        jmRecStat = new javax.swing.JMenu();
        jpRecFooter = new javax.swing.JPanel();
        javax.swing.JLabel lblInfo = new javax.swing.JLabel();
        jpRecInfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JLabel1 = new javax.swing.JLabel();
        lblRecName = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        lblRecSurname = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        lblStartTime = new javax.swing.JLabel();
        JLabel4 = new javax.swing.JLabel();
        lblEndTime = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jpRecCont = new javax.swing.JPanel();
        jpBack = new javax.swing.JPanel();
        jlblBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1300, 700));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1300, 700));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jpMain.setMaximumSize(new java.awt.Dimension(1300, 700));
        jpMain.setMinimumSize(new java.awt.Dimension(1300, 700));
        jpMain.setOpaque(false);
        jpMain.setPreferredSize(new java.awt.Dimension(1300, 700));
        jpMain.setLayout(new java.awt.BorderLayout(10, 10));

        jpRecNav.setBackground(new java.awt.Color(51, 153, 255));
        jpRecNav.setMaximumSize(new java.awt.Dimension(1300, 30));
        jpRecNav.setMinimumSize(new java.awt.Dimension(1300, 30));
        jpRecNav.setPreferredSize(new java.awt.Dimension(1300, 30));

        jifNav.setBackground(new java.awt.Color(51, 153, 255));
        jifNav.setBorder(null);
        jifNav.setMaximumSize(new java.awt.Dimension(1300, 30));
        jifNav.setMinimumSize(new java.awt.Dimension(1300, 30));
        jifNav.setOpaque(false);
        jifNav.setPreferredSize(new java.awt.Dimension(1300, 30));
        jifNav.setRequestFocusEnabled(false);
        jifNav.setVisible(true);

        jmbRecNav.setBorder(null);
        jmbRecNav.setMaximumSize(new java.awt.Dimension(1300, 30));
        jmbRecNav.setMinimumSize(new java.awt.Dimension(1300, 30));
        jmbRecNav.setOpaque(false);
        jmbRecNav.setPreferredSize(new java.awt.Dimension(1300, 30));

        jmRecReg.setBorder(null);
        jmRecReg.setForeground(new java.awt.Color(0, 51, 102));
        jmRecReg.setText("Registration");
        jmRecReg.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jmiRegMin.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmiRegMin.setForeground(new java.awt.Color(0, 51, 102));
        jmiRegMin.setText("Mini Form");
        jmiRegMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegMinActionPerformed(evt);
            }
        });
        jmRecReg.add(jmiRegMin);

        jmiRegComp.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmiRegComp.setText("Comprehensive Form");
        jmiRegComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegCompActionPerformed(evt);
            }
        });
        jmRecReg.add(jmiRegComp);

        jmbRecNav.add(jmRecReg);

        jmRecPat.setBorder(null);
        jmRecPat.setForeground(new java.awt.Color(0, 51, 102));
        jmRecPat.setText("Patients");
        jmRecPat.setFocusable(false);
        jmRecPat.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmRecPat.setRequestFocusEnabled(false);
        jmRecPat.setRolloverEnabled(true);
        jmRecPat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRecPatMouseClicked(evt);
            }
        });
        jmbRecNav.add(jmRecPat);

        jmRecDoc.setBorder(null);
        jmRecDoc.setForeground(new java.awt.Color(0, 51, 102));
        jmRecDoc.setText("Doctors");
        jmRecDoc.setFocusable(false);
        jmRecDoc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmRecDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmRecDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmRecDoc.setRequestFocusEnabled(false);
        jmRecDoc.setRolloverEnabled(true);
        jmRecDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRecDocMouseClicked(evt);
            }
        });
        jmbRecNav.add(jmRecDoc);

        jmRecApp.setBorder(null);
        jmRecApp.setForeground(new java.awt.Color(0, 51, 102));
        jmRecApp.setText("Appointments");
        jmRecApp.setFocusable(false);
        jmRecApp.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmRecApp.setRequestFocusEnabled(false);
        jmRecApp.setRolloverEnabled(true);
        jmRecApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRecAppMouseClicked(evt);
            }
        });
        jmbRecNav.add(jmRecApp);

        jmRecBill.setBorder(null);
        jmRecBill.setForeground(new java.awt.Color(0, 51, 102));
        jmRecBill.setText("Bills");
        jmRecBill.setFocusable(false);
        jmRecBill.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmRecBill.setRequestFocusEnabled(false);
        jmRecBill.setRolloverEnabled(true);
        jmRecBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRecBillMouseClicked(evt);
            }
        });
        jmbRecNav.add(jmRecBill);

        jmRecStat.setBorder(null);
        jmRecStat.setForeground(new java.awt.Color(0, 51, 102));
        jmRecStat.setText("Statistics");
        jmRecStat.setFocusable(false);
        jmRecStat.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jmRecStat.setRequestFocusEnabled(false);
        jmRecStat.setRolloverEnabled(true);
        jmRecStat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRecStatMouseClicked(evt);
            }
        });
        jmbRecNav.add(jmRecStat);

        jifNav.setJMenuBar(jmbRecNav);

        javax.swing.GroupLayout jifNavLayout = new javax.swing.GroupLayout(jifNav.getContentPane());
        jifNav.getContentPane().setLayout(jifNavLayout);
        jifNavLayout.setHorizontalGroup(
            jifNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jifNavLayout.setVerticalGroup(
            jifNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpRecNavLayout = new javax.swing.GroupLayout(jpRecNav);
        jpRecNav.setLayout(jpRecNavLayout);
        jpRecNavLayout.setHorizontalGroup(
            jpRecNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jifNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpRecNavLayout.setVerticalGroup(
            jpRecNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecNavLayout.createSequentialGroup()
                .addComponent(jifNav, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BasicInternalFrameUI bi = (BasicInternalFrameUI)jifNav.getUI();
        bi.setNorthPane(null);

        jpMain.add(jpRecNav, java.awt.BorderLayout.PAGE_START);

        jpRecFooter.setBackground(new java.awt.Color(102, 153, 0));
        jpRecFooter.setMaximumSize(new java.awt.Dimension(1300, 30));
        jpRecFooter.setMinimumSize(new java.awt.Dimension(1300, 30));
        jpRecFooter.setPreferredSize(new java.awt.Dimension(1300, 30));

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("Powered by Outpatient Manager, 2018");
        lblInfo.setFocusable(false);
        lblInfo.setMaximumSize(new java.awt.Dimension(1300, 30));
        lblInfo.setMinimumSize(new java.awt.Dimension(1300, 30));
        lblInfo.setPreferredSize(new java.awt.Dimension(1300, 30));

        javax.swing.GroupLayout jpRecFooterLayout = new javax.swing.GroupLayout(jpRecFooter);
        jpRecFooter.setLayout(jpRecFooterLayout);
        jpRecFooterLayout.setHorizontalGroup(
            jpRecFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpRecFooterLayout.setVerticalGroup(
            jpRecFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblInfo.getAccessibleContext().setAccessibleName("lblInfo");

        jpMain.add(jpRecFooter, java.awt.BorderLayout.PAGE_END);

        jpRecInfo.setBackground(new java.awt.Color(225, 255, 225));
        jpRecInfo.setMaximumSize(new java.awt.Dimension(210, 615));
        jpRecInfo.setMinimumSize(new java.awt.Dimension(210, 615));
        jpRecInfo.setPreferredSize(new java.awt.Dimension(210, 615));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receptionist Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(180, 570));
        jPanel1.setMinimumSize(new java.awt.Dimension(180, 570));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 570));

        JLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(0, 51, 102));
        JLabel1.setText("Name:");

        lblRecName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRecName.setToolTipText("");

        JLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        JLabel2.setForeground(new java.awt.Color(0, 51, 102));
        JLabel2.setText("Surname:");

        lblRecSurname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRecSurname.setToolTipText("");

        JLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(0, 51, 102));
        JLabel3.setText("Start Time:");

        lblStartTime.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblStartTime.setToolTipText("");

        JLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(0, 51, 102));
        JLabel4.setText("End Time:");

        lblEndTime.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEndTime.setToolTipText("");

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setPreferredSize(new java.awt.Dimension(100, 40));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRecSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRecName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEndTime, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(JLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRecName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRecSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jpRecInfoLayout = new javax.swing.GroupLayout(jpRecInfo);
        jpRecInfo.setLayout(jpRecInfoLayout);
        jpRecInfoLayout.setHorizontalGroup(
            jpRecInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRecInfoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jpRecInfoLayout.setVerticalGroup(
            jpRecInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpMain.add(jpRecInfo, java.awt.BorderLayout.LINE_START);

        jpRecCont.setMaximumSize(new java.awt.Dimension(1080, 595));
        jpRecCont.setMinimumSize(new java.awt.Dimension(1080, 595));
        jpRecCont.setOpaque(false);
        jpRecCont.setPreferredSize(new java.awt.Dimension(1080, 595));
        jpRecCont.setLayout(new java.awt.CardLayout());
        jpMain.add(jpRecCont, java.awt.BorderLayout.CENTER);

        jlblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/images/back.jpg"))); // NOI18N
        jlblBack.setFocusable(false);
        jlblBack.setMaximumSize(new java.awt.Dimension(1300, 700));
        jlblBack.setMinimumSize(new java.awt.Dimension(1300, 700));
        jlblBack.setPreferredSize(new java.awt.Dimension(1300, 700));

        javax.swing.GroupLayout jpBackLayout = new javax.swing.GroupLayout(jpBack);
        jpBack.setLayout(jpBackLayout);
        jpBackLayout.setHorizontalGroup(
            jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBackLayout.createSequentialGroup()
                    .addComponent(jlblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpBackLayout.setVerticalGroup(
            jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
            .addGroup(jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpBackLayout.createSequentialGroup()
                    .addComponent(jlblBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpBack, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jpBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("pnDocPat");
    }// </editor-fold>//GEN-END:initComponents

    private void InitPanels(MedicalPerson mp) {
        InitRecPanels(mp);
    }

    private void InitRecPanels(MedicalPerson mp) {

        PatientsAppsList dpal = new PatientsAppsList();
        dpal.setName("PatientsAppsList");
        jpRecCont.add(dpal);
        dpal.reset();

        PatientMiniForm pmf = new PatientMiniForm();
        pmf.setName("PatientMiniForm");
        jpRecCont.add(pmf);

        PatientsList ptl = new PatientsList();
        ptl.setName("PatientsList");
        jpRecCont.add(ptl);

        PatientDetails rpd = new PatientDetails(mp);
        rpd.setName("PatientDetails");
        jpRecCont.add(rpd);

        PatientAppointment rpa = new PatientAppointment();
        rpa.setName("PatientAppointment");
        jpRecCont.add(rpa);

        DoctorList rdl = new DoctorList();
        rdl.setName("DoctorList");
        jpRecCont.add(rdl);

        DoctorDetails rdd = new DoctorDetails();
        rdd.setName("DoctorDetails");
        jpRecCont.add(rdd);

        RecStat rcs = new RecStat();
        rcs.setName("RecStat");
        jpRecCont.add(rcs);

        BillsList rbl = new BillsList();
        rbl.setName("RecBillsList");
        jpRecCont.add(rbl);
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        JPanel main = (JPanel) jpMain.getParent();
        main.getComponent(0).setVisible(true);
        jpRecCont.removeAll();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jmRecDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRecDocMouseClicked
        DoctorList rdl = (DoctorList)Utils.getPanelByName(jpRecCont, "DoctorList");
        CloseOpenPanel(jpRecCont);
        rdl.setVisible(true);
        rdl.reset();
    }//GEN-LAST:event_jmRecDocMouseClicked

    private void jmRecAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRecAppMouseClicked
        PatientsAppsList rpl = (PatientsAppsList)Utils.getPanelByName(jpRecCont, "PatientsAppsList");
        CloseOpenPanel(jpRecCont);
        rpl.setVisible(true);
        rpl.reset();
    }//GEN-LAST:event_jmRecAppMouseClicked

    private void jmRecBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRecBillMouseClicked
        BillsList rbl = (BillsList)Utils.getPanelByName(jpRecCont, "RecBillsList");
        CloseOpenPanel(jpRecCont);
        rbl.setVisible(true);
        rbl.reset();
    }//GEN-LAST:event_jmRecBillMouseClicked

    private void jmRecStatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRecStatMouseClicked
        JPanel rcs = Utils.getPanelByName(jpRecCont, "RecStat");
        CloseOpenPanel(jpRecCont);
        rcs.setVisible(true);
    }//GEN-LAST:event_jmRecStatMouseClicked

    private void jmiRegMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegMinActionPerformed
        PatientMiniForm pmf = (PatientMiniForm)Utils.getPanelByName(jpRecCont, "PatientMiniForm");
        CloseOpenPanel(jpRecCont);
        pmf.setVisible(true);
    }//GEN-LAST:event_jmiRegMinActionPerformed

    private void jmiRegCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegCompActionPerformed
        PatientDetails rpd = (PatientDetails)Utils.getPanelByName(jpRecCont, "PatientDetails");
        CloseOpenPanel(jpRecCont);
        rpd.setVisible(true);
        rpd.reset();
    }//GEN-LAST:event_jmiRegCompActionPerformed

    private void jmRecPatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRecPatMouseClicked
        PatientsList rpl = (PatientsList)Utils.getPanelByName(jpRecCont, "PatientsList");
        CloseOpenPanel(jpRecCont);
        rpl.setVisible(true);
        rpl.reset();
    }//GEN-LAST:event_jmRecPatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JInternalFrame jifNav;
    private javax.swing.JLabel jlblBack;
    private javax.swing.JMenu jmRecApp;
    private javax.swing.JMenu jmRecBill;
    private javax.swing.JMenu jmRecDoc;
    private javax.swing.JMenu jmRecPat;
    private javax.swing.JMenu jmRecReg;
    private javax.swing.JMenu jmRecStat;
    private javax.swing.JMenuBar jmbRecNav;
    private javax.swing.JMenuItem jmiRegComp;
    private javax.swing.JMenuItem jmiRegMin;
    private javax.swing.JPanel jpBack;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpRecCont;
    private javax.swing.JPanel jpRecFooter;
    private javax.swing.JPanel jpRecInfo;
    private javax.swing.JPanel jpRecNav;
    private javax.swing.JLabel lblEndTime;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblRecName;
    private javax.swing.JLabel lblRecSurname;
    private javax.swing.JLabel lblStartTime;
    // End of variables declaration//GEN-END:variables

    private void showRecepInfo(MedicalPerson mp) {
        WorkingTime wt = MEDPERSON_VIEW.getMedPerWorkTime(mp.getiDOMedPerson());
        lblRecName.setText(mp.getFirstName());
        lblRecSurname.setText(mp.getSurname());
        lblStartTime.setText(wt.getBeginTime().toLocalTime().toString());
        lblEndTime.setText(wt.getEndTime().toLocalTime().toString());
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/images/recep.jpg")));
    }

}
