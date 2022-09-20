import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {

        Queue<String> students = new LinkedList<>();
        students.add("Ma. Teresa Jesmari Erl Labon");
        students.add("Bablis, Winna Jane");
        students.add("Valencia, Jamil");
        students.add("Jalalon, James Francis");
        students.add("Paller, Richael");

        System.out.print("QUEUE SIZE: ");
        System.out.print(students.size());
        System.out.println("");
        System.out.print("Front: ");
        System.out.print(students.peek() + "\n");
        System.out.println("----------------");

        int i = 5;
        while (i>0){
            System.out.println("Dequeueing: " + students.peek());
            students.remove();
            i--;
        }
        
        students.add("Vargas, Jethro Ruiz");
        students.add("Rifarial, Neil");
        students.add("Saavedra, Vincent Paul");
        students.add("Almocera, Alliyah");
        students.add("Gonzales, Marvin John");

        System.out.print("QUEUE SIZE: ");
        System.out.print(students.size());
        System.out.println("");
        System.out.print("Front: ");
        System.out.print(students.peek() + "\n");
        System.out.println("----------------");
    }
}
