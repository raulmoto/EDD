package divorcios;



public class Ejercicio3 {
	private Node first;
	private int size;

	public Ejercicio3(Node first, int size) {
		this.first = first;
		this.size = size;
	}

	public Ejercicio3() {
		this.first = null;
		this.size = 0;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean add(Node node) {
		System.out.println("entrando a lista enlazada simple");
		try {
			if(size == 0) {
				first = node;
			} else {
				Node p = first;
				for(int i = 1; i < size; i++) {
					p = p.getNext();
				} p.setNext(node);
			} size++;
			return true;
		} catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	

	public boolean delete() {
		System.out.println("Eliminamos nodo:");
		try {
			Node p = first;
			//SI EL NODO FIRST ES MAYOR AL SIGUIENTE, EL SIGUIENTE ES EL FIRST AHORA, ASI ELIMINAMOS EL ANTERIOR YA QUE YA NADIE LO APUNTA
			if(size>=3) {
				if (p.getContent() > p.getNext().getContent()) {
					p.getNext();
					p=first;
				}else if(p.getContent() < p.getNext().getContent()) {
			   // SI EL SEGUNDO NODO ES MAYOR AL PRIMERO, EL PRIMERO APUNTA AL SIGUIENTE DEL SEGUNDO Y EL SEGUNDO APUNTA A NULL
					Node medio = p.getNext();
					p.setNext(medio.getNext());
					medio.setNext(null);
					System.out.println("Eliminamos  el nodo con mayor contenido:");
				}
				size--;
			}else if (size ==1) {
			//SI EN LA LISTA SOLO HAY DOS NODOS Y EL PRIMERO ES MAYOR QUE EL SEGUNDO, EL FIRST SE PARA EN EL SIGUIENTE DEL PRIMERO
				if (p.getContent() > p.getNext().getContent()) {
					p.getNext();
					p=first;
				}else if (p.getContent() < p.getNext().getContent()) {
			//SI SOLO TENEMOS DOS NODOS EN LA LISTA Y EL SEGUNDO ES MAYOR QUE EL SEGUNDO, EL PRIMERO APUNTA A NULL
					p.setNext(null);
				}
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	public void show() {
		Node p = first;
		for (int i = 0; i < size; i++) {
			System.out.println("[ " + i + "] -> " + p.getContent());
			p = p.getNext();
		}

	}

}
