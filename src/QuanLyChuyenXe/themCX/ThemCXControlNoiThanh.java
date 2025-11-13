package QuanLyChuyenXe.themCX;

import QuanLyChuyenXe.CXNoiThanh;

public class ThemCXControlNoiThanh extends ThemCXControl {

	public ThemCXControlNoiThanh(ThemCXResultDialogGUI resultDialogGUI, ThemCXDAO themCXDAO) {
		super(resultDialogGUI, themCXDAO);
	}

	@Override
	protected void execute(ReqData rqData) {
		try {
			CXNoiThanh.checkGia(rqData.gia);
		} catch (IllegalArgumentException exIll) {
			resData.listMessage.add(exIll.getMessage());
		}

		try {
			CXNoiThanh.checkSoKm(rqData.soKm);
		} catch (IllegalArgumentException ex) {
			resData.listMessage.add(ex.getMessage());
		}

		cx = new CXNoiThanh(rqData.maCX, rqData.hoTenTX, rqData.soXe, rqData.gia, rqData.soTuyen, rqData.soKm);
	}

}
