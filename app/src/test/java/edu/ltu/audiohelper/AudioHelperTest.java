package edu.ltu.audiohelper;

import android.media.AudioManager;
import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;


/**
 * Unit tests for the AudioManager logic.
 */
public class AudioHelperTest {
    private final int MAX_VOLUME = 100;

    @Test
    public void testMaximizeVolume_Maximizes_Volume() {
        //TODO Create an AudioManager object using Mockito
        AudioManager audioManager = Mockito.mock(AudioManager.class);
        //TODO Inform Mockito what to return when audioManager.getStreamMaxVolume is called
        Mockito.when(audioManager.getStreamMaxVolume(AudioManager.STREAM_RING)).thenReturn(MAX_VOLUME);

        new AudioHelper().maximizeVolume(audioManager);
        //TODO verify with Mockito that setStreamVolume to 100 was called.
        Mockito.verify(audioManager).setStreamVolume(AudioManager.STREAM_RING, MAX_VOLUME, 0);
    }
}