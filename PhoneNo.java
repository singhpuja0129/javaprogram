/*	Check valid phone no.
	I/p: "987-123-4567",
		"123 456 7890",
		"(123) 456-7890",
		"232323", " ", 
		"(123) 456 7890",
		"(123)-456-7890"
	O/p: Array (String of character or no.)of only valid phone no.
		(xxx) xxx-xxxx
		xxx-xxx-xxxx
*/
 
class PhoneNo{
	public static void main(String args[]){
		String[] input={ "(123)-456-7890" };
//		validNum("(123)-456-7890");
		validNum(input);
		}
	public static void validNum(String args[]){
//	String answer=new String[];
	for(int i=0;i<=args.length;i++)
	{
		// 1st case
		if(args[i].length() !=14)
		{
			}else if(args[i].charAt(0)=='(' && args[i].charAt(4)==')' && args[i].charAt[5]==' ' && args[i].charAt(9)=='-')
		System.out.println(args[i]);
	//	2nd case
	if(args[i].length() !=12)
	{
		}else if(args[i].charAt(3)=='-' && args[i].charAt(7)=='-')
		System.out.println(args[i]);
		}
	}
}