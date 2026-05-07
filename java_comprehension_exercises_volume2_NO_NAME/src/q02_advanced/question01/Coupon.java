package q02_advanced.question01;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return descriptionString
	 */
	public String getDescriptionString() {
		return description;
	}

	/**
	 * @param descriptionString セットする descriptionString
	 */
	public void setDescriptionString(String descriptionString) {
		this.description = descriptionString;
	}

	public Coupon() {

	}

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;

	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

}
