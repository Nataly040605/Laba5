package commands;

import java.util.List;

import data.Organization;
import utility.CollectionManager;

public class Add_if_min extends Add{
	final int countOfArguments = 10;


    public Add_if_min(CollectionManager collection) {
        super(collection);
    }

    @Override
    public void execute(List<Object> arguments) {
    	Organization organization = createObject(arguments);
        if (collectionManager.last().compareTo(organization)<0){
            collectionManager.add(organization);
        }
    }
}
