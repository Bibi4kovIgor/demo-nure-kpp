package action;

import model.CulturalIdentity;
import model.Human;

/**
 * The type Social actions.
 */
public class SocialActions {
	private final Human human;

	/**
	 * Instantiates a new Social actions.
	 *
	 * @param human
	 * 		the human
	 */
	public SocialActions(Human human) {
		this.human = human;
	}

	/**
	 * Make child of human.
	 *
	 * @param name
	 * 		the name
	 * @return the human
	 */
	public Human makeChild(String name) {
		return new Human(CulturalIdentity.EMPTY_OBJECT, name, 0);
	}

	/**
	 * Gets parent.
	 *
	 * @param name
	 * 		the name
	 * @return the parent
	 */
	public Human getParent(String name) {
		return human;
	}

	@Override
	public String toString() {
		return "SocialActions{" + "human=" + human + '}';
	}
}
