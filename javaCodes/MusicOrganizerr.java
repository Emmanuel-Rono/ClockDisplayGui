public class MusicOrganizer {
    private List<String> songs;
    private Random random;

    public MusicOrganizer() {
        songs = new ArrayList<>();
        random = new Random();
    }

    public void addSong(String artist, String title) {
        String song = artist + " - " + title;
        songs.add(song);
        System.out.println("Added song: " + song);
    }

    public void ListAllFiles() {
        System.out.println("List of Songs:");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i));
        }
    }

    public void playRandomTrack() {
        if (songs.isEmpty()) {
            System.out.println("No songs available.");
            return;
        }

        int randomIndex = random.nextInt(songs.size());
        String randomTrack = songs.get(randomIndex);

        System.out.println("Now playing: " + randomTrack);
    }

    public static void main(String[] args) {
        MusicOrganizer organizer = new MusicOrganizer();
        organizer.addSong("Artist1", "Title1");
        organizer.addSong("Artist2", "Title2");
        organizer.addSong("Artist3", "Title3");
        organizer.displaySongs();

        organizer.playRandomTrack();
    }
}
