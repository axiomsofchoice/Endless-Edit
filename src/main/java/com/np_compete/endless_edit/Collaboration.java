/**
 * 
 */
package com.np_compete.endless_edit;

/**
 * <p>A collaboration is collection of collaborators. As such
 * it is the responsibility of the collaboration object to
 * oversee the operation of the project. For instance, the
 * collaboration object will enforce the access control
 * constraints the ensure collaborators can only write to
 * the parts of the document to which they are assigned
 * as well as assign appropriate positions to new
 * collaborators and .</p>
 * 
 * <p>When a new collaborator is added to the system the
 * collaboration object must ensure that.</p>
 * 
 * @author axiomsofchoice
 *
 */
public class Collaboration {

	private Collaboration(int articleLength) {
		this.article = new Article(articleLength) ;
	}

	// The collection of collaborators
	
	// The document the collaborators are working on
	Article article ;
	
	/**
	 * Obtain a copy of the current state of the document by
	 * piecing together the components from each of the
	 * collaborators.
	 */
	
	/**
	 * <p>A factory method that will find a suitable location
	 * to add the new collaborator, construct a new collaborator
	 * object and add them to the collaboration.</p>
	 */
	Collaborator AddCollaborator(String userId) {
		Collaborator collaborator = new Collaborator() ;
		return collaborator ;
	}


}
