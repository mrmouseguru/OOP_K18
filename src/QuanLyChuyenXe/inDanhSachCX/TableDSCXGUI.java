package QuanLyChuyenXe.inDanhSachCX;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableDSCXGUI extends JFrame {
	private JTable table = null;
	private String[] columns = { "Mã", "Loại", "Tài xế", "Số xe",
			"Giá", "Thành tiền" };

	public TableDSCXGUI() {
		setTitle("Danh sách các chuyến xe");
		setLayout(new BorderLayout());
		setSize(800, 400);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		// initTable();
		// pack();
		// setVisible sau khi đã add xong các component
		setLocationRelativeTo(null);
		setVisible(true);

	}

	

	public void show(ResData resData) {
		
		if(resData.resList != null) {
			Object[][] data = toTableData(resData.resList);
			
			DefaultTableModel model = new DefaultTableModel(data, columns);
			table = new JTable(model);

			// Thay vì add(table, ...), phải add JScrollPane chứa table để header hiện ra:
			JScrollPane scroll = new JScrollPane(table);
			add(scroll, BorderLayout.CENTER);
		}else {
			JOptionPane.showMessageDialog(this, resData.message);
		}
		
	}

	private Object[][] toTableData(ArrayList<ResItem> ds) {
		Object[][] data = new Object[ds.size()][columns.length];
		for (int i = 0; i < ds.size(); i++) {
			ResItem item = ds.get(i);
			data[i][0] = item.maCX;
			data[i][1] = item.loaiXe;
			data[i][2] = item.hoTenTX;
			data[i][3] = item.soXe;
			data[i][4] = item.gia;
			data[i][5] = item.tien;
		}
		return data;
	}

	public static void main(String[] args) {
		new TableDSCXGUI();
	}
}
