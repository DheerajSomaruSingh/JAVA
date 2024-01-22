package binarysearch;
import java.util.*;

public class binarysearch {
	public static int binary_search(int[] k,int l) {
		int i=0;
		int j=k.length-1;
		int mid;
		while(i<j) {
			mid = (i+j)/2;
			if(k[mid]>l) {
				j=mid-1;
			}
			else if(k[mid]<l) {
				i=mid+1;
			}
			else if(k[mid]==l){
				return mid;
			}
			else {
				continue;
			}
		}
		
		return -1;
	}
	public static int binary_search_recursion(int[] k,int l,int i,int j) {
		int mid = (i+j)/2;
		if(i==j) {
			return -1;
		}
		if(k[mid]==l) {
			return mid;
		}
		if(k[mid]>l) {
			binary_search_recursion(k,l,i,mid-1);
		}
		if(k[mid]<l) {
			binary_search_recursion(k,l,mid+1,l);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] l = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();		
		System.out.println(binary_search(l,p));
		int i=0;
		int j= l.length-1;
		System.out.println(binary_search_recursion(l,p,i,j));
	}

}
