package app.servlets.task2;


import java.util.ArrayList;
import java.util.List;

public class DataBase{
    private final List<Employee> db;

    public DataBase() {
        db = new ArrayList<>();
        db.add(new Employee("Zhandos", "Esengaziev", "IT", 10L));
        db.add(new Employee("Zhansaya", "Kulbaeva", "IT", 10L));
    }

    public List<Employee> getDb() {
        return db;
    }
}
