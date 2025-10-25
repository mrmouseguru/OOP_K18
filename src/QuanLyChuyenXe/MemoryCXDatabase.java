package QuanLyChuyenXe;

import java.util.ArrayList;
import java.util.HashMap;

public class MemoryCXDatabase {
	private static HashMap<Integer, ChuyenXe> db = new HashMap<Integer, ChuyenXe>();
	
	static {
		db.put(1, new CXNoiThanh(1, "Lê văn tèo", "tèo 111", 100, 1, 1));
		db.put(2, new CXNoiThanh(2, "Lê văn tý", "tý 222", 200, 2, 2));
	}
	
	
	public static void put(ChuyenXe cx) {
		
		db.put(cx.getMaCX(), cx);
		
	}
	
	public static ArrayList<ChuyenXe> getAll(){
		if(db.size() > 0) {
			return new ArrayList<ChuyenXe>(db.values());
		}else return null;
		
		
	}
	
	public static void main(String[] args) {
		MemoryCXDatabase.getAll();
	}

}
