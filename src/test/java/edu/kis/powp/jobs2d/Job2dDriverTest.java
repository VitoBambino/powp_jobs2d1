package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.adapter.ComplexCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;

/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class Job2dDriverTest {
	private static Job2dDriver driver = new StubDriver();

	/**
	 * Driver test.
	 */
	public static void main(String[] args) {
		ArrayList<DriverCommand> commands = new ArrayList<DriverCommand>();
		FiguresJoe.figureScript1(driver);
	}

	private static class StubDriver implements Job2dDriver {

		@Override
		public void operateTo(int x, int y) {
			System.out.println("Driver operateTo action...");
		}

		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
		}
	};
}
