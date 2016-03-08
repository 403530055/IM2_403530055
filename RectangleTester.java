/*
 * [A]100
 * [TA's advise]
 * 1.�]���A�ĥ�user input���覡, ���M�Ѯv�٨S���Ш�exception, ���A�i�H�Q�Q�ݦp�G���ѨϥΪ̿�J�����O�Ʀr�ӬO�r�ꪺ�ܷ|���ͤ�����D?
 * 2.�t�~�A�`�@�K���ܼ�, �Q�Q�ݦ��S����k�i�H�ϥΤ���֪��ܼƥh�����o���u�@.
 * 3."\n"������, "\t"���w���I, �A�i�H�ոլ�println("\n")�L�X���, �i�H���A���{���󬰻��q�@��.
 * */
/*
 *JAVA HW1:RectangleTester
 *Author: ���J��
 *ID: 403530055
 *DATE: 2016/3/5
 */

package rectangle;

import java.util.Scanner;

class Rectangle{
	double x, y;
	double width, height;
	
	Rectangle(){
	}
	
	Rectangle(double _x, double _y, double _width, double _height){
		this.x = _x;
		this.y = _y;
		this.width = _width;
		this.height= _height;
	}
	
	double getWidth(){
		return this.width; 
	}
	
	double getHeight(){
		return this.height; 
	}
	
	
	public String toString() {
		return "java.Rectangle" + "[" + "x=" +  String.format("%.0f", this.x) + ",y=" + String.format("%.0f", this.y) + ",width=" + String.format("%.0f", this.width) + ",height=" + String.format("%.0f", this.height) + "] ";
	}
	
}

public class RectangleTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		double x1,y1,width1,height1;
		double x2,y2,width2,height2;
		
		System.out.println("Key in two groups of rectangle data below.");
		System.out.println("Rectangle1#");
		System.out.print("X1 = ");
		x1 = input.nextDouble();
		System.out.print("Y1 = ");
		y1 = input.nextDouble();
		System.out.print("Width1 = ");
		width1 =  input.nextDouble();
		System.out.print("Height1 = ");
		height1 = input.nextDouble();
		
		System.out.println("\rRectangle2#");
		System.out.print("X2 = ");
		x2 = input.nextDouble();
		System.out.print("Y2 = ");
		y2 = input.nextDouble();
		System.out.print("Width2 = ");
		width2 =  input.nextDouble();
		System.out.print("Height2 = ");
		height2 = input.nextDouble();
		
		System.out.println("");
		
		Rectangle r1 = new Rectangle(x1,y1,width1,height1);
		Rectangle r2 = new Rectangle(x2,y2,width2,height2);
		System.out.println(r1);
		System.out.println("Area = " + r1.getWidth()*r1.getHeight());
		System.out.println("Perimeter = " + 2*(r1.getWidth()+r1.getHeight()));
		System.out.println("");
		System.out.println(r2);
		System.out.println("Area = " + r2.getWidth()*r2.getHeight());
		System.out.println("Perimeter = " + 2*(r2.getWidth()+r2.getHeight()));
		System.out.println("");
		System.out.println("End of Output!");
	 
	}

}
