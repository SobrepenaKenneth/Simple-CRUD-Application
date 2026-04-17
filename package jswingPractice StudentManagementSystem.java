package jswingPractice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentManagementSystem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// JLabel
	private final JLabel lblUserProfile = new JLabel("");
	private final JLabel lblStudentInformation = new JLabel("STUDENT INFORMATION");
	private final JLabel lblID = new JLabel("ID");
	private final JLabel lblLastName = new JLabel("LAST NAME");
	private final JLabel lblFirstName = new JLabel("FIRST NAME");
	private final JLabel lblMiddleName = new JLabel("MIDDLE NAME");
	private final JLabel lblSex = new JLabel("SEX");
	private final JLabel lblCollege = new JLabel("COLLEGE");
	private final JLabel lblProgram = new JLabel("PROGRAM");
	private final JLabel lblTotalRecords = new JLabel("TOTAL RECORDS");
	private final JLabel lblStick = new JLabel("|");
	private final JLabel lblLastUpdated = new JLabel("LAST UPDATED");
	private final JLabel lblRecordsValue = new JLabel("0");
	private final JLabel lblLastUpdatedValue = new JLabel("-");
	private final JLabel lblStudentRecords = new JLabel("STUDENT RECORDS");
	private final JLabel lblDescription = new JLabel("Manage student information easily");
	
	// JTextField
	private final JTextField txtMiddleName = new JTextField();
	private final JTextField txtFirstName = new JTextField();
	private final JTextField txtLastName = new JTextField();
	private final JTextField txtID = new JTextField();
	
	// JRadioButton
	private final JRadioButton rdbtnMale = new JRadioButton("MALE");
	private final JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
	
	// JComboBox
	private final JComboBox cboCollege = new JComboBox();
	private final JComboBox cboProgram = new JComboBox();
	
	// JButton
	private final JButton btnAdd = new JButton("NEW");
	private final JButton btnSave = new JButton("SAVE");
	private final JButton btnUpdate = new JButton("UPDATE");
	private final JButton btnDelete = new JButton("DELETE");
	private final JButton btnCancel = new JButton("CANCEL");
	
	// JSeperator
	private final JSeparator separator = new JSeparator();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable tblStudentInfo = new JTable();
	
	private DefaultTableModel model;
	private int idCounter = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagementSystem frame = new StudentManagementSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentManagementSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Note iba code generation preference ko -ken
		
		// ================
		// JLabel
		// ================
		// - Image Icon
