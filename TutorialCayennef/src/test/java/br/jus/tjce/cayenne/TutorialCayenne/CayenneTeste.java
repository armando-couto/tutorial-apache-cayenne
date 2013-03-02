package br.jus.tjce.cayenne.TutorialCayenne;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.access.DataContext;

public class CayenneTeste {

	public static void main(String[] args) {
		
		ObjectContext context = DataContext.createDataContext();
		System.out.println(context.toString());
	}
}