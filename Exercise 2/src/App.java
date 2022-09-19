import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // 1. Create your own music playlist by creating a LinkedList object
        LinkedList<String> playlist = new LinkedList<String>();

        // 2. Add 5 new songs to your Playlist using the add() method

        playlist.add("JID - Dance Now");
        playlist.add("Count Me Out - Kendrick Lamar");
        playlist.add("N95 - Kendrick Lamar");
        playlist.add("GoldLink - Crew ft. Brent Faiyaz, Shy Glizzy");
        playlist.add("21 Savage - a lot ft. J. Cole");

        // 3. Add a new song at the front of the Playlist using the addFirst() method

        playlist.addFirst("J.I.D - Surround Sound (feat. 21 Savage & Baby Tate)");

        // 4. Add a new song at the end of the Playlist using the addLast() method

        playlist.addLast("No Role Modelz - J. Cole");

        // 5. Display the song at the front of the Playlist using the combination of
        // get() method and the println() method

        System.out.println(playlist.get(0));

        // 6. Replace the last song using the set() method

        playlist.set(playlist.size() - 1, "Kendrick Lamar - Money Trees (Feat. Jay Rock)");

        // 7. Remove the first song using the remove() method

        playlist.remove(0);

        // 8. Display all songs in your Playlist using the println method

        System.out.println(playlist);
    }
}