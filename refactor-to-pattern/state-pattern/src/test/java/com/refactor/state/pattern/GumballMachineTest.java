package com.refactor.state.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GumballMachineTest {
    @Test
    public void gumball_machine_status_should_be_no_quarter_at_start() {
        GumballMachine gumballMachine = new GumballMachine(10, MachineStatus.NO_QUARTER);
        assertEquals(MachineStatus.NO_QUARTER, gumballMachine.getState());
    }

    @Test
    public void gumball_machine_status_should_be_has_quarter_if_insert_a_quarter() {
        GumballMachine gumballMachine = new GumballMachine(10, MachineStatus.NO_QUARTER);
        gumballMachine.insertQuarter();
        assertEquals(MachineStatus.HAS_QUARTER, gumballMachine.getState());
    }

    @Test
    public void gumball_machine_status_should_be_no_quarter_if_eject_quarter_when_status_is_has_quarter() {
        GumballMachine gumballMachine = new GumballMachine(10, MachineStatus.HAS_QUARTER);
        gumballMachine.ejectQuarter();
        assertEquals(MachineStatus.NO_QUARTER, gumballMachine.getState());
    }

    @Test
    public void gumball_machine_status_should_be_sold_if_turn_crank_given_status_is_has_quarter() {
        GumballMachine gumballMachine = new GumballMachine(1, MachineStatus.HAS_QUARTER);
        gumballMachine.turnCrank();
        assertEquals(MachineStatus.SOLD, gumballMachine.getState());
    }

    @Test
    public void gumball_machine_status_should_back_to_no_quarter_if_dispense_given_has_gumball_and_status_is_sold() {
        GumballMachine gumballMachine = new GumballMachine(10, MachineStatus.SOLD);
        gumballMachine.dispense();
        assertEquals(gumballMachine.getGumballNum(), 9);
        assertEquals(MachineStatus.NO_QUARTER, gumballMachine.getState());
    }

    @Test
    public void gumball_machine_status_should_be_sold_out_if_dispense_given_no_gumball_and_status_is_sold() {
        GumballMachine gumballMachine = new GumballMachine(1, MachineStatus.SOLD);
        gumballMachine.dispense();
        assertEquals(MachineStatus.SOLD_OUT, gumballMachine.getState());
    }
}