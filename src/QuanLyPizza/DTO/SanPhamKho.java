/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPizza.DTO;

/**
 *
 * @author hoang
 */
public class SanPhamKho {
    private int maSP;
    private String maKho;
    private int soLuong;

    public SanPhamKho() {}

    public SanPhamKho(int maSP, String maKho, int soLuong) {
        this.maSP = maSP;
        this.maKho = maKho;
        this.soLuong = soLuong;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
