package com.marcelg.gewicht.report.processes;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReadUser ru = new ReadUser();
		ru.readUserData();

		ReadWeighing rw = new ReadWeighing();
		rw.readWeighingData();
	}

}
