public class Apadtee1 implements iAdaptee {

    @Override
    public void playVlc(String fileName) {
       //do nothing
    }
 
    @Override
    public void playMp4(String fileName) {
       System.out.println("Playing mp4 file. Name: "+ fileName);		
    }
 }