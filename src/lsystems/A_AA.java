package lsystems;
/**
 * Subclass of LRule, this rule requires a char value of 'A' and replaces the match with a body of ['A', 'A'].
 * 
 * @author DeerByte
 *
 */
public class A_AA extends LRule {

	public static final char MATCH = 'A';
	public static final char[] BODY = {'A', 'A'};
	
	/**
	 * Returns a char representation of the character which must match for the rule to apply.
	 * @return char - The character that must match for the rule to apply
	 */
	@Override
	public char getMatch() {
		
		return MATCH;
	}

	/**
	 * Returns the array of characters this rule creates.
	 * @return char[] - The body character(s) that will replace the match character.
	 */
	@Override
	public char[] getBody() {
		return BODY;
	}

}
