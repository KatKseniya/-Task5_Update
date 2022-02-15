package by.epam.tc_npr.main;

public enum Sign {
	PLUS("+"), MINUS("-"), MULTIPLY("*");

	private final String sign;

	Sign(String sign) {
		this.sign = sign;
	}

	public String getSign() {
		return sign;
	}

	public static Sign parseSign(String signStr)
	{
		Sign result = null;
		for (Sign sign : Sign.values()) {
			if (sign.getSign().equals(signStr))
			{
				result = sign;
			}
		}
		if (result == null)
		{
			throw new UnsupportedOperationException(signStr + " sing isn't supported.");
		}
		return result;
	}
}
