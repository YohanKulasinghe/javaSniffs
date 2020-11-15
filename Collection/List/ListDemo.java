import java.util.ArrayList;

public class ListDemo{

	public static void main (String args[]){

		ArrayList list1 = new ArrayList();

		list1.add(2);
		list1.add(3);

		Car x = new Car();
		list1.add(x);

		list1.set(2,'A');
		System.out.print(list1);
	}


}


class Car{

	public void show(){
		System.out.print("a");
	}
	
}