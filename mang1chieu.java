package tuan3;

import java.util.Scanner;

public class mang1chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so luong phan tu mang: ");
		n = sc.nextInt();
		int[] iArray = new int[n];
		
		// nhap mang
		for(int i = 0; i < iArray.length; i++) {
			System.out.print("Nhap so phan tu" + (i+1)+" :");
			iArray[i] = sc.nextInt();
		}
		
		// xuat mang
		System.out.print("Mang vua nhap: ");
		for(int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
		}
	}
}
