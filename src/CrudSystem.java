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

public class CrudSystem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// JLabel
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblNewLabel_1 = new JLabel("STUDENT INFORMATION");
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
	
	// JTable
	private final JTable table = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudSystem frame = new CrudSystem();
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
	public CrudSystem() {
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
		lblNewLabel.setIcon(new ImageIcon(CrudSystem.class.getResource("/images/userIconSmall.png")));
		lblNewLabel.setBounds(10, 11, 52, 46);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(65, 26, 254, 28);
		lblID.setForeground(new Color(0, 0, 205));
		lblID.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblID.setBounds(16, 69, 120, 21);
		lblLastName.setForeground(new Color(0, 0, 205));
		lblLastName.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblLastName.setBounds(16, 101, 120, 21);
		lblFirstName.setForeground(new Color(0, 0, 205));
		lblFirstName.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblFirstName.setBounds(16, 133, 120, 21);
		lblMiddleName.setForeground(new Color(0, 0, 205));
		lblMiddleName.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblMiddleName.setBounds(16, 165, 120, 21);
		lblSex.setForeground(new Color(0, 0, 205));
		lblSex.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblSex.setBounds(16, 197, 69, 21);
		lblCollege.setForeground(new Color(0, 0, 205));
		lblCollege.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblCollege.setBounds(16, 244, 120, 21);
		lblProgram.setForeground(new Color(0, 0, 205));
		lblProgram.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblProgram.setBounds(16, 289, 120, 21);
		lblTotalRecords.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblTotalRecords.setBounds(808, 327, 120, 14);
		lblStick.setFont(new Font("Segoe UI Semibold", Font.BOLD, 40));
		lblStick.setBounds(943, 314, 11, 54);
		lblLastUpdated.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblLastUpdated.setBounds(975, 327, 120, 14);
		lblRecordsValue.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblRecordsValue.setBounds(855, 345, 48, 23);
		lblLastUpdatedValue.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblLastUpdatedValue.setBounds(1018, 345, 48, 23);
		lblStudentRecords.setForeground(new Color(0, 0, 0));
		lblStudentRecords.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblStudentRecords.setBounds(345, 20, 254, 28);
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
		cboCollege.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		cboCollege.setBounds(161, 240, 148, 28);
		
		cboProgram.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		cboProgram.setBounds(161, 285, 148, 28);
		
		// ================
		// JButton
		// ================
		btnAdd.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnAdd.setBackground(new Color(0, 0, 205));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBounds(16, 335, 101, 28);
		
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
		table.setBounds(345, 75, 761, 235);
		
		// ================
		// ContentPane
		// ================
		// - JSeperator
		contentPane.add(separator);
		
		// - Labels
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
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
		
		// - JTable
		contentPane.add(table);
		
	} // Methods below here
}
