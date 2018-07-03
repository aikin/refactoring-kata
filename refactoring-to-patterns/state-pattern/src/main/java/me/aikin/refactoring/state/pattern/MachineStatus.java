package me.aikin.refactoring.state.pattern;

public class MachineStatus {
    public static MachineStatus NO_QUARTER = new MachineStatus(" NO_QUARTER");
    public static MachineStatus HAS_QUARTER = new MachineStatus("HAS_QUARTER");
    public static MachineStatus SOLD_OUT = new MachineStatus("SOLD_OUT");
    public static MachineStatus SOLD = new MachineStatus("SOLD");

    private String name;

    private MachineStatus(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
