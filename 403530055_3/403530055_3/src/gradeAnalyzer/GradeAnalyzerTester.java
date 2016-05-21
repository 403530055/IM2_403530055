/*
 * [A]98
 * [TA's Advise]
 * 1. �S����Ӥj���D, �p���~�b�{���X�̭��ХܥX�ӤF, �ѦҤ@�U!
 * 2. �ګܳ��w�A���Distribution���g�k, ���D�`����! 
 * */

package gradeAnalyzer;

import javax.swing.*;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		String input = "";
		GradeAnalyzer gradeAnalyzer = new GradeAnalyzer();

		while (true) {

			input = JOptionPane.showInputDialog(null, "��J����");
			// equalsIgnoreCase�O���ޤj�p�g�����, �ҥH�g�@�ӴN�i�H�F.
			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("Q")) {
				break;
			}
			// �u�n���ϥΪ̿�J����������ĳ�n���ҥ~�B�z, -2.
			gradeAnalyzer.addGrade(Double.parseDouble(input));
		}

		// �ʤ֧P�_�O�_ <2, -2
		gradeAnalyzer.analyzeGrades();
		System.out.println("You entered " + gradeAnalyzer.all_grades.size()
				+ " Valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println("The average = " + String.format("%.0f", gradeAnalyzer.average)
				+ " with a standard deviation = " + String.format("%.0f", gradeAnalyzer.standard_deviation));
		System.out.println(gradeAnalyzer);
	}

}
