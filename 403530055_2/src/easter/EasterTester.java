/*
 * [B]83
 * [TA's advise]
 * 1.實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian, 等級從B開始計算.
 * 2.寫的沒什麼太大問題, 有一些註解記得看一下喔!
 * 3.下次可以嘗試在javadoc寫一些註解喔!
 * */

package easter;

public class EasterTester {

	public static void main(String[] arg) {
		System.out.println(Easter.calculateEaster(2001));
		System.out.println(Easter.calculateEaster(2012));
	}
}
