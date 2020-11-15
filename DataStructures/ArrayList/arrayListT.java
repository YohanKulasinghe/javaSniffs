import java.util.*;

class ArrayListT{
	public static void main(String args[]){
		int n  = 5;
		ArrayList<Integer> al = new ArrayList<Integer>(n); 

		for(int i = 1; i <= 5; i++){
			al.add(i);
		}

		System.out.print(al);

		al.remove(3);

		System.out.print(al);


		for(Integer in: al){
			System.out.print(in);
		}

	}
}