/**
 * 
 */
package com.np_compete.endless_edit;

import java.util.Collection;
import java.util.Iterator;

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
public class Collaboration implements Collection {

	// The collection of collaborators
	
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

	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
