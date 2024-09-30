package taskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view);
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            controller.showMenu();
            System.out.print("Elige una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el título de la tarea: ");
                    String title = scanner.nextLine();
                    System.out.print("Ingresa la descripción de la tarea: ");
                    String description = scanner.nextLine();
                    controller.addTask(title, description);
                    break;
                case 2:
                    controller.showTasks();
                    System.out.print("Ingresa el número de la tarea a editar: ");
                    int editIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Nuevo título: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Nueva descripción: ");
                    String newDescription = scanner.nextLine();
                    controller.editTask(editIndex, newTitle, newDescription);
                    break;
                case 3:
                    controller.showTasks();
                    System.out.print("Ingresa el número de la tarea a eliminar: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    controller.deleteTask(deleteIndex);
                    break;
                case 4:
                    controller.showTasks();
                    System.out.print("Ingresa el número de la tarea a marcar como completada: ");
                    int completeIndex = scanner.nextInt() - 1;
                    controller.markTaskAsCompleted(completeIndex);
                    break;
                case 5:
                    controller.showTasks();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
