package sukkiri1.code16.code08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
		List<List<Integer>>list = new ArrayList<List<Integer>>();
		List<Integer> listIn = new ArrayList<Integer>();
		list.add(listIn);
		listIn.add(10);
		System.out.println(list.get(0).get(0));
		///上と下同じことしてる
		int[][]arr = new int[3][];
		int[]arrIn = new int[3];
		arr[0]=arrIn;
		arrIn[0]=10;
		System.out.println(arr[0][0]);
		
		
		List<int[]> intList = new ArrayList<int[]>();
	//	List<Integer>[]a =new List[3];//これは不可
		
		
	}

}
