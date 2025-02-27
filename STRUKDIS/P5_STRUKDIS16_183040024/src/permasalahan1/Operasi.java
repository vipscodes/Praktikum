package permasalahan1;
public class Operasi {
	private Node HEAD;
	private Mahasiswa mahasiswa;
	
	public boolean isEmpty() {
		if(HEAD == null) {
			return true;
		}
		return false;
	}
	
	public void displayElement() {
		Node curNode = HEAD;
		int counter = 0;
		if (curNode == null) {
			System.out.println("List kosong");
		}
		while (curNode != null) {
			System.out.println("NRP : " + curNode.getData().getNrp());
			System.out.println("Nama : " + curNode.getData().getNama());
			System.out.println("Jenis Kelamin : " + curNode.getData().getJenisKelamin() + "\n");
			curNode = curNode.getNext();
			counter++;
		}
		System.out.println("Jumlah Data : " + counter);
	}
	
	public void addData(Mahasiswa data) {
		Node newNode = new Node(data);
		Node posNode = null;
		Node curNode = null;
		// Jika data masih kosong
		if(isEmpty()) {
			HEAD = newNode;
		}
		// jika data yang dimasukkan berjenis kelamin perempuan
		else if(newNode.getData().getJenisKelamin() == 'P'){
			// jika data pertama berjenis kelamin laki-laki
			if(HEAD.getData().getJenisKelamin() == 'L') {
				newNode.setNext(HEAD);
				HEAD = newNode;
			} 
			// jika data pertama berjenis kelamin perempuan
			else {
				curNode = HEAD;
				while(curNode != null && curNode.getData().getJenisKelamin() == 'P') {
					posNode = curNode;
					curNode = curNode.getNext();
				}
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}
		} 
		// jika data yang dimasukkan berjenis kelamin laki-laki
		else {
			curNode = HEAD;
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode); 
		}
	}
	
}
