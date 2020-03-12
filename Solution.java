import java.io.*;
import java.util.*;
class Solution{
static int[] sort(int[] arr){
	if(arr == null || arr.length<2)
		return arr;
}
	for(int i=arr.length-1;i>=0;i--){
	int maxElementIndex = i;
	//find the next greatest element
	for(int j=i;j>=0;j--){
	if(arr[j]>arr[maxElementIndex]){
		maxElementIndex = j;
			}
		}
		flip(arr,maxElementIndex+1);
		flip(arr,i+1);
	}
	return arr;
}
static void flip(int[] arr, int k){
	if(arr == null || arr.length<2)
		return;
	
	for(int i=0;i<(k-1)/2;i++){
		int temp=arr[i];
		arr[i]=arr[k-i-1];
		arr[k-i-1]=temp;
	}
}
/*[1,5,4,3,2]->[1,2,3,4,5]	So basically we iterate 
	2 ways i.e, we take the greatest element and place 
		them at the end like descending order.
[4,2,3,1,5]->[2,3,1,4,5]->[2,1,3,4,5]->[1,2,3,4,5]
Iterate
	2 flips per position swap		*/
public static void main(String args){
}
}