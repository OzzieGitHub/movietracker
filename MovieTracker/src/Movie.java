
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

    public String getDirector(String title) {
        return "null";
    }

    public int getYear(String title) {
        return 0;
    }

    public boolean getDoIOwn(String title) {
        return false;
    }

    public String getTypeOfMedia(String title) {
        return "null";
    }

    public boolean getHaveIWatched(String title) {
        return false;
    }

    @Override
    public String toString() {
        return this.title + " " + this.director + " " + this.yearReleased + " "
                + this.doIOwn + " " + this.typeOfMedia + " " + this.haveIWatched;
    }

}