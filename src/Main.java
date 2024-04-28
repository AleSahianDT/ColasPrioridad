import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PriorityQueue<Integer>numeros = new PriorityQueue<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(-2);
        numeros.add(1);
        numeros.add(10);
        numeros.add(4);
        numeros.add(8);
        numeros.add(-10);
        for (Integer i:numeros){
            System.out.println(i);
        }
    }
}