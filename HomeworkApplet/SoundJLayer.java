// Modified from https://thiscouldbebetter.wordpress.com/2011/06/14/
// playing-an-mp3-from-java-using-jlayer/
/*********************************************************************************
 *                                                                               *
 *  This class allows an mp3 file to be played in an applet                      *
 *                                                                               *
 *********************************************************************************/

package HomeworkApplet;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

class SoundJLayer extends PlaybackListener implements Runnable
{
    private String filePath;
    private AdvancedPlayer player;
    private Thread playerThread;    

    public SoundJLayer(String filePath)
    {
        this.filePath = filePath;
    }

    public void play()
    {
        try
        {
            String urlAsString = 
                "file:///" 
                + new java.io.File(".").getCanonicalPath()          + "/" 
                + this.filePath;

            this.player = new AdvancedPlayer
            (
                new java.net.URL(urlAsString).openStream(),
                javazoom.jl.player.FactoryRegistry.systemRegistry().createAudioDevice()
            );

            this.player.setPlayBackListener(this);

            this.playerThread = new Thread(this, "AudioPlayerThread");

            this.playerThread.start();
            
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    // stop method
    public void stopPlayback()
    {
    	this.playerThread.stop();
    }

    // PlaybackListener members

    public void playbackStarted(PlaybackEvent playbackEvent)
    {
        //System.out.println("playbackStarted");
    }

    public void playbackFinished(PlaybackEvent playbackEvent)
    {
        //System.out.println("playbackEnded");
    }    

    // Runnable members

    public void run()
    {
        try
        {
            this.player.play();
        }
        catch (javazoom.jl.decoder.JavaLayerException ex)
        {
            ex.printStackTrace();
        }
    }
}
