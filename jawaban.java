public class jawaban {
	public static void main(String [] args) {
//		INI ADALAH NESTED LOOP BINTANG (*)
		int barisBintang = 0; //digunakan untuk print banyak bintang (*) disetiap baris
		int lineBaruBintang;	//digunakan untuk garis baru setiap inner loop selesai
		int maksimalBaris = 4;
		
		for (lineBaruBintang = 0; lineBaruBintang <= maksimalBaris ; lineBaruBintang++) {
			for (barisBintang = 0; barisBintang <= lineBaruBintang; barisBintang++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		INI ADALAH NESTED LOOP SIMBOL ANGKA 1-5
		int barisAngka; //digunakan untuk print angka disetiap baris
		int lineBaruAngka; //digunakan untuk garis baru ketika inner loop selesai
		maksimalBaris = 4;
		
		for(lineBaruAngka = 0; lineBaruAngka <= maksimalBaris; lineBaruAngka++) {
			for(barisAngka = 0; barisAngka <= lineBaruAngka; barisAngka++) {
				System.out.print((lineBaruAngka + 1)+ " ");
			}
			System.out.println();
		}
	}
}
