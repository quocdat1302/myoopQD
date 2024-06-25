package edu.pxu.lthdt.bai12;

public class CungTen extends VuKhi {
    private String ten;
    private String mauMa;
    private double sucManh;

    public CungTen(String ten, String loaiVuKhi, String mauMa, double sucManh) {
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
    public void tanCong() {
        if (laVuKhiManh()) {
            System.out.println("Uy lực của cung tên vô cùng mạnh mẽ, bắn như vũ bão!");
        } else if (sucManh > 0.5 * getSucManh()) {
            System.out.println("Cung thủ bắn ra một mũi tên chính xác và mạnh mẽ!");
        } else {
            System.out.println("Sức mạnh của cung thủ không đủ, mũi tên bay yếu ớt.");
        }
    }

    @Override
    public void diChuyen() {
        System.out.println("Cung thủ vừa chạy vừa bắn tên, di chuyển linh hoạt!");
    }

    @Override
    public void satThuong() {
        System.out.println("Cung tên gây sát thương tầm xa và có khả năng xuyên phá cao!");
    }
}
