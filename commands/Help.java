package commands;

import java.util.ArrayList;
import java.util.List;

import utility.CollectionManager;

public class Help extends AbstractCommand{
	public Help(CollectionManager collection) {
        super(collection);
    }
	@Override
    public void execute(List<Object> arguments) {
        List<Object> help = new ArrayList<>();
        help.add("help : вывести справку по доступным командам");
        help.add("info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
        help.add("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        help.add("add {element} : добавить новый элемент в коллекцию");
        help.add("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
        help.add("remove_by_id id : удалить элемент из коллекции по его id");
        help.add("clear : очистить коллекцию");
        help.add("save : сохранить коллекцию в файл");
        help.add("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
        help.add("exit : завершить программу (без сохранения в файл)");
        help.add("add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
        help.add("shuffle : перемешать элементы коллекции в случайном порядке");
        help.add("remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный");
        help.add("remove_all_by_type type : удалить из коллекции все элементы, значение поля type которого эквивалентно заданному");
        help.add("filter_contains_name name : вывести элементы, значение поля name которых содержит заданную подстроку");
        help.add("print_descending : вывести элементы коллекции в порядке убывания");
        for (Object string : help) {
            System.out.println(string);
        }
    }
}
