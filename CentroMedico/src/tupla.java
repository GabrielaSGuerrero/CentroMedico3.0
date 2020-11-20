
public class tupla<T1, T2> {
	private T1 x;
	private T2 y;
	
	public tupla(T1 t1, T2 t2) {
		x = t1;
		y = t2;
	}

	public T1 getX() {
		return x;
	}

	public T2 getY() {
		return y;
	}
	@Override
	public String toString() {
		return x.toString()+", "+y.toString();
	}

	
}
