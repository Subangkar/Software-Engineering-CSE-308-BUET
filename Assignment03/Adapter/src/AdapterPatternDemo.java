public class AdapterPatternDemo {
    public static void main(String[] args) {
       Target target = new Target();
 
       target.play("mp3", "beyond the horizon.mp3");
       target.play("mp4", "alone.mp4");
       target.play("vlc", "far far away.vlc");
       target.play("avi", "mind me.avi");
    }
 }