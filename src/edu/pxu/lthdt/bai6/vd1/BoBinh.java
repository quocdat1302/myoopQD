package edu.pxu.lthdt.bai6.vd1;

import edu.pxu.lthdt.bai05.DiChuyen;
import edu.pxu.lthdt.bai05.NhanVat;
import edu.pxu.lthdt.bai05.TanCongVuKhi;

public class BoBinh extends NhanVat implements TanCongVuKhi, DiChuyen {

    private boolean giao;
    private boolean khien;
    private boolean aogiap;

    public BoBinh(String ten, String id, byte gioiTinh, double nangluong, boolean giao, boolean khien, boolean aogiap) {
        super(ten, id, gioiTinh, nangluong);
        this.giao = giao;
        this.khien = khien;
        this.aogiap = aogiap;
    }

    public boolean isGiao() {
        return giao;
    }

    public void setGiao(boolean giao) {
        this.giao = giao;
    }

    public boolean isKhien() {
        return khien;
    }

    public void setKhien(boolean khien) {
        this.khien = khien;
    }

    public boolean isAogiap() {
        return aogiap;
    }

    public void setAogiap(boolean aogiap) {
        this.aogiap = aogiap;
    }

    @Override
    public String toString() {
        return "BoBinh [giao=" + giao + ", khien=" + khien + ", aogiap=" + aogiap + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void hanhdong() {
        System.out.println("Bộ Binh sử dụng giáo để đâm kẻ thù từ xa.");
    }

    @Override
    public void sucManh() {
        double enhancedEnergy = this.getNangluong() * 1.5;
        System.out.println("Bộ Binh's training with the spear and shield enhances his combat effectiveness, granting him an energy level of " + enhancedEnergy);
    }

    @Override
    public void tanCongVoiVuKhi() {
        if (isGiao()) {
            System.out.println("Bộ Binh vung giáo mạnh mẽ, đâm xuyên qua kẻ thù.");
        } else {
            System.out.println("Bộ Binh không có giáo, chuyển sang tấn công bằng tay không.");
        }
    }

    @Override
    public void tanCongCoVuKhi() {
        System.out.println("Bộ Binh kết hợp giáo và khiên, tung ra đòn tấn công mạnh mẽ và phòng thủ vững chắc.");
    }

    @Override
    public void sangPhai() {
        System.out.println("Bộ Binh di chuyển nhanh sang phải, giữ chắc khiên để đề phòng.");
    }

    @Override
    public void sangTrai() {
        System.out.println("Bộ Binh di chuyển sang trái, giữ giáo sẵn sàng tấn công.");
    }

    @Override
    public void bayLen() {
        System.out.println("Bộ Binh không thể bay, nhưng có thể nhảy cao để né tránh.");
    }

    @Override
    public void boChay() {
        System.out.println("Bộ Binh tăng tốc chạy, giảm bớt sức nặng của áo giáp.");
    }
}
