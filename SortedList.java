/*
*
* Name: Sayd Mateen
* Class: CSC20
*/


public class SortedList {
	public DLNode current, Head, Tail;
	public DLNode prv;
		
	public void insert(double n){
		current = Head;
		while(current!= null && current.data <= n){
			current = current.Next;
		}
		prv = current==null ? Tail : current.Prev;
		DLNode temp = new DLNode(); temp.data = n;
		if(prv!= null) prv.Next = temp; else Head = temp;
		temp.Prev = prv;
		temp.Next = current;
		if( current!= null) current.Prev = temp; else Tail = temp;
	}

	public void listAscending() {
		current = Head;
		int count = 0;
		while (current != null){
			if(count % 5 == 0){
				System.out.println();
			}
			System.out.printf("%f ", current.data);
			current = current.Next;
			count++;
		}
		System.out.println();
	}

	public void listDescending() {
		current = Tail;
		int count = 0;
		while (current != null){
			if(count % 5 == 0){
				System.out.println();
			}
			System.out.printf("%f ", current.data);
			current = current.Prev;
			count++;
		}
		System.out.println();
	}
}
public class SortedList {
	public DLNode current, Head, Tail;
	public DLNode prv;
		
	public void insert(double n){
		current = Head;
		while(current!= null && current.data <= n){
			current = current.Next;
		}
		prv = current==null ? Tail : current.Prev;
		DLNode temp = new DLNode(); temp.data = n;
		if(prv!= null) prv.Next = temp; else Head = temp;
		temp.Prev = prv;
		temp.Next = current;
		if( current!= null) current.Prev = temp; else Tail = temp;
	}

	public void listAscending() {
		current = Head;
		int count = 0;
		while (current != null){
			if(count % 5 == 0){
				System.out.println();
			}
			System.out.printf("%f ", current.data);
			current = current.Next;
			count++;
		}
		System.out.println();
	}

	public void listDescending() {
		current = Tail;
		int count = 0;
		while (current != null){
			if(count % 5 == 0){
				System.out.println();
			}
			System.out.printf("%f ", current.data);
			current = current.Prev;
			count++;
		}
		System.out.println();
	}
}
