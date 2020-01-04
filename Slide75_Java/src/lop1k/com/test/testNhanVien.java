package lop1k.com.test;

import java.util.Scanner;

import lop1k.com.model.nhanVien;

public class testNhanVien {
public static void main(String[] args) {
	nhanVien nv1 = new nhanVien();
	System.out.println("Mời bạn nhập vào họ nhân viên 1: ");
	String ho= new Scanner(System.in).nextLine();
	nv1.setHo(ho);
	System.out.println("Mời bạn nhập vào tên nhân viên 1: ");
	String ten= new Scanner(System.in).nextLine();
	nv1.setTen(ten);
	System.out.println("Mời bạn nhập vào mức sản phẩm: ");
	int soSanPham = new Scanner(System.in).nextInt();
	nv1.setSoSanPham(soSanPham);
	//---------------------------------------------------------
	nhanVien nv2= new nhanVien();
	System.out.println("Mời bạn nhập vào họ nhân viên 2: ");
	ho= new Scanner(System.in).nextLine();
	nv2.setHo(ho);
	System.out.println("Mời bạn nhập vào tên nhân viên 2: ");
	ten= new Scanner(System.in).nextLine();
	nv2.setTen(ten);
	System.out.println("Mời bạn nhập vào mức sản phẩm: ");
	soSanPham = new Scanner(System.in).nextInt();
	nv2.setSoSanPham(soSanPham);
	//---------------------------------------------------------
	System.out.println(nv1);
	System.out.println("-----------------------------");
	System.out.println(nv2);
	System.out.println("-----------------------------");
	if (nv1.LonHon(nv2)) { 
		System.out.println("Nhân viên "+nv1.getHo()+" "+ nv1.getTen()+" có số sản phẩm nhiều hơn nhân viên "+nv2.getHo()+" "+ nv2.getTen());
		System.out.println("Số sản phẩm nhiều hơn là: "+ (nv1.getSoSanPham()-nv2.getSoSanPham()));
	}
	else {
		System.out.println("Nhân viên "+nv2.getHo()+" "+ nv2.getTen()+" có số sản phẩm nhiều hơn "+nv1.getHo()+" "+ nv1.getTen());
		System.out.println("Số sản phẩm nhiều hơn là: "+ (nv2.getSoSanPham()-nv1.getSoSanPham()));
	}
}
}
