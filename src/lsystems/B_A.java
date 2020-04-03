package lsystems;
/**
 * Subclass of LRule. This rule requires a char value of 'B' and replaces
 *  it with a char array ['A'].
 *  
 * @author DeerByte
 *
 */
public class B_A extends LRule {

	public static final char MATCH = 'B';
	public static final char[] BODY = {'A'};
	
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
