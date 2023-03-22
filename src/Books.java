public class Books {
    String Title;
    String genre;
    String author;
    String publisher;
    int yearOfPublication;
    String ISBN;
    int numOfPages;
    String language;
    boolean availability;
    String dateOfRenting;
    String dateOfReturning;
    int timesTheBookWasTaken;

    public void setPeriodOfRenting(String periodOfRenting) {
        this.periodOfRenting = periodOfRenting;
    }

    String periodOfRenting;

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setDateOfRenting(String dateOfRenting) {
        this.dateOfRenting = dateOfRenting;
    }

    public void setDateOfReturning(String dateOfReturning) {
        this.dateOfReturning = dateOfReturning;
    }

    public int getTimesTheBookWasTaken() {
        return timesTheBookWasTaken;
    }

    public void setTimesTheBookWasTaken(int timesTheBookWasTaken) {
        this.timesTheBookWasTaken = timesTheBookWasTaken;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Books[" +
                "Title=" + Title + " | " +
                "genre=" + genre + " | " +
                "author=" + author + " | " +
                "publisher=" + publisher + " | " +
                "yearOfPublication=" + yearOfPublication + " | " +
                "ISBN=" + ISBN + " | " +
                "numOfPages=" + numOfPages + " | " +
                "language=" + language + " | " +
                "availability=" + availability + " | " +
                "dateOfRenting=" + dateOfRenting + " | " +
                "dateOfReturning=" + dateOfReturning + " | " +
                "timesTheBookWasTaken=" + timesTheBookWasTaken + " | " +
                "periodOfRenting=" + periodOfRenting + " | " +
                ']';
    }
}
