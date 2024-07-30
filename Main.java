import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            String[] parts = command.split(" ", 3);

            switch (parts[0]) {
                case "add_classroom":
                    manager.addClassroom(parts[1]);
                    break;
                case "add_student":
                    manager.addStudent(parts[1], parts[2]);
                    break;
                case "schedule_assignment":
                    manager.scheduleAssignment(parts[1], parts[2]);
                    break;
                case "submit_assignment":
                    String[] subParts = parts[2].split(" ", 2);
                    manager.submitAssignment(parts[1], subParts[0], subParts[1]);
                    break;
                case "list_classrooms":
                    manager.listClassrooms();
                    break;
                case "list_students":
                    manager.listStudents(parts[1]);
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
