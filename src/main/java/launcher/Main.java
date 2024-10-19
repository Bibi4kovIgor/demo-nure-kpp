package launcher;

import action.Civilisation;
import action.SocialActions;
import model.Country;
import model.CulturalIdentity;
import model.Human;
import utils.GlobalConstants;

import java.util.List;

/**
 * The type Main.
 */
public class Main {
	/**
	 * The entry point of application.
	 *
	 * @param args
	 * 		the input arguments
	 */
	public static void main(String[] args) {
		System.out.println(GlobalConstants.TEST_DATA);

		Human parent = new Human(CulturalIdentity.EMPTY_OBJECT, "Ihor", 32);
		SocialActions socialActions = new SocialActions(parent);
		Human child = socialActions.makeChild("Lev");

		System.out.println(parent + " has child " + child);

		Civilisation civilisation = new Civilisation();
		civilisation.civilisate();
		System.out.println(civilisation);

		List<Human> people = civilisation.getPeople();
		people.add(parent);
		System.out.println("people var " + people);

		System.out.println(civilisation);

		CulturalIdentity culturalIdentity = CulturalIdentity.builder()
				.population(1)
				.country(Country.defaultCountry())
				.build();

		System.out.println(culturalIdentity);

		CulturalIdentity ukrainian = CulturalIdentity.builder()
				.name("Ukrainian")
				.population(52000000)
				.country(new Country("Ukraine",50.27,30.30))
				.ILR(1)
				.avgHighness(180f)
				.build();

		System.out.println(ukrainian);

	}
}
