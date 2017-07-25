package com.refactor.moving.RemoveMiddleMan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveMiddleManTest {
    @Test
    public void should_get_name_for_manager_of_john() {
        final String managerName = "Kent";
        PersonForRemoveMiddleMan manager = new PersonForRemoveMiddleMan(managerName);
        DepartmentForRemoveMiddleMan department = new DepartmentForRemoveMiddleMan(manager);
        PersonForRemoveMiddleMan employee = new PersonForRemoveMiddleMan(department, "John");
        PersonForRemoveMiddleMan managerForEmployee = employee.getManager();
        assertEquals(managerName, managerForEmployee.getName());
    }
}