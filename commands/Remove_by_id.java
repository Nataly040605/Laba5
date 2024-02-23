package commands;

import java.util.List;

import data.Organization;
import utility.CollectionManager;

public class Remove_by_id extends AbstractCommand{
	final int countOfArguments = 1;

    public Remove_by_id(CollectionManager collection) {
        super(collection);
    }

    @Override
    public void execute(List<Object> arguments) {

        collectionManager.removeIf(organization -> organization.getId() == (Integer) arguments.get(0));
    }
}
