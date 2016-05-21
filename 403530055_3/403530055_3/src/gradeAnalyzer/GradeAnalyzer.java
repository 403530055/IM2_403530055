package gradeAnalyzer;

import java.util.*;

class Grades {

	double point;
	String level;

	Grades() {

	}

	Grades(double point, String level) {
		this.point = point;
		this.level = null;
	}
}

public class GradeAnalyzer {

	final double max_allowed = 110;
	final double min_allowed = 0;
	double sum = 0;
	double square_sum = 0;
	double average = 0;
	double standard_deviation = 0;
	String level_list[] = { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F" };
	int level_count[] = new int[11];

	ArrayList<Grades> all_grades = new ArrayList<Grades>(); // store all input

	boolean isValidGrade(double aGrade) {
		if (aGrade <= max_allowed && aGrade >= min_allowed)
			return true;
		return false;
	}

	String Asign_level(Grades grade_test) {
		double point = grade_test.point;
		if (point >= 98) {
			return "A+";
		} else if (point >= 92) {
			return "A";
		} else if (point >= 90) {
			return "A-";
		} else if (point >= 88) {
			return "B+";
		} else if (point >= 82) {
			return "B";
		} else if (point >= 80) {
			return "B-";
		} else if (point >= 78) {
			return "C+";
		} else if (point >= 72) {
			return "C";
		} else if (point >= 70) {
			return "C-";
		} else if (point >= 60) {
			return "D";
		} else
			return "F";
	}

	void addGrade(double aGrade) {
		if (!isValidGrade(aGrade))
			return;

		// 我喜歡你下面的這個寫法, +2, 非常有趣!
		Grades current_grade = new Grades(aGrade, null);
		current_grade.level = Asign_level(current_grade);
		all_grades.add(current_grade);
		sum = sum + current_grade.point;
	}

	void analyzeGrades() {
		Grades temp_grades[] = new Grades[all_grades.size()];
		all_grades.toArray(temp_grades);

		for (int i = 0; i < all_grades.size(); i++) {// count amount of each
														// level
			for (int j = 0; j < 11; j++) {
				if (temp_grades[i].level == level_list[j]) {
					level_count[j] = level_count[j] + 1;
				}
			}
		}

		average = Math.round(sum / all_grades.size());
		for (int k = 0; k < all_grades.size(); k++) {
			standard_deviation = standard_deviation
					+ (temp_grades[k].point - average) * (temp_grades[k].point - average);
		}
		standard_deviation = Math.round(Math.sqrt(standard_deviation / all_grades.size()));

	}

	public String toString() {
		String list = "";
		for (int i = 0; i < 11; i++) {
			list = list + level_list[i] + " = " + level_count[i] + "\n";
		}
		return "The grade distribution is:\n\n" + list;

	}
}
