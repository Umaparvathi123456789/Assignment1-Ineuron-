package Assignment;

import java.util.HashSet;
import java.util.Set;

public class CountofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,2,5,2,4,8,6,42,5,3,4,6,8,3,3,8,5,5};
		Set<Integer> s = new HashSet<>();
		for(int k=0;k<arr.length;k++) {
		s.add(arr[k]);
		}
		int count=0;
		for(Integer l:s) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==l) {
					count=count+1;
				}}
				System.out.println(l+" value count: "+count);
				count=0;
			}
			}}
