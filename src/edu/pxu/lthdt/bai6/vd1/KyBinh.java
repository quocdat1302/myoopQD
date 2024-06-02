package edu.pxu.lthdt.bai6.vd1;

import edu.pxu.lthdt.bai05.DiChuyen;
import edu.pxu.lthdt.bai05.NhanVat;
import edu.pxu.lthdt.bai05.TanCongVuKhi;

public class KyBinh extends NhanVat implements DiChuyen, TanCongVuKhi {
    private boolean guom;
    private boolean giao;
    private boolean cung;
    private boolean ngua;

    public KyBinh(String ten, String id, byte gioiTinh, double nangluong, boolean guom, boolean giao, boolean cung, boolean ngua) {
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
        System.out.println("Kỵ Binh cởi ngựa, giương cung và bắn một loạt tên về phía kẻ thù.");
    }

    @Override
    public void sucManh() {
        double enhancedEnergy = this.getNangluong() * 2;
        System.out.println("Kỵ Binh's mastery of horse riding and archery doubles his combat effectiveness, granting him an energy level of " + enhancedEnergy);
    }
    @Override
    public void tanCongVoiVuKhi() {
        if (isGuom()) {
            System.out.println("Kỵ Binh rút kiếm ra và lao vào chiến đấu cận chiến, chém toả lửa đom đóm.");
        } else if (isGiao()) {
            System.out.println("Kỵ Binh vung giáo nhọn, đâm xuyên qua kẻ thù với sức mạnh mãnh liệt.");
        } else {
            System.out.println("Kỵ Binh không có vũ khí cận chiến, nên chuyển sang sử dụng các đòn tấn công bằng tay.");
            // Implement unarmed combat actions here
        }
    }

    @Override
    public void tanCongCoVuKhi() {
        System.out.println("Kỵ Binh phi ngựa về phía trước, giẫm đạp lên kẻ thù với lực mạnh kinh hoàng.");
    }

    @Override
    public void sangPhai() {
        System.out.println("Kỵ Binh điều khiển ngựa bứt phá sang phải, né tránh đòn tấn công của kẻ thù.");
    }

    @Override
    public void sangTrai() {
        System.out.println("Kỵ Binh lèo lái ngựa ngoặt sang trái, bất ngờ đối phương với những pha tấn công từ góc hiểm.");
    }

    @Override
    public void bayLen() {
        // Kỵ Binh cannot fly, so this method should not be implemented
        System.out.println("Kỵ Binh không thể bay.");
    }

    @Override
    public void boChay() {
        // Kỵ Binh cannot run, so this method should not be implemented
        System.out.println("Kỵ Binh di chuyển bằng ngựa, không thể chạy bộ.");
    }
}