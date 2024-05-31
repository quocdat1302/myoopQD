package edu.pxu.lthdt.bai05;

public class PhuThuy extends NhanVat {
	
	private boolean choi;
	private boolean gay;
	
	

	public PhuThuy(String ten, String id, byte gioiTinh, double nangluong, boolean choi, boolean gay) {
		super(ten, id, gioiTinh, nangluong);
		this.choi = choi;
		this.gay = gay;
	}

	public boolean isChoi() {
		return choi;
	}

	public void setChoi(boolean choi) {
		this.choi = choi;
	}

	public boolean isGay() {
		return gay;
	}

	public void setGay(boolean gay) {
		this.gay = gay;
	}

	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		super.hanhdong();
		System.out.println("Bay");
	}

	@Override
	public void sucManh() {
		// TODO Auto-generated method stub
		super.sucManh();
		double enegry = this.getNangluong();
		System.out.println("Năng lượng của Phù Thủy là"+enegry);
	}

	@Override
	public void tanCong() {
		// TODO Auto-generated method stub
		super.tanCong();
	}

	
	
	
	
	
	
	

}
