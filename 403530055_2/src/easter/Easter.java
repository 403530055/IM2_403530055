package easter;

public class Easter {

	Easter() {

	}

	//�ŧi���R�A��ƬO�_�������O? �ӫŧi���R�A��Ʒ|���ͫ��˪��ĪG�O? (�ܼƥu���@��)
	static int Year;
	static int month_easter;
	static int day_easter;

	private static void gauss_algorithm() {
		// �o�˪��g�k�èS����, �u�O�|���C�{����Ū��, ������maintain�|���@�Ǽv�T��!
		//Math.floor(),-2
		//Anonymous Gregorian algorithm, �D�حn�D��Gauss algorithm
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
