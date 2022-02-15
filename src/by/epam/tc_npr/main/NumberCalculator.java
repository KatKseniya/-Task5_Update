package by.epam.tc_npr.main;

import java.util.List;

public class NumberCalculator {

	private List<Data> list;

	public NumberCalculator() {

	}

	public NumberCalculator(List<Data> list) {
		this.list = list;
	}

	public List<Data> getList() {
		return list;
	}

	public void setList(List<Data> list) {
		this.list = list;
	}

	public List<Data> calc() {

		for (Data data : list) {
			calc(data);
		}
		return list;
	}

	private void calc(Data data)
	{
		Number result;
		if (data.getSign() == Sign.PLUS)
		{
			result = data.getNumber1().doubleValue() + data.getNumber2().doubleValue();
		}
		else if (data.getSign() == Sign.MINUS)
		{
			result = data.getNumber1().doubleValue() - data.getNumber2().doubleValue();
		}
		else if (data.getSign() == Sign.MULTIPLY)
		{
			result = data.getNumber1().doubleValue() * data.getNumber2().doubleValue();
		}
		else
		{
			throw new UnsupportedOperationException(data.getSign() + " sing isn't supported.");
		}
		data.setResult(result);
	}

}
