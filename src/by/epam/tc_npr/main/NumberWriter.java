package by.epam.tc_npr.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NumberWriter {
	private String path;
	private List<Data> data;
	
	public NumberWriter(String path, List<Data> data) {
		this.path = path;
		this.data = data;
	}
	
	public boolean save() throws NumberParserException {

		FileWriter writer = null;
		try {
			writer = new FileWriter(path);
			for (Data line : data) {
				writer.write(format(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					throw new NumberParserException(e);
				}
			}
		}
		return true;
	}


	private String format(Data d) {
		return d.getNumber1() + " " + d.getSign().getSign() + " " + d.getNumber2() + " = " + d.getResult() + "\n";
	}
}
