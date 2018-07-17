public class Target implements iTarget {
    private Adapter adapter;
 
    @Override
    public void play(String audioType, String fileName) {		
 
       //inbuilt support to play mp3 music files
       if(audioType.equalsIgnoreCase("mp3")){
          System.out.println("Playing mp3 file. Name: " + fileName);			
       } 
       
       //adapter is providing support to play other file formats
       else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
          adapter = new Adapter(audioType);
          adapter.play(audioType, fileName);
       }
       
       else{
          System.out.println("Invalid media. " + audioType + " format not supported");
       }
    }   
 }