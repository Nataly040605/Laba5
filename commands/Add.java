package commands;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import data.Address;
import data.Coordinates;
import data.Location;
import data.Organization;
import data.OrganizationType;
import utility.CollectionManager;
import utility.Console;

public class Add extends AbstractCommand{
	final int countOfArguments = 10;
    
    public Add(CollectionManager collection){
        super(collection);
    }
    public int getCountOfArguments() {
        return countOfArguments;
    }
    public void execute(List<Object> arguments) {
    	Organization organization = createObject(arguments);
        if (Console.getReadFromFileStatus()) {
            if (organization == null) {
                System.out.println("Ошибка входных данных в скрипте, файл не был создан");
            } else {
                collectionManager.add(organization);
                System.out.println("Объект был создан\n");
            }
        } else {
            collectionManager.add(organization);
            System.out.println("Объект был создан\n");
        }
    }
    protected Organization createObject(List<Object> arguments) throws NullPointerException{
        int i = 0;
        try {
            String name = (String) arguments.get(i++);
            long annualTurnover = (long) arguments.get(i++);
            double coordinatesX = (double) arguments.get(i++);
            long coordinatesY = (long) arguments.get(i++);
            Coordinates coordinates = new Coordinates(coordinatesX, coordinatesY);
            OrganizationType type = (OrganizationType) arguments.get(i++);
            LocalDateTime localDateTime = ((LocalDate) arguments.get(i++)).atStartOfDay();
            String street = (String) arguments.get(i++);
            String zipCode = (String) arguments.get(i++);
            Location town = (Location) arguments.get(i);
            Address postalAddress = new Address(street, zipCode, town);
            return new Organization(name, coordinates, annualTurnover, type, postalAddress);
        } catch (Exception e) {
            System.out.println("Неправильные входные данные. Объект не был создан");
            throw new NullPointerException();
        }
    }
}
