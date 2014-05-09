import java.util.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music{

    protected AudioInputStream music;
    protected Clip clip;
    protected String song;
    protected File file = new File("");
    
    
    public Music(String in){
	
	song = in;
	/* Used to be
	      File file = new File(song);
	*/
	file = new File(song);
	
    }
    
    public void play(){
	
	try{
	    System.out.println(file);
	    music = AudioSystem.getAudioInputStream(file.getAbsoluteFile());
	    clip = AudioSystem.getClip();

	    clip.open(music);
	    clip.start();
	    clip.loop(clip.LOOP_CONTINUOUSLY);
	}
	catch(Exception e){
	    System.out.println("Error Playing Sound: Play");
	    e.printStackTrace();
	}
    }

    public void stop(){
	
	try{
	    clip.stop();
	}
	catch(Exception e){
	    System.out.println("Error Stoping Sound");
	    e.printStackTrace();
	}
    }
}
