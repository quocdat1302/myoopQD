package edu.pxu.lthdt.bai12;



	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class Main {
	    public static void main(String[] args) {
	        // Create weapons
	        VuKhi cungTen = new CungTen("Cung tên", "Cung", "Đen", 8.0);
	        VuKhi choi = new Choi("Chọi", "Cận chiến", "Xanh", 6.5);

	        // Create characters
	        KyBinh kyBinh1 = new KyBinh("Faker", 1, "Nam", 100.0, cungTen, "Kiếm", "Giáo", "Cung", "Ngựa", 6);
	        KyBinh kyBinh2 = new KyBinh("Gumayushi", 2, "Nam", 90.0, choi, "Kiếm", "Giáo", "Cung", "Ngựa", 3);

	        PhuThuy phuThuy = new PhuThuy("Haruto", 3, "Nữ", 150.0, choi, "Chổi", "Gậy phép", "Hắc ám", "Lửa");

	        // Create a list of KyBinh
	        List<KyBinh> dskb = new ArrayList<>();
	        dskb.add(kyBinh1);
	        dskb.add(kyBinh2);

	        // Create BinhDoan
	        BinhDoan binhDoan = new BinhDoan("Liên đoàn Kỵ binh", 200, "Liên đoàn Kỵ binh", Arrays.asList("Kiếm", "Giáo"), null, dskb);

	        // Create DoiQuan
	        DoiQuan doiQuan = new DoiQuan("Quân đoàn", 1000, "Cung Thủ", Arrays.asList(binhDoan));

	        // Test methods
	        System.out.println(binhDoan);
	        binhDoan.tanCong(doiQuan);
	        binhDoan.diChuyen(10, 20);
	        System.out.println("Sát thương của Liên đoàn: " + binhDoan.satThuong());

	        System.out.println(kyBinh1);
	        kyBinh1.tanCong();
	        kyBinh1.diChuyen();
	        kyBinh1.satThuong();

	        System.out.println(phuThuy);
	        phuThuy.tanCong();
	        phuThuy.diChuyen();
	        phuThuy.satThuong();
	    }
	}


