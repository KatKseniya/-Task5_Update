package by.epam.tc_npr.main;

public class Data {
	
	private Number number1;
	private Number number2;
	private Sign sign;
	
	private Number result;

	public Number getNumber1() {
		return number1;
	}

	public void setNumber1(Number number1) {
		this.number1 = number1;
	}

	public Number getNumber2() {
		return number2;
	}

	public void setNumber2(Number number2) {
		this.number2 = number2;
	}

	public Sign getSign() {
		return sign;
	}

	public void setSign(Sign sign) {
		this.sign = sign;
	}

	public Number getResult() {
		return result;
	}

	public void setResult(Number result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Data{" +
				"number1=" + number1 +
				", number2=" + number2 +
				", sign=" + sign +
				", result=" + result +
				'}';
	}
}
