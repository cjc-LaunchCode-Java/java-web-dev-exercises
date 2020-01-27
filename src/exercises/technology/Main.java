package exercises.technology;

public class Main {
    public static void main(String[] args) {
        Laptop mine = new Laptop("Carol", "Windows 10", false, 8.0);
        System.out.println(mine);

        mine.boughtNewScreen(true);
        System.out.println(mine);
        mine.addMemory(4.0);
        System.out.println(mine.getMemory());
    }


}
