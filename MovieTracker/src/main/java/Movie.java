
public class Movie {
    private String title;
    private String director;
    private int yearReleased;
    private boolean doIOwn;
    private String typeOfMedia;
    private boolean haveIWatched;
    
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
    
}
