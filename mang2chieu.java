package tuan3;

import java.util.Scanner;

public class mang2chieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, columns;
		System.out.print("Nhap so hang: ");
		rows = sc.nextInt();
		System.out.print("Nhap so cot: ");
		columns = sc.nextInt();
		
		//khai bao mang
		int[][] iArray = new int[rows][columns];
		// nhap mang
		for(int i = 0; i < rows; i++) {
			for(int j = 0 ; j < columns; j++) {
				System.out.print("iArray[" + i + "][" + j + "]" + "=");
				iArray[i][j] = sc.nextInt();
			}
		}
		// xuat mang
		for(int i = 0; i < rows; i++) {
			for(int j = 0 ; j < columns; j++) {
				System.out.print(iArray[i][j] + "\t");
			}
			System.out.println(); 
		}
		// tim so lon nhat va vi tri
		int max = iArray[0][0];
		for(int i = 0; i < rows; i++) {
			for(int j = 0 ; j < columns; j++) {
				if(iArray[i][j] > max) {
					max = iArray[i][j]; 
				}
			}
		}
		System.out.println("Mang lon nhat: "+ max);
		
//		int vitri = iArray[0][0];
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0 ; j < columns; j++) {
//				if(iArray[i][j] > max) {
//					max = iArray[i][j];
//					vitri = [i][j];
//					
//				}
//			}
//			System.out.println("Vi tri lon nhat: "+ iArray[i][j]);

		
	}
}
