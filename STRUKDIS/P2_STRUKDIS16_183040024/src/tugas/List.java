package tugas;
public class List {
	private Node HEAD;
	public void addHead(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public boolean isEmpty() {
		if(HEAD == null) {
			return true;
		}
		return false;
	}
	
	public void displayElement() {
		Node curNode = HEAD;
		if (curNode == null) {
			System.out.println("List kosong");
		}
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
	}
	
	public void addTail(int data) {
		Node newNode = new Node(data);
		Node posNode = null;
		Node curNode = null;
		if(isEmpty()) {
			HEAD = newNode;
		} 
		else {
			curNode = HEAD;
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode); 
		}
	}
	
	public void addMiddle(int data, int urutan) {
		Node newNode = new Node(data);
		Node posNode = null;
		Node curNode = null;
		if(isEmpty()) {
			HEAD = newNode;
		} 
		else {
			curNode = HEAD;
			int counter = 1;
			while(counter < urutan) {
				posNode = curNode;
				curNode = curNode.getNext();
				counter++;
			}
			posNode.setNext(newNode);
			newNode.setNext(curNode);
		}
	}
	
	// Remove Head
	public void removeHead() {
		if(isEmpty()) {
			System.out.println("List Kosong");
		} else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}

	private void dispose(Node temp) {
		
	}
	
	public void removeTail() {
		Node preNode = null, lastNode;
		
		if(HEAD != null) {
			if(HEAD.getNext() == null) {
				HEAD = null;
			} else {
				lastNode = HEAD;
				while(lastNode.getNext() != null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();
				}
				preNode.setNext(null);
				dispose(lastNode);
			}
		}
	}
	// Hapus tengah sesuai dengan elemen yang ingin dihapus
	public void removeMiddle(int elemen) {
		Node preNode = null, lastNode;
		if(HEAD != null) {
			lastNode = HEAD;
			while(lastNode.getData() != elemen) {
				preNode = lastNode;
				lastNode = lastNode.getNext();
			}
			preNode.setNext(lastNode.getNext());
			dispose(lastNode);
		}
	}
	
	
}
