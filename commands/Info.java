package commands;

import java.util.List;

import utility.CollectionManager;

public class Info extends AbstractCommand{
	public Info(CollectionManager collection) {
        super(collection);
    }
	@Override
    public void execute(List<Object> arguments) {

        String s = "Type of Collection - TreeSet" + "\n" +
                "Date of init - " + collectionManager.getInitTime() + "\n" +
                "Count of object in Collection - " + collectionManager.size();

        System.out.println(s);

    }
}
