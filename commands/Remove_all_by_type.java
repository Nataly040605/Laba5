package commands;

import java.util.Iterator;
import java.util.List;

import data.Organization;
import data.OrganizationType;
import utility.CollectionManager;

public class Remove_all_by_type extends AbstractCommand{
	final int countOfArguments = 1;

    public Remove_all_by_type(CollectionManager collection) {
        super(collection);
    }


    @Override
    public void execute(List<Object> arguments) {
    	OrganizationType type = OrganizationType.valueOf(((String) arguments.get(0)).toUpperCase());
        Iterator<Organization> iter = collectionManager.iterator();
        while (iter.hasNext()) {
            iter.next();
            Organization organization = (Organization) iter;
            if (organization.equalsByType(type)) {
                iter.remove();
            }
        }
    }
}
