package edu.pxu.lthdt.bai4;

import java.time.LocalDate;

public class Meo extends DongVat {

    private int soluong;
    private String mausac;
    private String giong;

   

    public Meo(String ten, LocalDate ngaySinh, String gioiTinh) {
		super(ten, ngaySinh, gioiTinh);
		// TODO Auto-generated constructor stub
	}
    

	public Meo(String ten, LocalDate ngaySinh, String gioiTinh, int soluong, String mausac, String giong) {
		super(ten, ngaySinh, gioiTinh);
		this.soluong = soluong;
		this.mausac = mausac;
		this.giong = giong;
	}


	public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

	@Override
	public String toString() {
		return "Meo [soluong=" + soluong + ", mausac=" + mausac + ", giong=" + giong + ", toString()="
				+ super.toString() + "]";
	}

   
  
    }
