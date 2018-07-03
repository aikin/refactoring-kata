package me.aikin.refactoring.state.pattern;

public class GumballMachine {
    public final String insertedQuarterMessage = "insertedQuarterMessage";
    private final String soldOutMessage = "soldOutMessage";
    private final String soldMessage = "soldMessage";
    private final String soldCorrectMessage = "soldCorrectMessage";
    private final String hasQuarterMessage = "hasQuarterMessage";
    private final String NoQuarterMessage = "NoQuarterMessage";
    private final String noGumballMessage = "noGumballMessage";
    private final String dispenseSuccessMessage = "dispenseSuccessMessage";
    private final String ejectSuccessMessage = "ejectSuccessMessage";

    private int GumballNum;
    private MachineStatus State;

    public GumballMachine(int gumballNum, MachineStatus machineStatus) {
        GumballNum = gumballNum;
        State = machineStatus;
    }


    public int getGumballNum() {
        return GumballNum;
    }

    public void setGumballNum(int gumballNum) {
        GumballNum = gumballNum;
    }

    public MachineStatus getState() {
        return State;
    }

    public void setState(MachineStatus state) {
        State = state;
    }


    public String insertQuarter() {
        if (State == MachineStatus.SOLD)
            return soldMessage;
        if (State == MachineStatus.SOLD_OUT)
            return soldOutMessage;
        if (State == MachineStatus.HAS_QUARTER)
            return hasQuarterMessage;

        State = MachineStatus.HAS_QUARTER;
        return insertedQuarterMessage;
    }

    public String turnCrank() {
        if (State == MachineStatus.SOLD)
            return soldMessage;
        if (State == MachineStatus.NO_QUARTER)
            return NoQuarterMessage;
        if (State == MachineStatus.SOLD_OUT)
            return soldOutMessage;

        State = MachineStatus.SOLD;
        return soldCorrectMessage;
    }

    public String dispense() {
        if (State == MachineStatus.NO_QUARTER)
            return NoQuarterMessage;
        if (State == MachineStatus.HAS_QUARTER)
            return hasQuarterMessage;
        if (State == MachineStatus.SOLD_OUT)
            return soldOutMessage;

        GumballNum--;
        if (GumballNum == 0) {
            State = MachineStatus.SOLD_OUT;
            return noGumballMessage;
        }

        State = MachineStatus.NO_QUARTER;
        return dispenseSuccessMessage;
    }

    public String ejectQuarter() {
        if (State == MachineStatus.NO_QUARTER)
            return NoQuarterMessage;
        if (State == MachineStatus.SOLD_OUT)
            return soldOutMessage;
        if (State == MachineStatus.SOLD)
            return soldMessage;

        State = MachineStatus.NO_QUARTER;
        return ejectSuccessMessage;
    }
}

