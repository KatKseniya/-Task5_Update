package by.epam.tc_npr.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberParser {
	private static final Pattern LINE_PATTERN = Pattern.compile("([^\\s]+?)\\s*?([^\\s]+?)\\s*?([+-/*])");
	private String delimeter = "\\s+?";
	
	public Data parse(String data) throws DataParserException {
		if(!validate(data)) {
			throw new DataParserException("validation exception");
		}

		Data dataBean = new Data();
		String[] strings = data.split(delimeter);
		if (strings.length == 3)
		{
			dataBean.setNumber1(Double.parseDouble(strings[0]));
			dataBean.setNumber2(Double.parseDouble(strings[1]));
			dataBean.setSign(Sign.parseSign(strings[2]));
		}

		return dataBean;
	}
	
	private boolean validate(String data) {
		return LINE_PATTERN.matcher(data).matches();
	}

}
