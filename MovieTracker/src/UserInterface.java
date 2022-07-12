import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
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
            //Menu commands are:
            //quit
            //save
            //add
            //remove
            //sort
            //edit
            //help
            //print all
            //print selection
            //last watch
            //random
            System.out.println("\nWhat would you like to do? (\"?\" prints menu options):");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                System.out.println("Would you like to save first? (y/n)");
                String quitSave = scanner.nextLine();
                if (quitSave.equalsIgnoreCase("n") || quitSave.equalsIgnoreCase("no")) {
                    break;
                } else {
                    save();
                    break;
                }
            }
            if (command.equals("save")) save();
            if (command.equals("add")) add();
            if (command.equals("remove")) remove();
            //if (command.equals("sort")) sort();
            //if (command.equals("edit")) edit();
            if (command.equals("?")) printMenuOptions();
            if (command.equals("print")) printAll();
            //if (command.equals("selection")) printSelection();
            //if (command.equals("last watch")) updateLastWatch();
            //if (command.equals("random")) getRandom();
        }
    }

    //Seems to be working with set save file name. Want to add user ability to change save file name.
    public void save() {
        Path filePath = Path.of("savefile.txt");

        try(FileWriter fileWriter = new FileWriter(filePath.toFile())){
            for (Movie movie : movies) {
                String movieSaveLine = movie.getTitle() + "," + movie.getDirector() + ","
                        + movie.getYear() + "," + movie.getDoIOwn() + "," + movie.getTypeOfMedia()
                        + "," + movie.getHaveIWatched();
                fileWriter.write(String.valueOf(movieSaveLine) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File saved!");
    }

    //Still needs work to be 100% completed but should be good for testing purposes
    public void add() {
                //- Title
                //- Director
                //- Year released
                //- Do I own
                //- Physical or digital media
                //- Have I watched
        System.out.println("\nWhat is the title of the movie?");
        String title = scanner.nextLine();
        System.out.println("\nWhat is the name of the director? (Enter to leave blank)");
        String director = scanner.nextLine();
        System.out.println("\nWhat year was the film released? (Enter to leave blank");
        int yearReleased = Integer.valueOf(scanner.nextLine());
        System.out.println("\nDo you own the film (y/n)? (Enter to leave blank)");
        String ownAnswer = scanner.nextLine();
        boolean doIOwn = (ownAnswer.equalsIgnoreCase("y") || ownAnswer.equalsIgnoreCase("yes"));
        System.out.println("\nIs this film on physical or digital media? (Enter to leave blank)");
        String physicalOrDigital = scanner.nextLine();
        System.out.println("\nHave you already watched this film?");
        String watchedAnswer = scanner.nextLine();
        boolean haveIWatched = (watchedAnswer.equalsIgnoreCase("y") || watchedAnswer.equalsIgnoreCase("yes"));

        Movie tempMovie = new Movie(title, director,yearReleased, doIOwn, physicalOrDigital, haveIWatched);
        this.movies.add(tempMovie);
        System.out.println("\nMovie added!\n");
    }

    public void remove() {
        System.out.println("What movie would you like to remove?");
        String movieTitle = scanner.nextLine();
        for (Movie movie : movies) {
            if (movie.getTitle().equals(movieTitle)) movies.remove(movie);
        }
    }

    public void sort() {
        //fill in later
    }

    public void edit() {
        //fill in later
    }

    public void printMenuOptions() {
        System.out.println("\nThe available commands are:");
        System.out.println("\nquit\nsave\nadd\n?\nprint\n");
    }

    public void printAll() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void printSelection() {
        //fill later
    }

    public void updateLastWatch() {
        //fill later
    }

    public void getRandom() {
        //fill later
    }
}