package lsystems;

/**
 * Subclass of LRule. This rule requires a char value of 'A' and replaces
 *  it with an empty character array. This rule is used to remove 'A' from the sequence
 *  
 * @author DeerByte
 *
 */
public class A_X extends LRule {
	public static final char MATCH = 'A';
	public static final char[] BODY = {};
	
	/**
	 * Returns a char representation of the character which must match for the rule to apply.
	 * 
	 * @return char - The character that must match for the rule to apply
	 */
	@Override
	public char getMatch() {
		
		return MATCH;
	}

	/**
	 * Returns the array of characters this rule creates.
	 * 
	 * @return char[] - The character(s) that will replace the match character.
	 */
	@Override
	public char[] getBody() {
		return BODY;
	}

}
