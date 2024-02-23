package commands;

import java.util.List;

import data.Organization;
import utility.CollectionManager;

public class Show extends AbstractCommand{
	public Show(CollectionManager collection) {
        super(collection);
    }
    
    @Override
    public void execute(List<Object> arguments) {
        for (Organization organization : collectionManager.getAllElements()) {
            System.out.println(organization.toString());
        }
    }
}
