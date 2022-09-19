public class App {
    public static void main(String[] args) throws Exception {
        Stack  cookieJar= new Stack(5);

        cookieJar.push("Chips Ahoy");
        cookieJar.push("Oreo");
        cookieJar.push("Cream-O");
        cookieJar.push("Chips Delight");

        System.out.println("Current size: " + cookieJar.size());
        System.out.println("---------------------");

        System.out.println("Top: " + cookieJar.peek());
        System.out.println("---------------------");

        cookieJar.pop();
        System.out.println("---------------------");
        
        System.out.println("Post-pop:");

        cookieJar.printStack();

        System.out.println("---------------------");

        System.out.println("The top of the stack is: " + cookieJar.peek());

        System.out.println("---------------------");
        
    }
}