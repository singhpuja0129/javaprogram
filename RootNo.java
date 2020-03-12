/* 	
		Finding value of root no. without using Root function
	9=3*3	->n=2	9/2=4	Approach=4/2=2*2=4
	7=y*y*y		Approach=7/3=2*2; 7/2=3.5*3.5*3.5=41.7 or 42
	(0+3.5)/2=1.75*1.75*1.75=
	Ans=-x<0.001
	example-> x=9, n=2
*/
import java.io.*;
import java.utill.*;
class RootNo{
	public static void main(String args[]){
		System.out.println(root(9,2));
	double root(double x,int n);
	double start=0;	//2.25
	double end=x; //4.5
	double error=0.001;
	double mid=0;
	double result;
	do {
	double mid=(start+end)/2.0; //4.5	->2.25	->3.375
	mid=Maths.pow(mid,n);		//20.25		->5.0	->11.39
	
	if(result > x){
		end=mid;
	}else if(result < x){
		start=mid;
	}else{
		return mid; 
	}
 //Using absolute function
	}while(Math.abs(result-x)>=error);
	
	return mid;
	}
}
