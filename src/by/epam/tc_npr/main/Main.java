package by.epam.tc_npr.main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		String fileIn = "C:/Users/Kseniya_Katselnikava/Desktop/file.txt";
		String fileOut = "C:/Users/Kseniya_Katselnikava/Desktop/test_result.txt";

		NumberReader nReader = null;
		NumberCalculator calculator = null;
		NumberWriter nWriter = null;
		
		List<Data> fileData = null;
		
		try {
			nReader = new NumberReader(fileIn, new NumberParser());
			fileData = nReader.take();
			
			calculator = new NumberCalculator(fileData);
			fileData = calculator.calc();

			nWriter = new NumberWriter(fileOut, fileData);
			nWriter.save();
			
		} catch (NumberParserException e) {
			// log
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
