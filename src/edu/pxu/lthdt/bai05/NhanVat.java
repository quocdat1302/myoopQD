package edu.pxu.lthdt.bai05;

public class NhanVat {
	
	private String ten;
	private String id;
	private byte gioiTinh;
	private double nangluong;
	
	public void hanhdong () {
		System.out.println( " Nhân Vật Đang Hành Động");
	}
	public void sucManh() {
        System.out.println("Nhân vật có sức mạnh");
	}
	public void tanCong() {
		System.out.println("Nhân vật đang tấn công");
	}
	
	
	public NhanVat(String ten, String id, byte gioiTinh, double nangluong) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioiTinh = gioiTinh;
		this.nangluong = nangluong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public byte getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(byte gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getNangluong() {
		return nangluong;
	}
	public void setNangluong(double nangluong) {
		this.nangluong = nangluong;
	}
	
}


	































	

