package lsystems;

import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * This class represents a Lindenmayer-System (L-System). 
 * 
 * It allows the manipulation of symbol sequences, using the LRules class objects 
 *  and a starting sequence of characters. 
 *  
 * @author Unknown
 *
 */
public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	/**
	 * Constructor. Initialises the LLine object. Requires a starting 
	 * sequence of characters, and a Set of LRules.
	 * 
	 * 
	 * @param start - An array of characters representing the initial symbol sequence.
	 * 
	 * @param rules - A Set of LRules that dictate the L-System behaviour.
	 * 
	 */
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	/**
	 * Processes one cycle of the system, altering the character sequence in accordance with the rules Set<>.
	 * Each LRule is applied at the same time, meaning no rule will change the sequence from another rule.
	 * 
	 * Requires that each symbol has only one matching LRule.
	 * 
	 * @throws LSystemSymbolException - Exception thrown when there are symbols without an LRule.
	 * 
	 * @throws LSystemLengthException - Exception thrown when there are no symbols to process.
	 * 
	 * @author DeerByte
	 */
	public void process() throws LSystemSymbolException, LSystemLengthException {
		if (lineHasInvalidChar()) {
			throw new LSystemSymbolException("Invalid char in sequence!", getInvalidChar());
			
		} else if (line.length == 0) {
			throw new LSystemLengthException("No char in sequence!");
			
		}
		
		ArrayList<Character> newLine = new ArrayList<Character>();
		
		for (int index = 0; index < line.length; index++) {
			Iterator<LRule> itr = rules.iterator();
			
			while(itr.hasNext()) {
				LRule rule = (LRule) itr.next();
				
				if (Character.valueOf(rule.getMatch()).equals(line[index])) {
					char[] body = rule.getBody();
					
					for (int i = 0; i < rule.getBody().length; i++) {
						newLine.add(body[i]);
					}
				}
			}
			
		}
		line = listToArray(newLine);
		
	}
	
	
	/**
	 * Converts a List of Characters into an array of characters. 
	 * @param list - List of Characters
	 * @return chars[] - returns an array representation of the list.
	 */
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}
	
	/**
	 * Returns true if the line array has an Character without a matching LRule.
	 * @return boolean
	 */
	private boolean lineHasInvalidChar() {
		ArrayList<Character> list = getValidCharList();
		
		for (int index = 0; index < line.length; index++) {
			if (!list.contains(line[index])) {
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Retrieves the invalid character for the LSystemSymbolException from the character sequence (line).
	 * @return char
	 */
	private char getInvalidChar() {
		ArrayList<Character> validChar = getValidCharList();
		char invalidSymbol = '_';
		
		for (int index = 0; index < line.length; index++) {
			
			if (!validChar.contains(line[index])) {
				invalidSymbol = line[index];
				break;
			}
		}
		
		return invalidSymbol;
	}
	
	/**
	 * Creates and returns a list of characters that each have a rule.
	 * 
	 * @return ArrayList<Character>
	 */
	private ArrayList<Character> getValidCharList() {
		ArrayList<Character> validChar = new ArrayList<Character>();
		Iterator<LRule> itr = rules.iterator();
		
		while (itr.hasNext()) {
			LRule rule = (LRule) itr.next();
			validChar.add(rule.getMatch());
			}
		
		return validChar;
	}

	/**
	 * Returns a String representation of the current character sequence. 
	 * @return String
	 */
	@Override
	public String toString() {
		
		return new String(line);
	}
	
}
