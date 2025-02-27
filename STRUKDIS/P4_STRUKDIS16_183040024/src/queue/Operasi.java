package queue;

public class Operasi {
	
	private Node FRONT;
	private Node REAR;
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
			
		} else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}
	
	public int dequeue() {
		Node temp = null;
		if(FRONT != null) {
			if(FRONT == REAR) {
				FRONT = null;
				REAR = null;
			} else {
				temp = FRONT;
				FRONT = FRONT.getNext();
				dispose(temp);
			}
		}
		return temp.getData();
	}
	
	public boolean isEmpty() {
		if(FRONT == null) {
			return true;
		}
		return false;
	}
	
	private void dispose(Node temp) {
		
	}

	public void displayElement() {
		Node curNode = FRONT;
		if (curNode == null) {
			System.out.println("Data kosong");
		}
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
		System.out.println("");
	}
	
	public int dataSize() {
		int jmlData = 0;
		Node curNode = FRONT;
		while (curNode != null) {
			jmlData++;
			curNode = curNode.getNext();
		}
		return(jmlData);
	}

	public Node getFRONT() {
		return FRONT;
	}

	public void setFRONT(Node fRONT) {
		FRONT = fRONT;
	}

	public Node getREAR() {
		return REAR;
	}

	public void setREAR(Node rEAR) {
		REAR = rEAR;
	}
	
}
