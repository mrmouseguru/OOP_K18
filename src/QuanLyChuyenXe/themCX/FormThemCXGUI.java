package QuanLyChuyenXe.themCX;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FormThemCXGUI extends JFrame{
	private JLabel lblMaCX, lblHoTenTX, lblSoxe,
	lblGia, lblSokm, lblNgayDi, lblNoiDen, lblSoTuyen,
	lblLoaiCX, lblEmpty; 
	private JTextField txtMaCX, txtHoTenTX, txtSoxe,
	txtGia, txtSokm, txtNgayDi, txtNoiDen, txtSoTuyen;
	private JComboBox<String> cboLoaiCX;
	private JButton btnLuu;
	
	public FormThemCXGUI() {
		setTitle("Thêm mới chuyến xe");
		setSize(400, 400);
		setLocationRelativeTo(null);
		GridLayout gridLayout = new 
				GridLayout(10, 2, 5, 5);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(gridLayout);
		initComponents();
		//bó sát
		pack();

		setVisible(true);
		
		
	}
	
	private void initComponents() {
		lblMaCX = new JLabel("Mã CX");
		txtMaCX = new JTextField(20);
		add(lblMaCX);
		add(txtMaCX);
		lblHoTenTX = new JLabel("Họ tên TX");
		txtHoTenTX = new JTextField(20);
		add(lblHoTenTX);
		add(txtHoTenTX);
		lblSoxe = new JLabel("Số xe");
		txtSoxe = new JTextField(20);
		add(lblSoxe);
		add(txtSoxe);
		lblGia = new JLabel("Giá");
		txtGia = new JTextField(20);
		add(lblGia);
		add(txtGia);
		
		lblLoaiCX = new JLabel("Loại CX");
		cboLoaiCX = new JComboBox<String>(
				new String[] {"Nội thành", "Ngoại thành"}
				);
		add(lblLoaiCX);
		add(cboLoaiCX);
				
		
		//nội thành
		lblSokm = new JLabel("Số km đi được (nội thành)");
		txtSokm = new JTextField(20);
		add(lblSokm);
		add(txtSokm);
		
		lblSoTuyen = new JLabel("Số tuyến (nội thành)");
		txtSoTuyen = new JTextField(20);
		add(lblSoTuyen);
		add(txtSoTuyen);
		
		//ngoại thành
		lblNgayDi = new JLabel("Ngày đi được (ngoại thành)");
		txtNgayDi = new JTextField(20);
		add(lblNgayDi);
		add(txtNgayDi);
		
		lblNoiDen = new JLabel("Nơi đến (ngoại thành)");
		txtNoiDen = new JTextField(20);
		add(lblNoiDen);
		add(txtNoiDen);
		
		//nút
		lblEmpty = new JLabel("");
		btnLuu = new JButton("Lưu");
		
		ActionListener luuCXListener = null;
		
		luuCXListener = new LuuCXListener();
		
		btnLuu.addActionListener(luuCXListener);
		add(lblEmpty);
		add(btnLuu);
		
		
	}
	
	private class LuuCXListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//gửi thông điệp đến đối tượng Control
			//bài tập vè nhà
			//sihh viên code tiếp vào đây
		}
		
	}
	
	public static void main(String[] args) {
		new FormThemCXGUI();
	}

}
