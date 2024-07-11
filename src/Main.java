/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class Main {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertsQuarter();
        gumballMachine.ejectsQuarter();
        gumballMachine.turnsCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.turnsCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertsQuarter();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();

        System.out.println(gumballMachine);
    }
}