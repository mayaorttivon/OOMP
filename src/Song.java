public class Song extends ContentItem implements LyricsHandler, VideoClipper {

    String originalPerformer;
    public static final double MAX_SONG_LENGTH = 10;
    public static final double MIN_SONG_LENGTH = 1;

    public Song(String name, double length, String performer) throws IllegalLength
    {
        super( name, length, performer);
        this.originalPerformer = performer;
    }


    @Override
    public void display(String text) {
        if( text==null )
            text = DEFAULT_TEXT;
        System.out.println("\u001B[30m" +  "\u001B[41m" + text + "\u001B[0m");
    }

    @Override
    public void showCLip() {
        System.out.println("youtube+" + this.name + "+mp4");
    }

    @Override
    public double calcRating() {
        return 0;
    }

    @Override
    public double getMinLength() {
        return MIN_SONG_LENGTH;
    }

    @Override
    public double getMaxLength() {
        return MAX_SONG_LENGTH;
    }
}
