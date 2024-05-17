package homework2.task3;

public class Runnable {
    public static void main(String[] args) {
        Computer.Processor processor = new Computer.Processor();
        System.out.println(processor.getDetails());

        System.out.println();

        Computer.RAM ram = new Computer().new RAM();
        System.out.println(ram.getDetails());
    }
}
