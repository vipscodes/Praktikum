package permasalahan1;

public class Mahasiswa {
	private String nrp;
	private String nama;
	private char jenisKelamin;
	
	public Mahasiswa(String nrp, String nama, char jenisKelamin) {
		this.nrp = nrp;
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public char getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(char jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	
}
