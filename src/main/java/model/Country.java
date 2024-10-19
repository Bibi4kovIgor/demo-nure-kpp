package model;

public record Country(String name, double latitude, double longitude) {
	public Country() {
		this("N/A", 0.0, 0.0);
	}

	public static Country defaultCountry() {
		return new Country("N/A", 0.0, 0.0);
	}
}
