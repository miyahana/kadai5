package kadai5;

import java.util.Scanner;

public class IntToEng {

	    // メインメソッド
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();

	    System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
	String ans = "";
	String[] one = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	String[] two = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nignteen"};
	String[] tens = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	if(number(n)==1){
		ans = one[n];
	}else if(number(n)==2 && n/10==1){
		ans = two[n%10];
	}else{
		if(zero(n)){	
			ans = tens[(n/10)-2];
		}else{
			ans = tens[(n/10)-2] + one[n%10];
		}
	}
	   	
	return ans;
	}
	static int number(int n){
		if(String.valueOf(n).length()==1){
			return 1;
		}else{
		return 2;
		}
	}
	static boolean zero(int n){
		if(n%10 == 0){
			return true;
		}else{
		return false;
		}
	}
}

