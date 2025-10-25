package QuanLyChuyenXe.themCX;

import QuanLyChuyenXe.ChuyenXe;
import QuanLyChuyenXe.MemoryCXDatabase;

public class ThemCXDAO {
	
	public void insert (ChuyenXe cx) {
		
		MemoryCXDatabase.put(cx);
		
	}

}
