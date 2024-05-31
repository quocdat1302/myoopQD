package edu.pxu.lthdt.bai05;

public class KyBinh extends NhanVat {
	
	private boolean guom;
	private boolean giao;
	private boolean cung;
	private boolean ngua;
	
	

	
	
	public KyBinh(String ten, String id, byte gioiTinh, double nangluong, boolean guom, boolean giao, boolean cung,
			boolean ngua) {
		super(ten, id, gioiTinh, nangluong);
		this.guom = guom;
		this.giao = giao;
		this.cung = cung;
		this.ngua = ngua;
	}
	public boolean isGuom() {
		return guom;
	}
	public void setGuom(boolean guom) {
		this.guom = guom;
	}
	public boolean isGiao() {
		return giao;
	}
	public void setGiao(boolean giao) {
		this.giao = giao;
	}
	public boolean isCung() {
		return cung;
	}
	public void setCung(boolean cung) {
		this.cung = cung;
	}
	public boolean isNgua() {
		return ngua;
	}
	public void setNgua(boolean ngua) {
		this.ngua = ngua;
	}
	@Override
	public String toString() {
		return "KyBinh [guom=" + guom + ", giao=" + giao + ", cung=" + cung + ", ngua=" + ngua + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		super.hanhdong();
		System.out.println("Cởi ngựa và bắn tên");
	}
	@Override
	public void sucManh() {
	
		double energy = this.getNangluong()*2;
		System.out.println("Kỵ Binh có sức mạnh phi thường"   + energy);
		
	}
	
	
}
