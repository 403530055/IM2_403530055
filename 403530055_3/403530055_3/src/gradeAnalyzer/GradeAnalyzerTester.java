/*
 * [A]98
 * [TA's Advise]
 * 1. 沒什麼太大問題, 小錯誤在程式碼裡面標示出來了, 參考一下!
 * 2. 我很喜歡你對於Distribution的寫法, 那非常有趣! 
 * */

package gradeAnalyzer;

import javax.swing.*;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		String input = "";
		GradeAnalyzer gradeAnalyzer = new GradeAnalyzer();

		while (true) {

			input = JOptionPane.showInputDialog(null, "輸入分數");
			// equalsIgnoreCase是不管大小寫的比對, 所以寫一個就可以了.
			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("Q")) {
				break;
			}
			// 只要有使用者輸入的部分都建議要有例外處理, -2.
			gradeAnalyzer.addGrade(Double.parseDouble(input));
		}

		// 缺少判斷是否 <2, -2
		gradeAnalyzer.analyzeGrades();
		System.out.println("You entered " + gradeAnalyzer.all_grades.size()
				+ " Valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println("The average = " + String.format("%.0f", gradeAnalyzer.average)
				+ " with a standard deviation = " + String.format("%.0f", gradeAnalyzer.standard_deviation));
		System.out.println(gradeAnalyzer);
	}

}
