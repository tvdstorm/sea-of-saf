package gui;

import sun.audio.*;
import java.io.*;

public class SoundFile {

	private Boolean loaded;
	private Boolean playing;
    private InputStream inputStream;
    private AudioStream audioStream;

    public SoundFile() {
    	this.playing = false;
    }
    
    public Boolean load(String filename) {
    	try {
    		inputStream = new FileInputStream(filename);
    		audioStream = new AudioStream(inputStream);
    		this.loaded = true;
		} catch (IOException e) {
			return false;
		}
    	return true;
    }
    
    public Boolean unload() {
    	if ( loaded ) {
    		if ( playing ) {
    			stop();
    		}
    		try {
				audioStream.close();
				inputStream.close();
			} catch (IOException e) {
				return false;
			}
    	}
    	return true;
    }

    public void play() {
    	if ( loaded ) {
    		AudioPlayer.player.start(audioStream); 
    		playing = true;
    	}
    }
    
    public void stop() {
    	if ( loaded && playing ) {
    		AudioPlayer.player.stop(audioStream);
    	}
    }
	
}
