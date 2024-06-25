package edu.pxu.lthdt.bai12;

public class Choi extends VuKhi {
		private String ten;
		private String mauMa;
		private double sucManh;
		
		public Choi(String ten, String loaiVuKhi, String mauMa, double sucManh) {
	        super(ten, loaiVuKhi, mauMa, sucManh);
	    }
		
	
	    public String getTen() {
			return ten;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public String getMauMa() {
			return mauMa;
		}

		public void setMauMa(String mauMa) {
			this.mauMa = mauMa;
		}

		public double getSucManh() {
			return sucManh;
		}

		public void setSucManh(double sucManh) {
			this.sucManh = sucManh;
		}

		

	    @Override
		public String toString() {
			return "Choi [ten=" + ten + ", mauMa=" + mauMa + ", sucManh=" + sucManh + "]";
		}


		@Override
	    public void tanCong() {
	        if (laVuKhiManh()) {
	            System.out.println("Chọi  tấn công mạnh!");
	        } else {
	            System.out.println("Chọi sử dụng tấn công bình thường.");
	        }
	    }

	    @Override
	    public void diChuyen() {
	        System.out.println("Chọi di chuyển.");
	    }

	    @Override
	    public void satThuong() {
	        System.out.println("Chọi gây sát thương.");
	    }
	}



