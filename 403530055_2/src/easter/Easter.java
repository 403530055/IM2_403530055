package easter;

public class Easter {

	Easter() {

	}

	//宣告為靜態函數是否為必須呢? 而宣告成靜態函數會產生怎麼樣的效果呢? (變數只有一份)
	static int Year;
	static int month_easter;
	static int day_easter;

	private static void gauss_algorithm() {
		// 這樣的寫法並沒有錯, 只是會降低程式易讀性, 對於後續maintain會有一些影響喔!
		//Math.floor(),-2
		//Anonymous Gregorian algorithm, 題目要求為Gauss algorithm
		int a = Year % 19, b = Year / 100, c = Year % 100, d = b / 4, e = b % 4, f = (b + 8) / 25, g = (b - f + 1) / 3,
				h = (19 * a + b - d - g + 15) % 30, i = c / 4, k = c % 4, l = (32 + 2 * e + 2 * i - h - k) % 7,
				m = (a + 11 * h + 22 * l) / 451;
		month_easter = ((h + l - 7 * m + 114) / 31);
		day_easter = ((h + l - 7 * m + 114) % 31) + 1;
	}

	public static String calculateEaster(int aYear) { // target
		Year = aYear;
		gauss_algorithm();

		return "In " + Year + ", Easter Sunday is: month = " + month_easter + " and day = " + day_easter;
	}

}
