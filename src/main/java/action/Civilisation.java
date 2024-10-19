package action;

import model.CulturalIdentity;
import model.Human;

import java.util.ArrayList;
import java.util.List;

public class Civilisation {
	private final List<Human> people;

	public Civilisation() {
		people = new ArrayList<>();
	}

	public Civilisation(List<Human> people) {
		this.people = people;
	}

	public List<Human> getPeople() {
		return new ArrayList<>(people);
	}

	public void civilisate() {
		people.add(new Human(CulturalIdentity.EMPTY_OBJECT, "Peter", 28));
		people.add(new Human(CulturalIdentity.EMPTY_OBJECT, "Marta", 26));
		people.add(new Human(CulturalIdentity.EMPTY_OBJECT, "Johnee", 10));
	}

	@Override
	public String toString() {
		return "Civilisation{" + "people=" + people + '}';
	}
}
