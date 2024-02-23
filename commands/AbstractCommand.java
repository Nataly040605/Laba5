package commands;

import java.util.List;

import utility.CollectionManager;

public abstract class AbstractCommand implements CommandInterface {
	final CollectionManager collectionManager;
    final int countOfArguments = 0;
    public AbstractCommand(CollectionManager collection) {
        collectionManager = collection;
    }

    @Override
    public abstract void execute(List<Object> arguments);

    public int getCountOfArguments(){
        return countOfArguments;
    }
}
