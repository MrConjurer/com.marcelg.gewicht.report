package com.marcelg.gewicht.report.processes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWeighing {
	public void readWeighingData() {
		try {
			BufferedReader in = new BufferedReader(new FileReader("DATA1.CSV"));
			String zeile = null;
			while ((zeile = in.readLine()) != null) {
				System.out.println("Gelesene Zeile: " + zeile);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
