package edu.pxu.lthdt.bai12;

public class NhanVat implements DiChuyen {
    private String ten;
    private int id;
    private String gioiTinh;
    private double nangLuong;
    private VuKhi vuKhi;

    

	public NhanVat(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhi) {
		super();
		this.ten = ten;
		this.id = id;
		this.gioiTinh = gioiTinh;
		this.nangLuong = nangLuong;
		this.vuKhi = vuKhi;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public double getNangLuong() {
		return nangLuong;
	}


	public void setNangLuong(double nangLuong) {
		this.nangLuong = nangLuong;
	}


	public VuKhi getVuKhi() {
		return vuKhi;
	}


	public void setVuKhi(VuKhi vuKhi) {
		this.vuKhi = vuKhi;
	}
	


	@Override
	public String toString() {
		return "NhanVat [ten=" + ten + ", id=" + id + ", gioiTinh=" + gioiTinh + ", nangLuong=" + nangLuong + ", vuKhi="
				+ vuKhi + "]";
	}


	public void tanCong() {
        // Implementation of attack logic
    }

    public void diChuyen() {
        // Implementation of move logic
    }

    public void satThuong() {
        // Implementation of damage logic
    }

    @Override
    public void trai() {
        // Move left
    }

    @Override
    public void phai() {
        // Move right
    }

    @Override
    public void len() {
        // Move up
    }

    @Override
    public void xuong() {
        // Move down
    }

    // Getters and setters
}
