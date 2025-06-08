import java.awt.*;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Comparable
        PlayList pl = new PlayList();
        System.out.println(pl.getTags());
        System.out.println(pl.sortTags());*/
        Podcast podcast = null;
        Song song = null;
        Commercial commercial = null;

        System.out.println("Number of commercials: " + Commercial.getCommCount());
        try {
            /*Comparable
            podcast = new Podcast("polymorphism", 60, "Maya", "Programming");
            song = new Song("Patience", 4.52, "Tame Impala");
            commercial = new Commercial("Love OOP", 0.3);
            pl.getItems().add(song);
            pl.getItems().add(commercial);
            pl.getItems().add(podcast);
            System.out.println(pl.getItems());
            System.out.println(pl.sortItems());*/
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
            System.out.println("Number of commercials: " + Commercial.getCommCount());

            //Polymorphism
            ContentItem item1 = new Podcast("OOMP", 45, "Maya", "Programming");
            ContentItem item2 = new Song("Lost in space", 3.45, "Tuna");
            System.out.println("this is a cool content item? " + item1.isCool());
            System.out.println("this is a cool content item? " + item2.isCool());

            podcast = new Podcast("polymorphism", 60, "Maya", "Programming");
            song = new Song("Patience", 4.52, "Tame Impala");
            commercial = new Commercial("Love OOP", 0.3);
            System.out.println("Number of commercials: " + Commercial.getCommCount());
            ArrayList<PlayItem> playList = new ArrayList<>();
            playList.add(podcast);
            playList.add(song);
            playList.add(commercial);
            for (PlayItem item : playList) {
                System.out.println(item.getClass() + " " + item.getName() + ": " + (item.isCool() ? "is cool" : "is not cool"));
                System.out.println(item instanceof PlayItem? "item is a PlayItem": "item is not a PlayItem");
                System.out.println(item instanceof ContentItem? "item is a ContentItem": "item is not a ContentItem");
                System.out.println(item instanceof Song? "item is a Song": "item is not a Song");
                if (item instanceof LyricsHandler)
                    ((LyricsHandler) item).display("ooooo");
            }

            //it was a Commercial, I swear.
            PlayItem thirdItemInPlayList = playList.get(1);
            if (thirdItemInPlayList.getClass().equals(Commercial.class)) {
                Product prod = ((Commercial) thirdItemInPlayList).getProduct();
            }
            //interface

            commercial.display("Code a mess? OOP's your mop! Clean, reusable, bugs won't plop!");
            song.display(null);
            song.display("OOP, OOP, code so neat,\n" +
                    "Objects dance, no bugs to meet!\n" +
                    "Classes rule, methods too,\n" +
                    "Inheritance's a dream come true!\n");


            //test exceptions
            //Commercial comm3 = new Commercial("Try This", 5);
            //Song song3 = new Song("Catch me if you can", 0.5, "Maya");
            //Podcast podcast1 = new Podcast("try to catch it, its exceptional", 65, "Maya", "coding");

        } catch (IllegalLength e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("THE END");
        }
        //Polymorphism with interface
        ArrayList<LyricsHandler> al = new ArrayList<>();
        al.add(commercial);
        al.add(song);
        displayAll(al);
        //it is not possible to create objects from an interface
        //this line will not compile
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
        boolean validText=false;
        for (LyricsHandler item:itemsWithLyrics) {
            text = "When you're coding late at night,\n" +
                    "            And your brain's in a twisty fight,\n" +
                    "            Just remember OOP's the way,\n" +

                    "            To make your code shine bright as day!";
            validText = false;
            while (!validText)
            {
                try {
                    item.display(text);
                    validText = true;
                } catch (IllegalLength e) {
                    System.out.println(e.getMessage());
                    System.out.println("enter new text: ");
                    text = new Scanner(System.in).nextLine();
                }
            }
        }
    }
}
