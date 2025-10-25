package QuanLyChuyenXe.themCX;

import javax.swing.JOptionPane;

public class ThemCXResultDialogGUI{

	public void show(ResData resData) {
		
		JOptionPane.showMessageDialog(null, resData.sucsessMessage);
		
	}

}
