package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(0, 0, 1, 0.5);
		StdDraw.setPenColor(51, 204, 255);
		StdDraw.filledRectangle(0.1, 0.1, 0.875, 0.375);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.setPenRadius(0.5);
		StdDraw.filledCircle(0.5, 0.25, 0.15);
	}
}