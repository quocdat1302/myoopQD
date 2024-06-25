package edu.pxu.lthdt.bai12;

public class KyBinh extends NhanVat {
	private String kiem; 
    private String giao;  // Spear
    private String cung;  // Bow
    private String ngua;  // Mount
    private int soNamDaoTao; // Years of training

    public KyBinh(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhiChinh , String kiem, String giao, String cung, String ngua, int soNamDaoTao) {
        super(ten, id, gioiTinh, nangLuong, vuKhiChinh);
        this.kiem = kiem;
        this.giao = giao;
        this.cung = cung;
        this.ngua = ngua;
        this.soNamDaoTao = soNamDaoTao;
    }

    @Override
    public void tanCong() {
        String attackDescription;

        if (soNamDaoTao > 5) { 
            if (ngua != null) { 
                attackDescription = "Kỵ Binh cưỡi " + ngua + ", sử dụng " + getVuKhi().getTen() + " tấn công mãnh liệt!";
            } else { // skilled attack
                attackDescription = "Kỵ Binh chiến đấu điêu luyện, sử dụng " + getVuKhi().getTen() + " tấn công!";
            }
        } else {
            attackDescription = "Kỵ Binh sử dụng " + getVuKhi().getTen() + " tấn công!";
        }

        System.out.println(attackDescription);
    }

    @Override
    public void diChuyen() {
        if (ngua != null) {
            System.out.println("Kỵ Binh di chuyển nhanh nhẹn trên lưng " + ngua + ".");
        } else {
            System.out.println("Kỵ Binh di chuyển trên bộ.");
        }
    }

    @Override
    public void satThuong() {
        System.out.println("Kỵ Binh gây sát thương bằng " + getVuKhi().getTen() + "!");
    }

    // Getter and setter methods (unchanged)

    public String getKiem() {
        return kiem;
    }

    public void setKiem(String kiem) {
        this.kiem = kiem;
    }

    // ... other getter and setter methods
}


