package com.company.junit5.util;

/**
 * <code>MathsException</code> is thrown during any exceptional condition for all static methods of the utility <code>Maths</code> class.
 */
public class MathsException extends Exception {

	private static final long serialVersionUID = 1L;
	
    /**
     *
     * @param s
     */
    public MathsException(String s) {
        super(s);
    }

}

