package com.refactor.commandpattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoteControlTest {

    @Test
    public void should_turn_on_light_when_press_first_on_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl(light, null, null);
        remoteControl.on(1);

        assertTrue(light.status());
    }


    @Test
    public void should_turn_off_light_when_press_first_off_button() {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl(light, null, null);
        remoteControl.off(1);
        assertFalse(light.status());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl(null, ceiling, null);
        remoteControl.on(2);
        assertEquals(CeilingSpeed.High, ceiling.getSpeed());
    }



    @Test
    public void should_turn_off_ceiling_when_press_second_off_button() {
        Ceiling ceiling = new Ceiling();
        RemoteControl remoteControl = new RemoteControl(null, ceiling, null);
        remoteControl.off(2);
        assertEquals(CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl(null, null, stereo);
        remoteControl.on(3);
        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button() {
        Stereo stereo = new Stereo();
        RemoteControl remoteControl = new RemoteControl(null, null, stereo);
        remoteControl.off(3);
        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getCdStatus());
        assertEquals(0, stereo.getVolume());
    }


}