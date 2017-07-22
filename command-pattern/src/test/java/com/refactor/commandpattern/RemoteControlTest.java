package com.refactor.commandpattern;

import com.refactor.commandpattern.Invoker.RemoteControl;
import com.refactor.commandpattern.Invoker.SlotType;
import com.refactor.commandpattern.command.*;
import com.refactor.commandpattern.receiver.Ceiling;
import com.refactor.commandpattern.receiver.CeilingSpeed;
import com.refactor.commandpattern.receiver.Light;
import com.refactor.commandpattern.receiver.Stereo;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoteControlTest {
    @Test
    public void should_turn_on_light_when_press_first_on_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(SlotType.LIGHT, new LightOnCommand(light));
        remoteControl.setOffCommand(SlotType.LIGHT, new LightOffCommand(light));

        remoteControl.on(SlotType.LIGHT);

        assertTrue(light.status());
    }


    @Test
    public void should_turn_off_light_when_press_first_off_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(SlotType.LIGHT, new LightOnCommand(light));
        remoteControl.setOffCommand(SlotType.LIGHT, new LightOffCommand(light));

        remoteControl.off(SlotType.LIGHT);

        assertFalse(light.status());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(SlotType.CEILING, new CeilingHighCommand(ceiling));
        remoteControl.setOffCommand(SlotType.CEILING, new CeilingOffCommand(ceiling));

        remoteControl.on(SlotType.CEILING);

        assertEquals(CeilingSpeed.High, ceiling.getSpeed());
    }



    @Test
    public void should_turn_off_ceiling_when_press_second_off_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(SlotType.CEILING, new CeilingHighCommand(ceiling));
        remoteControl.setOffCommand(SlotType.CEILING, new CeilingOffCommand(ceiling));

        remoteControl.off(SlotType.CEILING);

        assertEquals(CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(SlotType.STEREO, new StereoOnCommand(stereo));
        remoteControl.setOffCommand(SlotType.STEREO, new StereoOffCommand(stereo));

        remoteControl.on(SlotType.STEREO);

        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setOnCommand(SlotType.STEREO, new StereoOnCommand(stereo));

        remoteControl.setOffCommand(SlotType.STEREO, new StereoOffCommand(stereo));
        remoteControl.off(SlotType.STEREO);

        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getCdStatus());
        assertEquals(0, stereo.getVolume());
    }


}