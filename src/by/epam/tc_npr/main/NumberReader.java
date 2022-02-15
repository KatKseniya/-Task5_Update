package by.epam.tc_npr.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberReader {
	
	private String path;
	private NumberParser parser;
	
	public NumberReader(String path) {
		this.path = path;
	}
	
	public NumberReader(String path, NumberParser parser) {
		this.path = path;
		this.parser = parser;
	}
	
	public NumberParser getParser() {
		return parser;
	}

	public void setParser(NumberParser parser) {
		this.parser = parser;
	}

	public List<Data> take() throws NumberParserException {
		
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		List<Data> result = new ArrayList<Data>();

		try {

			reader = new FileReader(path);
			bufferedReader = new BufferedReader(reader);

			String line = "";
			while (line != null) {
				line = bufferedReader.readLine();
				System.out.println("line = " + line);
				// read strings
				if (line != null) {
					Data newData = parser.parse(line);
					System.out.println("newData = " + newData);
					result.add(newData);
				}
			}


		}catch(FileNotFoundException e) {
			throw new NumberParserException(e);
		}catch(IOException e) {
			throw new NumberParserException(e);
		}catch(DataParserException e) {
			throw new NumberParserException(e);
		}finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					throw new NumberParserException(e);
				}
			}
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw new NumberParserException(e);
				}
			}
		}
		
		
		return result;
		
	}
	
}
