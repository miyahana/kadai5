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
	String hund = "hundred";
	if(number(n)==1){
		ans = one[n];
	}else if(number(n)==2 && n/10==1){
		ans = two[n%10];
	}else if(number(n)==2){
		if(tenZero(n)){	
			ans = tens[(n/10)-2];
		}else{
			ans = tens[(n/10)-2] + one[n%10];
		}
	}else{
		if(tenZero(n)&&hundZero(n)){
			ans = one[n/100]+hund;
		}else if(!hundZero(n)){
			if(tenZero(n)){
				
			}else{
				
			}
		}
	}

	   	
	return ans;
	}
	static int number(int n){
		if(String.valueOf(n).length()==1){
			return 1;
		}else if(String.valueOf(n).length()==2){
			return 2;
		}else{
			return 3;
		}
	}
	static boolean tenZero(int n){
		if(n%10 == 0){
			return true;
		}else{
			return false;
		}
	}
	static boolean hundZero(int n){
		if(n%100==0){
			return true;
		}else{
			return false;
		}
	}

}

