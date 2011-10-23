/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc215project1;

import java.util.ArrayList;
import java.util.HashMap;
import edu.clemson.cs.hamptos.adventure.*;

/**
 *
 * @author amalvag
 */
public class Person extends Target {

	

    public Person(String name, String desc, ArrayList<String> b, HashMap<String, String> d, ArrayList<String> a) {
	super(name, desc, b, d, a);
    }

    public void doCommandTo(
            AdventureCommand c,
            AdventureEngine e,
            AdventureWindow w) throws DoNotUnderstandException {
        if(myIndirectObjectCommands.contains(myDirectObjectCommands.get(c.getVerb()))
                && myDirectObjectCommands.get(c.getVerb()).equals("examine")){
            System.out.println(c.getDirectObjectInvocation());
            new ExamineStrategy().doCommand(c,e,w);
        }
    }

    public void doCommandWith(AdventureCommand c, AdventureEngine e, AdventureWindow w) throws DoNotUnderstandException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
