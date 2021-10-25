package baseline;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private String name;
    private List<ToDoItem> toDoItems = new ArrayList<>();
    private boolean selected = false;

    //return this.name
    public String getName() {
        return null;
    }

    //removes item from toDoItems
    public void removeItem(ToDoItem item) {
    }

    //add item from toDoItems
    public String addItem(ToDoItem newItem) {
        return null;
    }

    //display list in GUI
    public void displayList(List<ToDoItem> items) {
    }

    //returns list of only completed items
    public List<ToDoItem> completedItems() {
        return null;
    }

    //returns list of only incomplete items
    public List<ToDoItem> incompleteItems() {
        return null;
    }

}
