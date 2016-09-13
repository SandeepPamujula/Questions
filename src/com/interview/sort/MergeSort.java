package com.interview.sort;


public class MergeSort {
	
	public void Sort(int[] arr,int start,int last){
		
		if (start>=last)
		{
			return;
		}
		int mid = (start+last)/2;
		Sort(arr,start,mid);
		Sort(arr,mid+1,last);
		
		simpleMerge(arr,start,mid,last);
		
	}
	public void swap(int[] arr,int start,int end)
	{
		if (arr[start]>arr[end])
		{
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end] = temp;
		}
	}
	public void simpleMerge(int[] arr,int start,int mid,int last){
		int[] helper = new int[last+1];
		int s=start,m=mid+1;
		int s1=s;
//		System.out.println("\nSan "+start + " "+mid+" "+last);
		System.out.println("\nSan "+start +" "+last);
		for (int count=start;count<=last;count++){
			helper[count] = arr[count];
		}
		
		while(s<=mid && m<=last)
		{
			if (helper[s]<=helper[m]){
				arr[s1++] = helper[s];
				s++;
			}else{
				arr[s1++] = helper[m];
				m++;
			}
		}
		while (s<=mid){
			arr[s1++] = helper[s++];
		}
	}
	public static  void printArr(int[] arr){
		for (int a :arr){
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int[] arr1= {4,2,1,3,6,5,0};
		int[] arr1= {2,6,1,3,5,7,4};
		MergeSort ms = new MergeSort();
		System.out.println("B4 Merge  ");
		printArr(arr1);
		ms.Sort(arr1,0,(arr1.length-1));
		System.out.println("\nafter merge: ");
		printArr(arr1);

	}

}
