package me.aikin.refactoring.simplifying.method.calls.introduce.parameter.object;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntroduceParameterObjectTest {
    @Test
    public void should_get_flow_between_start_time_and_end_time() {
        List<Entry> entries = Arrays.asList(
                new Entry(10, LocalDate.of(2012, 4, 1)),
                new Entry(20, LocalDate.of(2012, 6, 1))
        );

        Account account = new Account(entries);
        int flows = account.getFlowBetween(LocalDate.of(2012, 3, 1), LocalDate.of(2012, 4, 2));
        assertEquals(10, flows);
    }
}