package edu.pxu.lthdt.bai05;

public class KiemKhach extends NhanVat {
	
    public int soKiem;
    protected int capDoSuDung;
    private String loaiKiem; // Thêm thuộc tính mới "loaiKiem"


	public KiemKhach(String ten, String id, byte gioiTinh, double nangluong, int soKiem, int capDoSuDung,
			String loaiKiem) {
		super(ten, id, gioiTinh, nangluong);
		this.soKiem = soKiem;
		this.capDoSuDung = capDoSuDung;
		this.loaiKiem = loaiKiem;
	}

	public int getSoKiem() {
		return soKiem;
	}

	public void setSoKiem(int soKiem) {
		this.soKiem = soKiem;
	}

	public int getCapDoSuDung() {
		return capDoSuDung;
	}

	public void setCapDoSuDung(int capDoSuDung) {
		this.capDoSuDung = capDoSuDung;
	}

	public String getLoaiKiem() {
		return loaiKiem;
	}

	public void setLoaiKiem(String loaiKiem) {
		this.loaiKiem = loaiKiem;
	}
	
	
	//toString 
	@Override
	public String toString() {
		return "KiemKhach [soKiem=" + soKiem + ", capDoSuDung=" + capDoSuDung + ", loaiKiem=" + loaiKiem
				+ ", toString()=" + super.toString() + "]";
	}

	  public void hanhdong() {
	        super.hanhdong(); 
	        System.out.println("Kiếm khách đang sử dụng kiếm " + loaiKiem);
	    }

	    public void sucManh() {
	        super.sucManh();
	        double energy = this.getNangluong();
	        System.out.println("Kiếm khách có sức mạnh phi thường" + energy);
	    }

	    
	    
		@Override
		public void tanCong() {
			// TODO Auto-generated method stub
			super.tanCong();
			 System.out.println("Vung kém chém ");
		}

	
}