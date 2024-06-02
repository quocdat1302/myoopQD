	package Bai5;
	
	import edu.pxu.lthdt.bai6.vd1.KyBinh;
	import edu.pxu.lthdt.bai6.vd1.KiemKhach;
	import edu.pxu.lthdt.bai6.vd1.PhuThuy;
	import edu.pxu.lthdt.bai6.vd1.BoBinh;
	
	public class GameHanhDong {
	
	    public static void main(String[] args) {
	        KyBinh kb = new KyBinh("RELL", "5465456415", (byte) 3, 10, true, false, false, false);
	        KiemKhach kk = new KiemKhach("Garen", "1234567890", (byte) 1, 15, 1, 5, "Kiếm dài");
	        PhuThuy pt = new PhuThuy("Morgana", "1021546", (byte) 3, 12, true, true);
	        BoBinh bb = new BoBinh("Darius", "1122334455", (byte) 3, 20, true, true, true);
	
	        // Ky Binh
	        System.out.println("\nKy Binh:");
	        kb.hanhdong();
	        kb.sucManh();
	        kb.tanCongVoiVuKhi();
	        kb.sangPhai();
	        kb.sangTrai();
	        kb.bayLen();
	        kb.boChay();
	
	        // Kiem Khach
	        System.out.println("\nKiem Khach:");
	        kk.hanhdong();
	        kk.sucManh();
	        kk.tanCongVoiVuKhi();
	        kk.tanCongCoVuKhi();
	        kk.sangPhai();
	        kk.sangTrai();
	        kk.bayLen();
	        kk.boChay();
	
	        // Phu Thuy
	        System.out.println("\nPhu Thuy:");
	        pt.hanhdong();
	        pt.sucManh();
	        pt.tanCongVoiVuKhi();
	        pt.tanCongCoVuKhi();
	        pt.sangPhai();
	        pt.sangTrai();
	        pt.bayLen();
	        pt.boChay();
	
	        // Bo Binh
	        System.out.println("\nBo Binh:");
	        bb.hanhdong();
	        bb.sucManh();
	        bb.tanCongVoiVuKhi();
	        bb.tanCongCoVuKhi();
	        bb.sangPhai();
	        bb.sangTrai();
	        bb.bayLen();
	        bb.boChay();
	    }
	}
