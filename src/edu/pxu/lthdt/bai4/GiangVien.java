package edu.pxu.lthdt.bai4;



public class GiangVien extends Nguoi {
	private String masoGV;
	private String trinhdo;
	private String chuyennganh;
	
	
	public GiangVien(String hoten, int namsinh, String masoGV, String trinhdo, String chuyennganh) {
		super(hoten, namsinh);
		this.masoGV = masoGV;
		this.trinhdo = trinhdo;
		this.chuyennganh = chuyennganh;
	}

	

	public String getMasoGV() {
		return masoGV;
	}



	public void setMasoGV(String masoGV) {
		this.masoGV = masoGV;
	}



	public String getTrinhdo() {
		return trinhdo;
	}



	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}



	public String getChuyennganh() {
		return chuyennganh;
	}



	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}



	public GiangVien(String hoten, int namsinh) {
		super(hoten, namsinh);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "GiangVien [masoGV=" + masoGV + ", trinhdo=" + trinhdo + ", chuyennganh=" + chuyennganh + ", toString()="
				+ super.toString() + "]";
	}

}
