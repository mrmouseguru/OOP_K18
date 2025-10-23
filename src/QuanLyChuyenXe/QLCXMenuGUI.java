package QuanLyChuyenXe;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class QLCXMenuGUI extends JFrame{
	private JMenuBar menuBar;
	public QLCXMenuGUI() {
		//tiêu đề
		setTitle("Quản lý chuyến xe");
		//kích thước cửa sổ
		setSize(800, 700);
		//tắt chương trình
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//hiển thị
		//cửa đặt giữa màn hình
		setLocationRelativeTo(null);
		
		//thiết lập bố cục cho cửa sổ
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		//gọi method
		khoiTaoThanhPhanWindow();
		setVisible(true);
	}
	
	private void khoiTaoThanhPhanWindow() {
		menuBar = new JMenuBar();
		//Menu chức năng
		JMenu chucNang = new JMenu("Chức năng");
		//Menu tùy chọn
		JMenu tuyChon = new JMenu("Tùy chọn");
		JMenu hoTro = new JMenu("Hỗ trợ");

		//them chức năng vào menu bar
		menuBar.add(chucNang);
		menuBar.add(tuyChon);
		menuBar.add(hoTro);
		//thêm menu bar vào cửa sổ
		setJMenuBar(menuBar);
	}

}
