package commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import data.Organization;
import utility.CollectionManager;

public class Shuffle extends AbstractCommand{
	public Shuffle(CollectionManager collection) {
        super(collection);
    }
	@Override
    public void execute(List<Object> arguments) {
		
		List<String> elements = new ArrayList<>();

		
		for (Organization organization : collectionManager.getAllElements())
		System.out.println(Collections.shuffle(elements, new Random()));
		

	
	
}
}
