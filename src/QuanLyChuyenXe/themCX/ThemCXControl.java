package QuanLyChuyenXe.themCX;

import QuanLyChuyenXe.CXNoiThanh;
import QuanLyChuyenXe.ChuyenXe;

public class ThemCXControl {
	ThemCXResultDialogGUI resultDialogGUI  = null;
	private ThemCXDAO themCXDAO = null;

	public ThemCXControl(ThemCXResultDialogGUI resultDialogGUI, ThemCXDAO themCXDAO) {
		this.resultDialogGUI = resultDialogGUI;
		this.themCXDAO = themCXDAO;
	}

	public void execute(ReqData rqData) {

		ChuyenXe cx = null;

		if (rqData.loaiCX.equals("Nội Thành")) {

			cx = new CXNoiThanh(rqData.maCX, rqData.hoTenTX, rqData.soXe, 
					rqData.gia, rqData.soTuyen, rqData.soKm);
		}

		if (rqData.loaiCX.equals("Ngoại Thành")) {

			//cx = new CXNgoaiThanh
			// xử lý ngoại lệ // alternate path

		}
		
		//insert
		if(themCXDAO != null) {
			themCXDAO.insert(cx);
		}
		
		
		ResData resData = new ResData();
		resData.sucsessMessage = "Đã thêm thành công một CX!!";
		if(resultDialogGUI != null) {
			resultDialogGUI.show(resData);
		}

	}

}
