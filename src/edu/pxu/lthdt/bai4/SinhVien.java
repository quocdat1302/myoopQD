package edu.pxu.lthdt.bai4;



public class SinhVien extends Nguoi {
		private String masoSV;
		private  String nganhhoc;
		
		
		public SinhVien(String hoten, int namsinh, String masoSV, String nganhhoc) {
			super(hoten, namsinh);
			this.masoSV = masoSV;
			this.nganhhoc = nganhhoc;
		}
		
		

		
		public String getMasoSV() {
			return masoSV;
		}

		public void setMasoSV(String masoSV) {
			this.masoSV = masoSV;
		}



		public String getNganhhoc() {
			return nganhhoc;
		}


		public void setNganhhoc(String nganhhoc) {
			this.nganhhoc = nganhhoc;
		}



		public SinhVien(String hoten, int namsinh) {
			super(hoten, namsinh);
			// TODO Auto-generated constructor stub
		}




		@Override
		public String toString() {
			return "SinhVien [masoSV=" + masoSV + ", nganhhoc=" + nganhhoc + ", toString()=" + super.toString() + "]";
		}
		

	}


