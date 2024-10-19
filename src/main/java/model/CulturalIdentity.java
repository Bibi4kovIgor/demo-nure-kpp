package model;

import java.util.Objects;

public class CulturalIdentity {
	public static final CulturalIdentity EMPTY_OBJECT = CulturalIdentity.builder()
			.country(new Country())
			.name("World")
			.population(1)
			.build();

	private String name;
	private Country country;
	private long population;
	private int ILR;
	private float avgHighness;

	private CulturalIdentity() {}

	public String getName() {
		return name;
	}

	public Country getCountry() {
		return country;
	}

	public long getPopulation() {
		return population;
	}

	public int getILR() {
		return ILR;
	}

	public float getAvgHighness() {
		return avgHighness;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CulturalIdentity that = (CulturalIdentity) o;
		return population == that.population && ILR == that.ILR && Float.compare(avgHighness,
				that.avgHighness) == 0 && Objects.equals(name, that.name) && Objects.equals(country, that.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, country, population, ILR, avgHighness);
	}

	@Override
	public String toString() {
		return "CulturalIdentity{" + "name='" + name + '\'' + ", country=" + country + ", population=" + population + ", ILR=" + ILR + ", avgHighness=" + avgHighness + '}';
	}

	public static CulturalIdentityBuilder builder() {
		return new CulturalIdentityBuilder();
	}


	public static final class CulturalIdentityBuilder {

		private final CulturalIdentity culturalIdentity;

		private CulturalIdentityBuilder() {
			culturalIdentity = new CulturalIdentity();
		}


		public CulturalIdentityBuilder name(String name) {
			culturalIdentity.name = name;
			return this;
		}

		public CulturalIdentityBuilder country(Country country) {
			culturalIdentity.country = country;
			return this;
		}

		public CulturalIdentityBuilder population(long population) {
			culturalIdentity.population = population;
			return this;
		}

		public CulturalIdentityBuilder ILR(int ILR) {
			culturalIdentity.ILR = ILR;
			return this;
		}

		public CulturalIdentityBuilder avgHighness(float avgHighness) {
			culturalIdentity.avgHighness = avgHighness;
			return this;
		}

		public CulturalIdentity build() {
			if(Objects.isNull(culturalIdentity.name) || culturalIdentity.name.isEmpty() || culturalIdentity.name.isBlank()
					|| Objects.isNull(culturalIdentity.country) || culturalIdentity.population <= 0) {
				throw new IllegalArgumentException("Name and country are required and population must be non-null");
			}
			return culturalIdentity;
		}
	}
}
