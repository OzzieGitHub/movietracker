
public class Movie {
    private String title;
    private String director;
    private int yearReleased;
    private boolean doIOwn;
    private String typeOfMedia;
    private boolean haveIWatched;
    //private Date? dateOfLastWatch; saving for later use
    //private String whatStreamingService; saving for later use
    //private Date? whenLeavingStreamingService; figure out a good way to save a date, maybe just a string?

    public Movie(String title) {
        this.title = title;
        this.director = "unk";
        this.yearReleased = 0;
        this.doIOwn = false;
        this.typeOfMedia = "unk";
        this.haveIWatched = false;
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.yearReleased = 0;
        this.doIOwn = false;
        this.typeOfMedia = "unk";
        this.haveIWatched = false;
    }

    public Movie(String title, String director, int yearReleased) {
        this.title = title;
        this.director = director;
        this.yearReleased = yearReleased;
        this.doIOwn = false;
        this.typeOfMedia = "unk";
        this.haveIWatched = false;
    }

    public Movie(String title, String director, int yearReleased, boolean doIOwn,
                 String typeOfMedia, boolean haveIWatched) {
        this.title = title;
        this.director = director;
        this.yearReleased = yearReleased;
        this.doIOwn = doIOwn;
        this.typeOfMedia = typeOfMedia;
        this.haveIWatched = haveIWatched;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public int getYear() {
        return this.yearReleased;
    }

    public boolean getDoIOwn() {
        return this.doIOwn;
    }

    public String getTypeOfMedia() {
        return this.typeOfMedia;
    }

    public boolean getHaveIWatched() {
        return this.haveIWatched;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Director: " + this.director + ", Year Released: " + this.yearReleased
                + ", Do I Own?: " + this.doIOwn + ", Type of Media: " + this.typeOfMedia + ", Previously Watched?: " + this.haveIWatched;
    }

}