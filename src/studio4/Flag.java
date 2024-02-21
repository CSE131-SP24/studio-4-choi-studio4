package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

public class Flag {
	public static void main() {
		   StdDraw.clear();
		   StdDraw.setPenColor(StdDraw.BLACK);
		   StdDraw.filledSquare(3, 9, 3);
		   double[] x = {0,0,3.0};
		   double[] y = {3.0,6.0,6.0};
		   StdDraw.filledPolygon(x,y);
		   double[] x2 = {3,6,6};
		   double[] y2 = {6,3,6};
		   StdDraw.filledPolygon(x2,y2);
		   
		   StdDraw.setPenColor(255, 0, 0);
		   StdDraw.filledCircle(3, 9, 1.5);
		   StdDraw.filledSquare(0, 0, 0);
		   
		   StdDraw.setPenColor(78,91,49);
		   StdDraw.filledRectangle(12, 9, 6, 3);
		   
		   //Frame the flag
		   StdDraw.setPenColor(StdDraw.BLACK);
		   StdDraw.rectangle(8, 6, 10, 6);
	}
	public static void flag() {
		StdDraw.setXscale(0, 18);
		StdDraw.setYscale(0, 12);
		main();
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			flag();
		});
	}
}