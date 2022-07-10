import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Movie> movies;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.movies = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("Do you have a saved file? (y/n)");
        String input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.println("What is the name of your file?");
            String fileName = scanner.nextLine();
            loadFile(fileName);
        }
        
        if (input.equals("n")) menu();
    }
    
    public void loadFile(String fileName) {
        //The movie parts in order are:
        //String title;
        //String director;
        //int yearReleased;
        //boolean doIOwn;
        //String typeOfMedia;
        //boolean haveIWatched;
        
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                String[] parts = row.split(",");
                String title = parts[0];
                String director = parts[1];
                int yearReleased = Integer.valueOf(parts[2]);
                boolean doIOwn = Boolean.valueOf(parts[3]);
                String typeOfMedia = parts[4];
                boolean haveIWatched = Boolean.valueOf(parts[5]);
                Movie tempMovie = new Movie(title, director, yearReleased, doIOwn, typeOfMedia, haveIWatched);
                this.movies.add(tempMovie);
            }
            
            menu();
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
    
    public void menu() {
        while (true) {
            System.out.println("What would you like to do? (\"help\" prints menu options):");
            String command = scanner.nextLine();
            
            if (command.equals("quit")) break;
            if (command.equals("help")) help();
            if (command.equals("add")) add();
            if (command.equals("print")) printAll();
            
        }
    }
    
    public void save() {
        //fill in later
    }
    
    public void add() {
        System.out.println("\nWhat is the title of the movie?");
        String title = scanner.nextLine();
        
        Movie tempMovie = new Movie(title);
        this.movies.add(tempMovie);
        System.out.println("\nMovie added!\n");
    }
    
    public void remove() {
        //fill in later
    }
    
    public void sort() {
        //fill in later
    }
    
    public void edit() {
        //fill in later
    }
    
    public void help() {
        System.out.println("\nThe available commands are:");
        System.out.println("\nquit\nhelp\nadd\nprint\n");
    }
    
    public void printAll() {
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }
    
    public void printSelection() {
        //fill later
    }
    
    public void lastWatch() {
        //fill later
    }
    
    public void random() {
        //fill later
    }
    
    public void quit() {
        //fill later
    }
    
}
