package composite_songgroup;

public class Leaf extends iComposite {

    private String songName;
    private String bandName;
    private int releaseYear;

    public Leaf( String newSongName, String newBandName, int newReleaseYear) {

        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;

    }

    

    public String getBandName() {
        return bandName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySongInfo() {

        System.out.println(" was recorded by "
                + getBandName() + " in " + getReleaseYear());

    }

}
