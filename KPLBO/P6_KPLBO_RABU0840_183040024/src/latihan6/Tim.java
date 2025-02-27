package latihan6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tim {
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	private List<Pemain> pemainCadangan = new ArrayList<Pemain>();
	
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}
	
	public boolean tambahPemainInti(Pemain pemain) {
		if(pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama()+ " berhasil ditambahkan sebagai pemain inti");
			return true;
		} else {
			System.out.println(pemain.getNama() + " tidak berhasil ditambahkan sebagai pemain inti");
		}
		return false;
	}
	
	public boolean tambahPemainCadangan(Pemain pemain) {
		if(pemainCadangan.size() < 6) {
			pemainCadangan.add(pemain);
			System.out.println(pemain.getNama()+ " berhasil ditambahkan sebagai pemain inti");
			return true;
		} else {
			System.out.println(pemain.getNama() + " tidak berhasil ditambahkan sebagai pemain inti");
		}
		return false;
	}
	
	public void tampilPemainInti() {
		Collections.sort(pemainInti);
		for (int i = 0; i < pemainInti.size(); i++) {
			Pemain p = pemainInti.get(i);
			System.out.println((i+1) + ". " + p.getNoPunggung()+ " # "+p.getNama());
		}
	}
	
	public void tampilPemainCadangan() {
		Collections.sort(pemainCadangan);
		for (int i = 0; i < pemainCadangan.size(); i++) {
			Pemain p = pemainCadangan.get(i);
			System.out.println((i+1) + ". " + p.getNoPunggung()+ " # "+p.getNama());
		}
	}
	
	public void gantiPemain(int indexTarik, int indexMasuk) {
		indexTarik -= 1;
		indexMasuk -= 1;
		pemainCadangan.add(pemainInti.get(indexTarik));
		pemainInti.remove(indexTarik);
		pemainInti.add(pemainCadangan.get(indexMasuk));
		pemainCadangan.remove(indexMasuk);
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<Pemain> getDaftarPemain() {
		return pemainInti;
	}

	public void setDaftarPemain(List<Pemain> pemainInti) {
		this.pemainInti = pemainInti;
	}
	
	
}
