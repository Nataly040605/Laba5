package utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Predicate;

import data.Organization;

public class CollectionManager {
	static public String initTime;
    private static TreeSet<Organization> collection;
    private String pathForFile = "";
    public CollectionManager() {
        collection = new TreeSet<>();
        initTime = new Date().toString();
    }
    public void add(Organization organization) {
        collection.add(organization);
    }

    public void clear() {
        collection.clear();
    }

    public int size() {
        return collection.size();
    }

    public String getInitTime() {
        return initTime;
    }

    public Organization last(){
        return collection.last();
    }

    public List<Organization> getAllElements(){
        return new ArrayList<>(collection);
    }

    public Iterator<Organization> iterator(){
        return collection.iterator();
    }

    public void removeIf(Predicate<Organization> filter) {
        Objects.requireNonNull(filter);
        collection.removeIf(filter);
    }

    public void setPathForFile(String path){
        pathForFile = path;
    }
    public String getPathForFile(){
        return pathForFile;
    }
}
