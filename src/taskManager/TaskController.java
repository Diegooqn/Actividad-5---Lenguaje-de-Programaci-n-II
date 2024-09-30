package taskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskController {
    private List<Task> tasks;
    private TaskView view;

    public TaskController(TaskView view) {
        this.tasks = new ArrayList<>();
        this.view = view;
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
        view.showMessage("Tarea agregada con éxito.");
    }

    public void editTask(int index, String newTitle, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            view.showMessage("Tarea editada con éxito.");
        } else {
            view.showMessage("Índice de tarea inválido.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            view.showMessage("Tarea eliminada.");
        } else {
            view.showMessage("Índice de tarea inválido.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            view.showMessage("Tarea marcada como completada.");
        } else {
            view.showMessage("Índice de tarea inválido.");
        }
    }

    public void showTasks() {
        view.displayTasks(tasks);
    }

    public void showMenu() {
        view.showMenu();
    }
}
