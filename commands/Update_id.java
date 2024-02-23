package commands;

import java.util.List;

import data.Organization;
import utility.CollectionManager;

public class Update_id extends AbstractCommand{
	final int countOfArguments = 10;
		public Update_id(CollectionManager collection) {
		        super(collection);
		    }

		    @Override
		    public void execute(List<Object> arguments) {
		        for(Organization organization: CollectionManager.getAllElements()){
		            if(organization.getId() == (Integer) arguments.get(0)){
		            	organization.setId();
		            }
		        }
		    }
}
