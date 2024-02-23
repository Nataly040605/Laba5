package commands;

import java.util.Iterator;
import java.util.List;

import data.Organization;
import utility.CollectionManager;

public class Remove_lower extends AbstractCommand{
	final int countOfArguments = 10;

    public Remove_lower(CollectionManager collection) {
        super(collection);
    }

    @Override
    public void execute(List<Object> arguments) {

        Iterator<Organization> iterator = collectionManager.iterator();
        Add add = new Add(this.collectionManager);
        try{
        	Organization organizationToCompare = add.createObject(arguments);
            while (iterator.hasNext()){
            	Organization organization = iterator.next();
                if (organization.compareTo(organizationToCompare)<0){
                    iterator.remove();
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
