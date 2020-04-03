package lsystems;

/**
 * Subclass of LRule. This rule requires a char value of 'C' and replaces
 *  it with a character  array ['B'].
 *  
 * @author DeerByte
 *
 */
public class C_B extends LRule {

	public static final char MATCH = 'C';
	public static final char[] BODY = {'B'};
	
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
