package commands;

import java.util.List;

import utility.CollectionManager;

public class Clear extends AbstractCommand{
	public Clear(CollectionManager collection) {
        super(collection);
    }

    public int getCountOfArguments() {
        return 0;
    }

    @Override
    public void execute(List<Object> arguments) {
        collectionManager.clear();

    }
}
