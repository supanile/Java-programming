public class Arrays{
	public static void main(String[] args) {
		final int MAX_ARRAY = 5;
		int[] numbers;
		numbers = new int[MAX_ARRAY]; //0,1,2,3,4
		//nummbers[0] pass

		int index; int sum;

		for (index = 0 ; index < numbers.length ; index++){ //numbers.length is 5
			//for (index = 0 ; index < 5 ; index + 1){
							// 5<5 false loop out
		numbers [index] = index*index;
		sum = 0;
		//index = 0, number[0] = 0*0 = 0,sum = 0
		//update index , index = 0+1 = 1

		//number[1] = 1*1 = 1,sum = 0
		//update index , index = 1+1 = 2

		//number[2] = 2*2 = 4,sum = 0
		//update index , index = 2+1 = 3

		//number[3] = 3*3 = 9,sum = 0
		//update index , index = 3+1 = 4

		//number[4] = 4*4 = 16,sum = 0
		//update index , index = 4+1 = 5 
		}
		for (index =0;index< MAX_ARRAY; index++){
						//4 < 5 yes
		sum=0;
		sum = sum + numbers [index];				//index = 0, sum = 0 + numbers[0] = 0+0 = 0
		//sum = 1 + numbers[2] = 1 + 4 = 5			//index = 1, sum = 0 + numbers[1] = 0+1 = 1
													//index = 2, sum = 0 + numbers[2] = 0+4 = 4
		//sum = 5 + numbers[3] = 5 + 9 = 14			//index = 2, sum = 0 + numbers[2] = 0+9 = 9
		//sum = 9 + numbers[4] = 9 + 16 = 25		//index = 3, sum = 0 + numbers[3] = 0+16 = 16

		System.out.println("sum is "+sum);  //print -->sum is 0
											//print -->sum is 1
		//print -->sum is 5					//print -->sum is 4
											
		//print -->sum is 14				//print -->sum is 9
											//print -->sum is 16
		

		//update index--> index = 1
		//update index--> index = 2
		//update index--> index = 3
		//update index--> index = 4
		}								
	}									
}									