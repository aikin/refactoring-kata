package me.aikin.refactoring.simplifying.method.calls.replace.parameter.with.explicit.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReplaceParameterWithExplicitMethodsTest {
    @Test
    public void should_get_setted_height_value() {
        me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Rectangle rectangle = new me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Rectangle();
        rectangle.setValue("height", 100);
        assertEquals(100, rectangle.getHeight());
    }

    @Test
    public void should_get_setted_width_value() {
        me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Rectangle rectangle = new me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Rectangle();
        rectangle.setValue("width", 50);
        assertEquals(50, rectangle.getWidth());
    }

    @Test
    public void should_create_engineer_given_type_is_engineer() {
        me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Employee employee = me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.EmployeeFactory.create(0);
        assertTrue(employee instanceof me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Engineer);
    }

    @Test
    public void should_create_salesman_given_type_is_salesman() {
        me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Employee employee = me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.EmployeeFactory.create(1);
        assertTrue(employee instanceof me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Salesman);
    }

    @Test
    public void should_create_manager_given_type_is_manager() {
        me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Employee employee = me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.EmployeeFactory.create(2);
        assertTrue(employee instanceof me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods.Manager);
    }
}