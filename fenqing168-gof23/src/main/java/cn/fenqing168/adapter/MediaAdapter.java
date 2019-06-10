package cn.fenqing168.adapter;

/**
 * @author fenqing
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public static final String VLC = "vlc", MP4 = "mp4";

    public MediaAdapter(String audioType) {
        if (VLC.equalsIgnoreCase(audioType)) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (MP4.equalsIgnoreCase(audioType)) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (VLC.equalsIgnoreCase(audioType)) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (MP4.equalsIgnoreCase(audioType)) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}