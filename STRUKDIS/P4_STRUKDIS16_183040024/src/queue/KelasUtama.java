package queue;

import java.util.Scanner;

public class KelasUtama {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Operasi operasi = new Operasi();
		int pilihan = 0;
		int data;
		
		
		while(pilihan != 5) {
			System.out.println("==================");
			System.out.println("Selamat Datang...");
			System.out.println("Daftar Menu");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Jumlah data queue");
			System.out.println("4. Tampil Data");
			System.out.println("5. Keluar");
			System.out.print("Menu pilihan anda : ");
			pilihan = sc.nextInt();
			System.out.println("==================");
			switch(pilihan) {
				case 1 : 
						 int jumlahData = 0;
						 System.out.print("Jumlah data yang ingin dimasukkan : ");
						 jumlahData = sc.nextInt();
						 for (int i = 1; i <= jumlahData; i++) {
							System.out.print("Masukkan data ke-" + i + " : ");
							data = sc.nextInt();
							operasi.enqueue(data);
						 }
						 System.out.println("Data berhasil dimasukkan");
						 break;
				case 2 :
						 if(operasi.isEmpty()) {
							 System.out.println("Data masih kosong");
						 } else {
							 System.out.println("Nilai yang akan dihapus : " + operasi.getFRONT().getData());
							 System.out.println("Apakah anda yakin akan menghapus nilai tersebut ?");
							 System.out.println("Y = Hapus, oth = batal");
							 System.out.print("Pilihan : ");
							 String pilih = sc.next();
							 if(pilih.equalsIgnoreCase("Y")) {
								 int hapus = operasi.dequeue();
								 System.out.println("Data berhasil dihapus");
								 System.out.println("Data yang dihapus : " + hapus);
							 } else {
								 System.out.println("Data gagal dihapus");
							 }
						 }
						 break;
				case 3 : System.out.println(operasi.dataSize());break;
				case 4 : operasi.displayElement(); break;
			}
		}
		
		
	}
}

