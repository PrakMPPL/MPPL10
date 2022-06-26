import java.util.Scanner;

public class Deretbilangan {
	public static void main (String[] args) {
		System.out.println("Nama: Quina Majdina Syach");
		System.out.println("NIM : 064002100033");
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Masukkan bilangan x : ");
		x = input.nextInt();
		if (x % 2 == 1) {
			DeretGanjil(x);
	}
		else {
			DeretGenap(x);
		}
	}

	public static void DeretGanjil (int x) {
		int deret = x;
		System.out.println("\nHasil : ");
		for(deret = x ;deret>=1;deret--) {
			System.out.println(deret);
			deret--;
		}
		System.out.println("Deret Bilangan Ganjil");
	}

	public static void DeretGenap (int x) {
		int deret = x;
		System.out.println("\nHasil : ");
		for(deret = x ;deret>=1;deret--) {
			System.out.println(deret);
			deret--;
		}
		System.out.println("Deret Bilangan Genap");
	}
}