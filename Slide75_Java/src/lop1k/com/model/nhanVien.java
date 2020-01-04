package lop1k.com.model;

public class nhanVien {
	private String ten;
	private String ho;
	private int soSanPham;
	private int donGia;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public int getSoSanPham() {
		return soSanPham;
	}
	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}
	public nhanVien(String ten, String ho, int soSanPham) {
		super();
		this.ten = ten;
		this.ho = ho;
		if (soSanPham<0)
			this.soSanPham =0;
		else 
			this.soSanPham = soSanPham;
	}
	public nhanVien() {
		super();
	}
	private double getLuong(int soSanPham, int donGia) {
		this.donGia=donGia;
		double salary;
		salary=0;
		if (soSanPham>=199) {
			salary = salary + 199*0.5;
			soSanPham=soSanPham-199;
		}
		else 
			salary= salary + soSanPham*0.5;
		//-----------------------------------------
		if (soSanPham>=199) {
			salary = salary + 199*0.55;
			soSanPham=soSanPham-199;
		}
		else {
			salary= salary + soSanPham*0.55;
			soSanPham=0;
		}
		//-----------------------------------------
		if (soSanPham>=199) {
			salary = salary + 199*0.55;
			soSanPham=soSanPham-199;
		}
		else {
			salary= salary + soSanPham*0.6;
			soSanPham=0;
		}
		//-------------------------------------------
		if (soSanPham>=199) {
			salary = salary + 199*0.5;
			soSanPham=soSanPham-199;
		}
		else {
			salary= salary + soSanPham*0.6;
			soSanPham=0;
		}
		//-------------------------------------------
		if (soSanPham>=199) {
			salary = salary + 199*0.65;
			soSanPham=soSanPham-199;
		}
		else {
			salary= salary + soSanPham*0.65;
			soSanPham=0;
		}
		return salary;
	}
	public boolean LonHon(nhanVien nv2) {
		boolean ktra;
		ktra = false;
		if (this.soSanPham>nv2.getSoSanPham()) ktra = true;
		return ktra;
	}
	@Override
	public String toString() {
		System.out.println("Nhân viên: "+ho+" "+ten);
		System.out.println("Số sản phẩm: "+soSanPham);
		System.out.println("Lương nhận được: "+getLuong(soSanPham, donGia));
		return "";
	}
}
