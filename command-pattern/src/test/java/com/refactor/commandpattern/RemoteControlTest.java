package com.refactor.commandpattern;

import com.refactor.commandpattern.Invoker.RemoteControl;
import com.refactor.commandpattern.command.*;
import com.refactor.commandpattern.receiver.Ceiling;
import com.refactor.commandpattern.receiver.CeilingSpeed;
import com.refactor.commandpattern.receiver.Light;
import com.refactor.commandpattern.receiver.Stereo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoteControlTest {
    @Test
    public void should_turn_on_light_when_press_first_on_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(1, new LightOnCommand(light));
        remoteControl.setOffCommand(1, new LightOffCommand(light));

        remoteControl.on(1);

        assertTrue(light.status());
    }


    @Test
    public void should_turn_off_light_when_press_first_off_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(1, new LightOnCommand(light));
        remoteControl.setOffCommand(1, new LightOffCommand(light));

        remoteControl.off(1);

        assertFalse(light.status());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(2, new CeilingHighCommand(ceiling));
        remoteControl.setOffCommand(2, new CeilingOffCommand(ceiling));

        remoteControl.on(2);

        assertEquals(CeilingSpeed.High, ceiling.getSpeed());
    }



    @Test
    public void should_turn_off_ceiling_when_press_second_off_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(2, new CeilingHighCommand(ceiling));
        remoteControl.setOffCommand(2, new CeilingOffCommand(ceiling));

        remoteControl.off(2);

        assertEquals(CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(3, new StereoOnCommand(stereo));
        remoteControl.setOffCommand(3, new StereoOffCommand(stereo));

        remoteControl.on(3);

        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(3, new StereoOnCommand(stereo));

        remoteControl.setOffCommand(3, new StereoOffCommand(stereo));
        remoteControl.off(3);

        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getCdStatus());
        assertEquals(0, stereo.getVolume());
    }


}