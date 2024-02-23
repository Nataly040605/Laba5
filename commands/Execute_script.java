package commands;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utility.CollectionManager;
import utility.Console;

public class Execute_script extends AbstractCommand{
	final int countOfArguments = 1;
    static final List<Path> pathList = new ArrayList<>(); // почему не HashSet?

    public Execute_script(CollectionManager collection) {
        super(collection);
    }

    @Override
    public void execute(List<Object> arguments) {
        String filePath = (String) arguments.get(0);
        try {
            Path path = Paths.get(filePath.replace("/","//"));
            if(!pathList.contains(path)) {
                Console.scannerIn = new Scanner(path);
                Console.setReadFromFileStatus(true);
                pathList.add(path);
            }else{
                System.out.println("Данный скрипт уже запущен");
            }
        }catch (Exception e){
            System.out.println("Wrong path for command");
        }
    }

    static public void deleteLastPath(){
        pathList.remove(pathList.size()-1);
    }
}
