package edu.pxu.lthdt.bai6.vd1;


import edu.pxu.lthdt.bai05.DiChuyen;
import edu.pxu.lthdt.bai05.NhanVat;
import edu.pxu.lthdt.bai05.TanCongVuKhi;

public class PhuThuy extends NhanVat implements DiChuyen, TanCongVuKhi {

    private boolean choi;
    private boolean gay;

    public PhuThuy(String ten, String id, byte gioiTinh, double nangluong, boolean choi, boolean gay) {
        super(ten, id, gioiTinh, nangluong);
        this.choi = choi;
        this.gay = gay;
    }

    public boolean isChoi() {
        return choi;
    }

    public void setChoi(boolean choi) {
        this.choi = choi;
    }

    public boolean isGay() {
        return gay;
    }

    public void setGay(boolean gay) {
        this.gay = gay;
    }

    @Override
    public String toString() {
        return "PhuThuy [choi=" + choi + ", gay=" + gay + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void hanhdong() {
        System.out.println("Phù thủy đang bay lơ lửng trên không trung, " + (choi ? "tay cầm chổi" : "không cầm chổi") + ", " + (gay ? "tay cầm gậy" : "không cầm gậy") + ".");
    }

    @Override
    public void sucManh() {
        double enhancedEnergy = this.getNangluong() * 1.5;
        System.out.println("Phù thủy sử dụng sức mạnh phép thuật, năng lượng hiện tại là " + enhancedEnergy);
    }

    @Override
    public void tanCongVoiVuKhi() {
        if (isChoi()) {
            System.out.println("Phù thủy sử dụng chổi để tấn công kẻ thù, tạo ra một cơn lốc xoáy phép thuật.");
        } else if (isGay()) {
            System.out.println("Phù thủy sử dụng gậy để phóng ra tia năng lượng mạnh mẽ.");
        } else {
            System.out.println("Phù thủy không có vũ khí, sử dụng phép thuật cơ bản để tấn công.");
        }
    }

    @Override
    public void tanCongCoVuKhi() {
        System.out.println("Phù thủy niệm chú, triệu hồi sức mạnh phép thuật, tạo ra một vụ nổ năng lượng lớn.");
    }

    @Override
    public void sangPhai() {
        System.out.println("Phù thủy nhẹ nhàng di chuyển sang phải, " + (choi ? "chổi phe phẩy nhẹ" : "") + ", " + (gay ? "gậy được giơ ra phía trước để dẫn đường" : "") + ".");
    }

    @Override
    public void sangTrai() {
        System.out.println("Phù thủy thận trọng di chuyển sang trái, " + (choi ? "chổi nghiêng về phía bên trái để giữ thăng bằng" : "") + ", " + (gay ? "gậy được dùng để ra hiệu lệnh" : "") + ".");
    }

    @Override
    public void bayLen() {
        System.out.println("Phù thủy bay lên cao, " + (choi ? "chổi đẩy mạnh về phía sau tạo lực" : "") + ", " + (gay ? "gậy phát sáng, tạo ra một luồng sáng bảo vệ" : "") + ".");
    }

    @Override
    public void boChay() {
        System.out.println("Phù thủy bay nhanh hơn, " + (choi ? "chổi được dùng để điều hướng" : "") + ", " + (gay ? "gậy được giơ ra sau lưng để duy trì thăng bằng" : "") + ".");
    }
}
