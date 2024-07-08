public class Song extends ContentItem implements LyricsHandler, VideoClipper {

    String originalPerformer;

    public Song(String name, double length, String performer)
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
}
