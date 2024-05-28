package edu.pxu.lthdt.bai4;
import java.time.LocalDate;

public class DongVat {
    private String ten;
    private LocalDate ngaySinh;
    private String gioiTinh;

    public DongVat(String ten, LocalDate ngaySinh, String gioiTinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        LocalDate ngayhientai = LocalDate.now();
        if (ngaySinh.isAfter(ngayhientai)|| ngaySinh.isBefore(LocalDate.of(1980,1,1))) {
            System.out.println("Ngày sinh không hợp lệ.");
        } else {
            this.ngaySinh = ngaySinh;
        }
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "DongVat [ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + "]";
    }
}