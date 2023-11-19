package com.itsallbinary;

import java.io.File;
import javax.sound.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class PlayMusic
{
    public int getRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void PlayRandomMusic()
    {
        String[] location_arr = {
                "src\\main\\java\\song2.wav",
                "src\\main\\java\\song3.wav",
                "src\\main\\java\\song4.wav",
                "src\\main\\java\\song5.wav",
                "src\\main\\java\\song6.wav",
                "src\\main\\java\\song7.wav",
                "src\\main\\java\\song8.wav",
                "src\\main\\java\\song9.wav",
                "src\\main\\java\\song10.wav",
                "src\\main\\java\\song11.wav",};

        String location = location_arr[getRandomNumber(0, location_arr.length)];

        try
        {
            File musicPath = new File(location);
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                JOptionPane.showMessageDialog(jf, "Press OK to stop Playing", "Stop PLaying", JOptionPane.OK_OPTION);
                int result = JOptionPane.OK_OPTION;
                if(result == JOptionPane.OK_OPTION)
                {
                    clip.stop();
                }
            }
            else
            {
                System.out.println("Can't find file");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
