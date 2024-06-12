package ExMat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ex04 {


	public static void main(String[] args) {
		int sa [][] = new int [3][3];
		int sb [][] = new int [3][3];
		int sc [][] = new int [3][3];
		for (int i =0; i <3 ; i++) {
			for (int j=0; j<3 ; j++) {
				sa[i][j] = (int) Math.round(Math.random()*100);
				sb[i][j] = (int) Math.round(Math.random()*100);
				sc[i][j] += sa[i][j] * sb[i][j];
			}
		}
		System.out.println("Matriz A :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" [" + sa[i][j]+"]");
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
		System.out.println("Matriz B :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" [" + sb[i][j]+"]");
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
		System.out.println("A soma das matrizes A e B é igaul :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" [" + sc[i][j]+"]");
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
	}
}

