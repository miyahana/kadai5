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
	if(number(n)==1){
		ans = one[n];
	}else{
		ans = two[n%10];
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
}

