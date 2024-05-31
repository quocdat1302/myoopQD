package edu.pxu.lthdt.bai05;

public class BoBinh extends NhanVat {

    private int	giao;
    private boolean khien;
    private boolean aogiap;
    
 
	
	
	public BoBinh(String ten, String id, byte gioiTinh, double nangluong, int giao, boolean khien, boolean aogiap) {
		super(ten, id, gioiTinh, nangluong);
		this.giao = giao;
		this.khien = khien;
		this.aogiap = aogiap;
	}


	public int getGiao() {
		return giao;
	}
	public void setGiao(int giao) {
		this.giao = giao;
	}
	public boolean isKhien() {
		return khien;
	}
	public void setKhien(boolean khien) {
		this.khien = khien;
	}
	public boolean isAogiap() {
		return aogiap;
	}
	public void setAogiap(boolean aogiap) {
		this.aogiap = aogiap;
	}


	@Override
	public String toString() {
		return "BoBinh [giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void hanhdong() {
		super.hanhdong();
		System.out.println("Bộ binh đang sử dụng giáo");
		
	}
	
	public void sucManh() {
		super.sucManh();
		double energy = this.getNangluong();
		System.out.println("Bộ binh có sức mạnh phi thường" + energy);
	}
	
	
   
    
    

}