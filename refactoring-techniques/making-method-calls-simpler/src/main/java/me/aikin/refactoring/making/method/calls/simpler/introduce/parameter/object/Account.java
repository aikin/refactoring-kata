package me.aikin.refactoring.making.method.calls.simpler.introduce.parameter.object;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Account {
    private List<Entry> entries;

    public Account(List<Entry> entries) {
        this.entries = entries;
    }

    public int getFlowBetween(LocalDate start, LocalDate end) {
        List<Entry> entriesWithinStartAndEnd = entries.stream().filter(entry ->
                (entry.getChargeDate().isAfter(start) || entry.getChargeDate().isEqual(start)) &&
                        (entry.getChargeDate().isBefore(end) || entry.getChargeDate().isEqual(end)))
                .collect(Collectors.toList());
        return entriesWithinStartAndEnd.stream().mapToInt(Entry::getValue).sum();
    }
}


