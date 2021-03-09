package eddu.smg;

public class GenericStack<E> {
	int arrLenght=3;
	int size=0;
	E[] arr = (E[])new Object[arrLenght];

	public GenericStack() {
		
	}
	
	public int getSize() {
		return size;
	}

	public E peek() {
		if(size==0) {
			return null;
		}
		else {
		return arr[size-1];
		}
	}

	  public void push(E o) {
          arr[size++] = o;
          if (size == arrLenght) {
              E[] arr2 = (E[])new Object[arrLenght *= 2];
              System.arraycopy(arr, 0, arr2, 0, arr.length);
              arr = arr2;
          }
      }

	public E pop() {
		if(size==0) {
			return null;
		}
		else {
		E o = arr[size-1];
		arr[size-1]=null;
		size--;
		return o;
		}
	}

	public boolean isEmpty() {
		return size==0;
	}

}