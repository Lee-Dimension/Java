package day12;
import static java.lang.System.out;
class Generic1<T> {
	
	T[] v;
	
	public void set(T[] n) {
		v = n;
	}
	public void print() {
		for(T s:v)
			out.println(s);
	}
}
