package cn.fenqing168.adapter;

public class AudioPlayer implements MediaPlayer {

   MediaAdapter mediaAdapter;

   public static final String MP3 = "mp3";
 
   @Override
   public void play(String audioType, String fileName) {    
 
      //播放 mp3 音乐文件的内置支持
      if(MP3.equalsIgnoreCase(audioType)){
         System.out.println("Playing mp3 file. Name: "+ fileName);
      } 
      //mediaAdapter 提供了播放其他文件格式的支持
      else if(MediaAdapter.VLC.equalsIgnoreCase(audioType)
         || MediaAdapter.MP4.equalsIgnoreCase(audioType)){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      else{
         System.out.println(
            audioType + " 不能播放");
      }
   }   
}