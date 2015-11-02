import java.util.Scanner;


public class EgyptianFractions {
	static String answer;

	public static void main(String[] args){

		answer = "";

		Scanner scanIn = new Scanner(System.in);
		
		while(true){
			int a = scanIn.nextInt();
			int b = scanIn.nextInt();
			
			if(a == 0 && b == 0){
				break;
			}

			getFrac(a, b);

			System.out.println(answer);
		}

	}

	static void getFrac(int num, int den){

		int[] frac = new int[2];

//		System.out.println(num + " " + den);

		if(num == 0){

			// frac[0] = 0;

			// frac[1] = 0;

			// return frac;

			answer += 0;

			return;

		}

		if(num == 1){

			// frac[0] = num;

			// frac[1] = den;

			//return frac;

			answer += num + "/" + den;

			return;

		}

		float dFrac = (float)num / den;

		// System.out.println

		float kFrac = 0;

		int finK = 0;

		for(int k = 2; k < Integer.MAX_VALUE; k++){

			kFrac = (float) 1.0 / k;

			if(dFrac >= kFrac){

				//	scanIn.next();

				finK = k;

				break;

			}

		}

		//finK is our "k" value in the problem

		int[] remainder = subtract(num, den, 1, finK);
		
		System.out.println(remainder[0] + " " + remainder[1]);
		
		if(remainder[0] == 1){
			
		}
		answer += "1/" + finK + " + ";
		getFrac(remainder[0], remainder[1]);

		// return frac;
		

		return;

	}

	static int[] subtract(int num1, int den1, int num2, int den2){

		int[] retFrac = new int[2];

		if(den1 == den2){

			int finNum = num1 - num2;

			retFrac[0] = finNum;

			retFrac[1] = den1;

		}

		else{

			int finNum1 = num1 * den2;

			int finDen1 = den1 * den2;

			int finNum2 = num2 * den1;

			int finDen2 = den2 * den1;

			int finNum = finNum1 - finNum2;

			retFrac[0] = finNum;

			retFrac[1] = finDen1;

		}

		return retFrac;

	}

}


