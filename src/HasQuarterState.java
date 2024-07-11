/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertsQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectsQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnsCrank() {
        System.out.println("You turned ...");
        gumballMachine.setState(gumballMachine.getGumballSoldState());
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball dispensed");
    }

}
