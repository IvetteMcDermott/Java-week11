package week11Lab;

public class RockBands {
    // prints vars
    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String underline = "\u001B[4m";

    // vars
    private String musicGenre;
    private String musicSubGenre = "Classic";
    private String bandName;
    private int foundation;
    private String drummer;
    private String guitar;
    private String bassist;
    private String singer;
    private String origin;

    // get
    public void getMembers(String bandName,
            String musicSubGenre,
            int foundation,
            String drummer,
            String guitar,
            String bassist,
            String singer) {
        this.bandName = bandName;
        this.musicGenre = musicSubGenre;
        this.foundation = foundation;
        this.drummer = drummer;
        this.guitar = guitar;
        this.bassist = bassist;
        this.singer = singer;
    }

    // computes
    // name
    public void BandName(String bandName) {
        System.out.println("\n" + underline + red + bandName + reset);
    }

    // music genre
    public void MusicGenre() {
        musicGenre = "Rock";
        System.out.println(green + "Genre: " + musicGenre);
    }

    // rock subgenre
    public void MusicSubGenre(String musicSubGenre) {
        System.out.println("Subgenre: " + musicSubGenre + reset);
    }

    // origin
    public void Origin() {
        origin = "UK";
        System.out.println(yellow + "Original from " + origin);
    }

    // foundation
    public void Foundation(int foundation) {
        System.out.println("Founded in " + foundation);
    }

    // members
    public void Members(String drummer,
            String guitar,
            String bassist,
            String singer) {

        System.out.println("First line up:\n Bassist: " + bassist + "\n Guitar: " + guitar + "\n Drummer: "
                + drummer + "\n Singer: " + singer + reset);
    }

}
