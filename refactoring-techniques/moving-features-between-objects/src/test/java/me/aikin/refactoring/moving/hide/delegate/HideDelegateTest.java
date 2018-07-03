package me.aikin.refactoring.moving.hide.delegate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HideDelegateTest {
    @Test
    public void should_get_name_for_manager_of_john() {
        final String managerName = "Kent";
        PersonForHideDelegate manager = new PersonForHideDelegate(managerName);
        DepartmentForHideDelegate departmentForHideDelegate = new DepartmentForHideDelegate(manager);
        PersonForHideDelegate employee = new PersonForHideDelegate(departmentForHideDelegate, "John");
        PersonForHideDelegate managerForEmployee = employee.getOwnDepartment().getManager();
        assertEquals(managerName, managerForEmployee.getName());
    }
}