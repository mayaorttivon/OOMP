public abstract class ContentItem extends PlayItem{
    String performer;
    boolean isSad;
    boolean isFunny;
    boolean isMadeMeThink;

    public ContentItem(String name, double length, String performer) throws IllegalLength
    {
        super(name, length);
        this.performer = performer;
        this.isFunny = false;
        this.isSad = false;
        this.isMadeMeThink = false;
    }

    @Override
    public boolean isCool()
    {
        int coolGrade=0;
        if( isSad )
            coolGrade++;
        if( isFunny)
            coolGrade++;
        if( isMadeMeThink)
            coolGrade++;
        return coolGrade>2;
    }
}
