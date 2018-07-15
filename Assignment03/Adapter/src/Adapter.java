public class Adapter implements iTarget {

   private iAdaptee advancedMusicPlayer;

   Adapter( String audioType ){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new Adaptee2();
         
      }else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Apadtee1();
      }	
   }

   @Override
   public void play(String audioType, String fileName) {
   
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}