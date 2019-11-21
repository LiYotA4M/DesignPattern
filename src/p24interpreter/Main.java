package p24interpreter;

public class Main {
    public static void main(String[] args) {
        String text = "program repeat 4 go right end end";
        System.out.println("text = \"" + text + "\"");
        Node node = new ProgramNode();
        try {
            node.parse(new Context(text));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("node = " + node);
    }
}
