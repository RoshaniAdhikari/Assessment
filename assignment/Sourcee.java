package assignment;

public class Sourcee {
	public static int getSecondSmallest(int[] arr)// Method takes array of integer as parameter
	{
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
//		for(int num:arr)
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		int[] inputArray = { 23, 45, 32, 22, 20, 96 };
		int result = getSecondSmallest(inputArray);
		System.out.println(result);
	}
}

//exexution:
//
//arr={23,45,32,22,20,96}
//small=9999;
//ssmall=9999;
//a[0]=23;
//if(23<9999)……..true
//ss=9999; ie.ss
//s=23;
//----------------------------------------------------------------
//a[1]=45;
//if(45<23)……….false
//elseif(45<9999 &&45!=23)……true
//ssmall=45;
//-------------------------------------------------- 
//a[2]=32;
//if(32<23)……false
//elseif(32<45 && 32!=23)….true
//ssmall=32;
//------------------------------------------------- 
//a[3]=22;
//if(22<23)……true
//ssmall=23;
//small=22;
//---------------------------------------------------- 
//a[4]=20;
//if(20<22)………….true
//ssmall=22;
//small=20;
//----------------------------------------------------- 
//a[5]=96;
//if(96<20)……………..false
//elseif(96<22 &&96!=20)…………….false
//return ssmall i.e.22
