package commands;

import java.util.List;

import utility.CollectionManager;

public class Exit extends AbstractCommand{
	public Exit(CollectionManager collection) {
        super(collection);
    }

    @Override
    public void execute(List<Object> arguments) {
        System.out.println("Завершение выполнения");
    }
}
