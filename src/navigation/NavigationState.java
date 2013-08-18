package navigation;

import search.StateWithMap;

/**
 * A simple implementation of a State, using a single name string
 * as a unique identifier, and with all of its successor data stored in a Map.
 * 
 * Successors are added via the addSuccessor() method.
 * 
 * @author lackofcheese
 */
public class NavigationState extends StateWithMap {
	/** The name string. */
	String name;
	
	/**
	 * Constructor for the named state.
	 * @param name the name of the state
	 */
	public NavigationState(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * Returns the name of the state.
	 * @return the name of the state.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the name of the state.
	 * @return the name of the state.
	 */
	public String toString() {
		return name;
	}
}
