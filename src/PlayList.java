import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PlayList {
    private ArrayList<String> tags;
    private ArrayList<PlayItem> items;

    public PlayList()
    {
        tags = new ArrayList<>();
        tags.add("running");
        tags.add("chill");
        tags.add("study");

        items = new ArrayList<>();
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public ArrayList<PlayItem> getItems()
     {
         return this.items;
     }

     public ArrayList<String> sortTags()
     {
         Collections.sort(tags);
         return tags;
     }
     public ArrayList<PlayItem> sortItems()
     {
         //Collections.sort(items);
         return items;
     }
}
