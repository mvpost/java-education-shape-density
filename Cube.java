public class Cube extends BaseShape {
	final private Integer length;
	public Cube(Integer weight, Integer length) {
		super(weight);
		this.length = length;
	}
	@Override
	protected double calculateVolume() {
		return Math.pow(length, 3);
	}
}
