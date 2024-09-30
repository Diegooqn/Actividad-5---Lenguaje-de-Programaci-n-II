package taskManager;

import java.util.List;

public class TaskView {

    public void displayTasks(List<Task> tasks) {
        System.out.println("\nLista de tareas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("Opciones:");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Editar tarea");
        System.out.println("3. Eliminar tarea");
        System.out.println("4. Marcar tarea como completada");
        System.out.println("5. Ver tareas");
        System.out.println("6. Salir");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}