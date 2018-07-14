package me.aikin.refactoring.simplifying.method.calls.preserve.whole.object;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PreserveWholeObjectTest {
    @Test
    public void should_get_room_within_plan_given_room_low_temp_is_not_lower_than_plan_low_temp_and_high_temp_is_not_higher_than_plan_high_temp() {
        Room room = new Room (new TempRange(10, 20));
        HeatingPlan heatingPlan = new HeatingPlan(new TempRange(5, 25));
        assertTrue(room.withinPlan(heatingPlan));
    }

    @Test
    public void should_get_room_not_within_plan_given_room_low_temp_is_higher_than_plan_low_temp() {
        Room room = new Room (new TempRange(10, 20));
        HeatingPlan heatingPlan = new HeatingPlan(new TempRange(15, 25));
        assertFalse(room.withinPlan(heatingPlan));
    }

    @Test
    public void should_get_room_not_within_plan_given_room_high_temp_is_lower_than_plan_high_temp() {
        Room room = new Room (new TempRange(10, 20));
        HeatingPlan heatingPlan = new HeatingPlan(new TempRange(5, 15));
        assertFalse(room.withinPlan(heatingPlan));
    }
}