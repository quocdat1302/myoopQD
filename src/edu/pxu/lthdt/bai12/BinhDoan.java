package edu.pxu.lthdt.bai12;

import java.util.List;

public class BinhDoan {
    private String ten;
    private int soLuong;
    private String thuocBinhDoan;
    private List<String> trangBiVuKhi; // Assuming trangBiVuKhi is a list of strings representing weapon names
    private DoiQuan doiquan;
    private List<KyBinh> dskb;

    public BinhDoan(String ten, int soLuong, String thuocBinhDoan, List<String> trangBiVuKhi, DoiQuan doiquan,
                    List<KyBinh> dskb) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.thuocBinhDoan = thuocBinhDoan;
        this.trangBiVuKhi = trangBiVuKhi;
        this.doiquan = doiquan;
        this.dskb = dskb;
    }

    // Additional constructor
    public BinhDoan(DoiQuan doiquan, List<KyBinh> dskb) {
        this.doiquan = doiquan;
        this.dskb = dskb;
    }

    // Getter and Setter methods
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getThuocBinhDoan() {
        return thuocBinhDoan;
    }

    public void setThuocBinhDoan(String thuocBinhDoan) {
        this.thuocBinhDoan = thuocBinhDoan;
    }

    public List<String> getTrangBiVuKhi() {
        return trangBiVuKhi;
    }

    public void setTrangBiVuKhi(List<String> trangBiVuKhi) {
        this.trangBiVuKhi = trangBiVuKhi;
    }

    public DoiQuan getDoiquan() {
        return doiquan;
    }

    public void setDoiquan(DoiQuan doiquan) {
        this.doiquan = doiquan;
    }

    public List<KyBinh> getDskb() {
        return dskb;
    }

    public void setDskb(List<KyBinh> dskb) {
        this.dskb = dskb;
    }

    // Attack method
    public void tanCong(DoiQuan doiDich) {
    }



    // Move method
    public void diChuyen(int x, int y) {
        System.out.println(String.format("Binh đoàn %s đang di chuyển đến vị trí (%d, %d)", ten, x, y));
    }

    // Damage calculation method
    public int satThuong() {
        int averageDamage = 10;
        return dskb != null ? dskb.size() * averageDamage : 0;
    }

    @Override
    public String toString() {
        String unitCount = dskb != null ? String.format("%d Kỵ Binh", dskb.size()) : "Không có Kỵ Binh";
        String commanderName = doiquan != null ? doiquan.getTen() : "chưa xác định";
        return String.format("Binh đoàn %s (%s) hùng mạnh, dưới sự chỉ huy của %s, %s sẵn sàng chiến đấu!",
                ten, thuocBinhDoan, commanderName, unitCount);
    }
}
