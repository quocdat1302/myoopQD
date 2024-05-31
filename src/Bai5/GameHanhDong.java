package Bai5;

import edu.pxu.lthdt.bai05.KyBinh;

public class GameHanhDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyBinh kb = new KyBinh("RELL", "5465456415",(byte)3, 10, true, false, false, false);
//		super(ten,id,gioiTinh,nangluong);
		kb.hanhdong();
		kb.sucManh();
	}

}