//		lblUserProfile.setIcon(new ImageIcon(StudentManagementSystem.class.getResource("/images/userIconSmall.png")));
//		lblUserProfile.setBounds(10, 11, 52, 46);
		
		// - Header label
		lblStudentInformation.setForeground(new Color(0, 0, 255));
		lblStudentInformation.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblStudentInformation.setBounds(65, 26, 254, 28);
		// - id
		lblID.setForeground(new Color(0, 0, 205));
		lblID.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblID.setBounds(16, 69, 120, 21);
		// - last name
		lblLastName.setForeground(new Color(0, 0, 205));
		lblLastName.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblLastName.setBounds(16, 101, 120, 21);
		// - first name
		lblFirstName.setForeground(new Color(0, 0, 205));
		lblFirstName.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblFirstName.setBounds(16, 133, 120, 21);
		// - middle name
		lblMiddleName.setForeground(new Color(0, 0, 205));
		lblMiddleName.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblMiddleName.setBounds(16, 165, 120, 21);
		// - sex
		lblSex.setForeground(new Color(0, 0, 205));
		lblSex.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblSex.setBounds(16, 197, 69, 21);
		// - college
		lblCollege.setForeground(new Color(0, 0, 205));
		lblCollege.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblCollege.setBounds(16, 244, 120, 21);
		// - program
		lblProgram.setForeground(new Color(0, 0, 205));
		lblProgram.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblProgram.setBounds(16, 289, 120, 21);
		// - total records
		lblTotalRecords.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblTotalRecords.setBounds(808, 327, 120, 14);
		// - |
		lblStick.setFont(new Font("Segoe UI Semibold", Font.BOLD, 40));
		lblStick.setBounds(943, 314, 11, 54);
		// - total updated
		lblLastUpdated.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblLastUpdated.setBounds(975, 327, 120, 14);
		// - record value
		lblRecordsValue.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblRecordsValue.setBounds(855, 345, 48, 23);
		// - last updated value
		lblLastUpdatedValue.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblLastUpdatedValue.setBounds(1018, 345, 48, 23);
		// - Student records (Header)
		lblStudentRecords.setForeground(new Color(0, 0, 0));
		lblStudentRecords.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblStudentRecords.setBounds(345, 20, 254, 28);
		// - Description
		lblDescription.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblDescription.setBounds(345, 46, 242, 21);
	
		// ================
		// JTextField
		// ================
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(161, 166, 148, 24);
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(161, 133, 148, 24);
		txtLastName.setColumns(10);
		txtLastName.setBounds(161, 101, 148, 24);
		txtID.setColumns(10);
		txtID.setBounds(161, 70, 148, 24);
		
		// ================
		// JRadioButton
		// ================
		rdbtnMale.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		rdbtnMale.setBounds(95, 199, 109, 23);
		rdbtnFemale.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		rdbtnFemale.setBounds(200, 199, 109, 23);
		
		// ================
		// JComboBox
		// ================
		cboCollege.setModel(new DefaultComboBoxModel(new String[] {"COED", "CAS", "CBAA", "COE", "CCS", "CON"}));
		cboCollege.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		cboCollege.setBounds(161, 240, 148, 28);
		
		cboProgram.setModel(new DefaultComboBoxModel(new String[] {"BSEED", "BSSED", "BSPSY", "BSA", "BSBA", "BSIE", "BSCpE", "BSECE", "BSIT", "BSCS", "BSN"}));
		cboProgram.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		cboProgram.setBounds(161, 285, 148, 28);
		
		// ================
		// JButton
		// ================
		btnAdd.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnAdd.setBackground(new Color(0, 0, 205));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBounds(16, 335, 101, 28);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRecord();
				
			}
		});
		
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnSave.setBackground(new Color(34, 139, 34));
		btnSave.setBounds(161, 335, 108, 28);
		
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(205, 133, 63));
		btnUpdate.setBounds(314, 335, 120, 28);
		
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnDelete.setBackground(new Color(165, 42, 42));
		btnDelete.setBounds(467, 335, 120, 28);
		
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnCancel.setBackground(new Color(128, 128, 128));
		btnCancel.setBounds(625, 335, 120, 28);
		
		// ================
		// JSeperator
		// ================
		separator.setBounds(-37, 321, 1186, 6);
		
		// ================
		// JTable
		// ================
		
		model = new DefaultTableModel(
			    new String[]{"ID", "LAST NAME", "FIRST NAME", "MIDDLE NAME", "SEX", "COLLEGE", "PROGRAM"},
			    0
			);
		tblStudentInfo.setModel(model);
		
		tblStudentInfo.getColumnModel().getColumn(0).setPreferredWidth(35);
		tblStudentInfo.getColumnModel().getColumn(1).setPreferredWidth(115);
		tblStudentInfo.getColumnModel().getColumn(2).setPreferredWidth(120);
		tblStudentInfo.getColumnModel().getColumn(3).setPreferredWidth(133);
		tblStudentInfo.getColumnModel().getColumn(4).setPreferredWidth(86);
		tblStudentInfo.getColumnModel().getColumn(5).setPreferredWidth(89);
		tblStudentInfo.getColumnModel().getColumn(6).setPreferredWidth(98);
		
		scrollPane.setViewportView(tblStudentInfo);
		
		// ================
		// ContentPane
		// ================
		// - JSeperator
		contentPane.add(separator);
		
		// - Labels
		contentPane.add(lblUserProfile);
		contentPane.add(lblStudentInformation);
		contentPane.add(lblID);
		contentPane.add(lblLastName);
		contentPane.add(lblFirstName);
		contentPane.add(lblMiddleName);
		contentPane.add(lblSex);
		contentPane.add(lblCollege);
		contentPane.add(lblProgram);
		contentPane.add(lblTotalRecords);
		contentPane.add(lblStick);
		contentPane.add(lblStick);
		contentPane.add(lblLastUpdated);
		contentPane.add(lblRecordsValue);
		contentPane.add(lblLastUpdatedValue);
		contentPane.add(lblStudentRecords);
		contentPane.add(lblDescription);
		
		// - Radio Button
		contentPane.add(txtMiddleName);
		contentPane.add(rdbtnMale);
		contentPane.add(rdbtnFemale);
		
		// - Combo Box
		contentPane.add(cboCollege);
		contentPane.add(cboProgram);
		
		// - JTextField
		contentPane.add(txtID);
		contentPane.add(txtFirstName);
		contentPane.add(txtLastName);
		
		// - JButton
		contentPane.add(btnAdd);
		contentPane.add(btnSave);
		contentPane.add(btnUpdate);
		contentPane.add(btnDelete);
		contentPane.add(btnCancel);
		scrollPane.setBounds(345, 78, 763, 227);
		
		// - JTable
		contentPane.add(scrollPane);
		
	} // Methods below here
	
	public void addRecord() {
		String firstName = txtFirstName.getText();
		String middleName = txtMiddleName.getText();
		String lastName = txtLastName.getText();
		String id = txtID.getText();
		
	    String sex = rdbtnMale.isSelected() ? "Male" : "Female";
		String college = cboCollege.getSelectedItem().toString();
		String program = cboProgram.getSelectedItem().toString();
		
		
		   String college1 = cboCollege.getSelectedItem().toString();
		    String program1 = cboProgram.getSelectedItem().toString();

		   
		    if (id.isEmpty()) {
		        id = String.valueOf(idCounter++);
		    }

		    // ADD TO TABLE
		    model.addRow(new Object[]{
		        id,
		        lastName,
		        firstName,
		        middleName,
		        sex,
		        college1,
		        program1
		    });

	}
}