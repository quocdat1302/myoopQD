package edu.pxu.lthdt.bai6.vd1;

import edu.pxu.lthdt.bai05.DiChuyen;
import edu.pxu.lthdt.bai05.NhanVat;
import edu.pxu.lthdt.bai05.TanCongVuKhi;

public class KiemKhach extends NhanVat implements DiChuyen, TanCongVuKhi {



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

	

		 public void sangPhai() {
		        System.out.println("Kiếm khách di chuyển nhanh nhẹn sang phải, tay cầm chặt " + loaiKiem + " để đề phòng");
		    }

		    @Override
		    public void sangTrai() {
		        System.out.println("Kiếm khách thận trọng di chuyển sang trái, " + loaiKiem + " được đặt ngang hông sẵn sàng chiến đấu");
		    }

		    @Override
		    public void bayLen() {
		        System.out.println("Kiếm khách với đôi chân rắn chắc, phi lên, " + loaiKiem + " được  nhuất vỏ sau lưng");
		    }

		    @Override
		    public void boChay() {
		        System.out.println("Kiếm khách tăng tốc chạy, " + loaiKiem + " được  cầm ngang phía trước để rẽ gió");
		    }
		


		    @Override
		    public void tanCongVoiVuKhi() {
		        System.out.println("Kiếm khách vung " + loaiKiem + " tấn công với tốc độ phi thường, chém xé kẻ thù.");
		    }

		    @Override
		    public void tanCongCoVuKhi() {
		        System.out.println("Kiếm khách sử dụng " + loaiKiem + " kết hợp với các kỹ thuật điêu luyện, tung ra những đòn tấn công hiểm hóc.");
		    }
		}
