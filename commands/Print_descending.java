package commands;

import java.util.ArrayList;
import java.util.List;

import data.Organization;
import utility.CollectionManager;

public class Print_descending extends AbstractCommand{
	public Print_descending(CollectionManager collection) {
        super(collection);
    }

    @Override
    public void execute(List<Object> arguments) {

        List<String> fields = new ArrayList<>();

        for (Organization organization: CollectionManager.getAllElements()) {
            fields.add(organization.getAllElements());
        }
        System.out.println("test");
        for (int i =fields.size()-1;i>0;i--){
            System.out.println(fields.get(i));
        }
    }
}
