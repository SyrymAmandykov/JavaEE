package app.servlets.sprint.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DbManagers {

    private static final List<Tasks> DATA_BASE_MANAGERS = new ArrayList<>();
    private static long idCursor = 1;

    public static List<Tasks> getAllTasks() {
        return DATA_BASE_MANAGERS;
    }

    public static void addTask(String name, String description, LocalDate deadlineDate) {
        Tasks newTask = new Tasks(idCursor,name,description,deadlineDate);
        DATA_BASE_MANAGERS.add(newTask);
        idCursor++;
    }

    public static Tasks getTask(Long id) {
        for (Tasks TaskObject: DATA_BASE_MANAGERS) {
            if (id.equals(TaskObject.getId())){
                return TaskObject;
            }
        }
        return null;
    }

    public static void deleteTask(Long id){
        for (Tasks object: DATA_BASE_MANAGERS) {
            if (id.equals(object.getId())){
                DATA_BASE_MANAGERS.remove(object);
                return;
            }
        }
    }

//    public static List<Tasks> updateTasks(long id,String name, String description, String deadlineDate){
//
//    }


}


