package edu.pxu.lthdt.bai12;

public class PhuThuy extends NhanVat {
    private String choi; // Broom
    private String gay; // Wand
    private String phongCach; // Style
    private String sucManhPhepThuat; // Magic Power

    public PhuThuy(String ten, int id, String gioiTinh, double nangLuong, VuKhi vuKhi, String choi, String gay,
                   String phongCach, String sucManhPhepThuat) {
        super(ten, id, gioiTinh, nangLuong, vuKhi);
        this.choi = choi;
        this.gay = gay;
        this.phongCach = phongCach;
        this.sucManhPhepThuat = sucManhPhepThuat;
    }

    // Getter và setter
    public String getChoi() {
        return choi;
    }

    public void setChoi(String choi) {
        this.choi = choi;
    }

    public String getGay() {
        return gay;
    }

    public void setGay(String gay) {
        this.gay = gay;
    }

    public String getPhongCach() {
        return phongCach;
    }

    public void setPhongCach(String phongCach) {
        this.phongCach = phongCach;
    }

    public String getSucManhPhepThuat() {
        return sucManhPhepThuat;
    }

    public void setSucManhPhepThuat(String sucManhPhepThuat) {
        this.sucManhPhepThuat = sucManhPhepThuat;
    }

    @Override
    public void tanCong() {
        // Logic tấn công của Phù Thủy
        String attackDescription;

        if (sucManhPhepThuat != null && !sucManhPhepThuat.isEmpty()) {
            attackDescription = "Phù Thủy sử dụng " + sucManhPhepThuat + " để tấn công kẻ thù!";
        } else {
            attackDescription = "Phù Thủy sử dụng " + getVuKhi().getTen() + " để tấn công kẻ thù!";
        }

        System.out.println(attackDescription);
    }

    @Override
    public void diChuyen() {
        // Logic di chuyển của Phù Thủy
        if (choi != null && !choi.isEmpty()) {
            System.out.println("Phù Thủy di chuyển bằng chổi " + choi + ".");
        } else {
            System.out.println("Phù Thủy di chuyển trên bộ.");
        }
    }

    @Override
    public void satThuong() {
        // Logic gây sát thương của Phù Thủy
        System.out.println("Phù Thủy gây sát thương bằng " + getVuKhi().getTen() + "!");
    }

    @Override
    public String toString() {
        return "PhuThuy [ten=" + getTen() + ", id=" + getId() + ", gioiTinh=" + getGioiTinh() + 
                ", nangLuong=" + getNangLuong() + ", vuKhi=" + getVuKhi() + 
                ", choi=" + choi + ", gay=" + gay + ", phongCach=" + phongCach + 
                ", sucManhPhepThuat=" + sucManhPhepThuat + "]";
    }
}
