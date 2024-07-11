/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class GumballMachine {
    private State gumballSoldState;
    private State hasQuarterState;
    private State noQuarterState;
    private State outOfGumballsState;
    private State state;
    private int gumballCount;

    public GumballMachine(int gumballCount) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        gumballSoldState = new GumballSoldState(this);
        outOfGumballsState = new OutOfGumballsState(this);

        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            this.state = noQuarterState;
        } else {
            this.state = outOfGumballsState;
        }
    }

    public void insertsQuarter() {
        state.insertsQuarter();
    }

    public void ejectsQuarter() {
        state.ejectsQuarter();
    }

    public void turnsCrank() {
        state.turnsCrank();
        state.dispenseGumball();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        gumballCount--;
    }

    public State getGumballSoldState() {
        return gumballSoldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getOutOfGumballsState() {
        return outOfGumballsState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + gumballCount + " gumball");
        if (gumballCount != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
