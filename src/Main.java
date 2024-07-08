import java.awt.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("car insurance", "Crash");
        Product prod2 = new Product("life insurance", "SafeSide");
        Commercial comm1 = new Commercial("insurance", 1);
        comm1.setProduct(prod1);
       // Product prod = new Product("Perfume", "Armani");
      //  comm1.setProduct(prod);
        displayCompanyIfCommercialIsCool(comm1);
        Commercial comm2 = new Commercial("insurance", 1);
        comm2.setProduct(prod2);
        System.out.print(" " + comm2.equals(comm1));

        //Polymorphism
        ContentItem item1 = new Podcast("OOMP", 45, "Maya", "Programming");
        ContentItem item2 = new Song("Lost in space", 3.45, "Tuna");
        System.out.println("this is a cool content item? " + item1.isCool());
        System.out.println("this is a cool content item? " + item2.isCool());

        Podcast podcast = new Podcast("polymorphism", 60, "Maya", "Programming");
        Song song = new Song("Patience", 4.52, "Tame Impala");
        Commercial commercial = new Commercial("Love OOP", 0.3);
        ArrayList<PlayItem> playList = new ArrayList<>();
        playList.add(podcast);
        playList.add(song);
        playList.add(commercial);
        for (PlayItem item:playList)
        {
            System.out.println(item.getClass() + " " + item.getName() + ": " + (item.isCool()? "is cool": "is not cool"));
            if( item instanceof LyricsHandler)
                ((LyricsHandler)item).display("ooooo");
        }

        //it was a Commercial, I swear.
        PlayItem thirdItemInPlayList = playList.get(1);
        if( thirdItemInPlayList.getClass().equals(Commercial.class)) {
            Product prod = ((Commercial) thirdItemInPlayList).getProduct();
        }
        //interface

       /* commercial.display("Code a mess? OOP's your mop! Clean, reusable, bugs won't plop!");
        song.display(null);
        song.display("OOP, OOP, code so neat,\n" +
                "Objects dance, no bugs to meet!\n" +
                "Classes rule, methods too,\n" +
                "Inheritance's a dream come true!\n");*/

        //Polymorphism with interface
        ArrayList<LyricsHandler> al = new ArrayList<>();
        al.add(commercial);
        al.add(song);
        displayAll(al);

        //VideoClipper videoClipper = new VideoClipper();

        }








    /**
     *
     * @param comm
     */
    public static void displayCompanyIfCommercialIsCool(Commercial comm)
    {
        if(comm.isCool())
            System.out.print(comm.getProduct().getCompany());
    }

    public static void displayAll(ArrayList<LyricsHandler> itemsWithLyrics)
    {
        String text = null;
        for (LyricsHandler item:itemsWithLyrics) {
            text = "When you're coding late at night,\n" +
                    "            And your brain's in a twisty fight,\n" +
                    "            Just remember OOP's the way,\n" +
                    "            To make your code shine bright as day!";

            item.display(text);

        }
    }
}
