package QuanLyChuyenXe;

public class ChuyenXe {
	protected int maCX;
	protected String hoTenTaiXe;
	protected String soXe;
	protected double gia;
	
	protected ChuyenXe() {
		
	}

	
protected ChuyenXe(int _maCX,
				 String _hoTenTaiXe,
				 String _soXe,
				 double _gia) {
	super();
		maCX = _maCX;
		hoTenTaiXe = _hoTenTaiXe;
		soXe = _soXe;
		gia = _gia;
	}

	protected double tinhTien() {
		return 0.0;
	}
	
	protected int getMaCX() {
		return maCX;
	}
	
	protected void setMaCX(int maCX) {
		this.maCX = maCX;
	}
	
	
	

}
