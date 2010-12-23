/**
 * 
 */
package com.np_compete.endless_edit;

/**
 * <p>An abstract representation of the article the collaborators are
 * working on</p>
 * 
 * @author axiomsofchoice
 *
 */
public class Article {

	/**
	 * 
	 */
	public Article(int articleLength) {
		this.length = articleLength ;
	}

	// The length of the document (measured in Unicode characters)
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
