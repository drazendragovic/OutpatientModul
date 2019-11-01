/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Utilities;

import BL.PersonView;
import DAL.model.City;
import com.github.lgooddatepicker.components.DatePicker;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Drazen Dragovic
 */
public class Utils {

    private static final PersonView PERSON_VIEW = new PersonView();
    private static final int PAGE_SIZE = 25;

    public static void SetFramePosition(JFrame frame) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width / 2 - frame.getWidth() / 2,
                size.height / 2 - frame.getHeight() / 2);
    }

    public static void currentDate(JMenu txtdate, JMenu txttime) {

        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        txtdate.setText(day + "/" + (month + 1) + "/" + "/" + year);

        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        ActionListener timerListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                String time = timeFormat.format(date);
                txttime.setText(time);
            }
        };
        Timer timer = new Timer(1000, timerListener);
        // vrijeme pocinje bez odgode na početku
        timer.setInitialDelay(0);
        timer.start();
    }

    public static JPanel getPanelByName(JPanel root, String name) {
        for (Component c : root.getComponents()) {
            if (name.equals(c.getName())) {
                return (JPanel) c;
            }
        }
        return null;
    }

    public static void CloseOpenPanel(JPanel jpMain) {
        for (Component c : jpMain.getComponents()) {
            if (c.isVisible() == true) {
                c.setVisible(false);
            }
        }
    }

    public static int getCountryId(int cityID) {
        for (City c : PERSON_VIEW.GetCitys()) {
            if (c.getiDCity() == cityID) {
                return c.getCountryID();
            }
        }
        return 0;
    }

    public static void resetForm(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField text = (JTextField) c;
                text.setText("");
            }
            if (c instanceof JComboBox) {
                JComboBox combo = (JComboBox) c;
                combo.removeAllItems();
                combo.setEnabled(true);
            }
            if (c instanceof DatePicker) {
                DatePicker picker = (DatePicker) c;
                picker.setText("");
            }
            if (c instanceof JRadioButton) {
                JRadioButton radio = (JRadioButton) c;
                radio.setSelected(false);
            }
            if (c instanceof JScrollPane) {
                JScrollPane pane = (JScrollPane) c;
                JViewport viewport = pane.getViewport();
                Component[] components = viewport.getComponents();
                for (Component cp : components) {
                    if (cp instanceof JTextArea) {
                        JTextArea textarea = (JTextArea) cp;
                        textarea.setText("");
                    }
                    if (cp instanceof JTable) {
                        JTable table = (JTable) cp;
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.setRowCount(0);
                    }
                }
            }

        }
    }

    public static void clrscr() {
        //Clears Screen in java

        for (int i = 0; i < PAGE_SIZE; i++) {
            System.out.println();
        }

    }

}
