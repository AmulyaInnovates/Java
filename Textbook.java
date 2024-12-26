public class Textbook extends Book {
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int bookEdition) {
        super(bookTitle, bookPrice);
        edition = bookEdition;
    }

    public int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return getTitle() + "-" + getPrice() + " (Edition " + edition + ")";
    }

    public boolean canSubstituteFor(Textbook other) {
        if (this.getTitle().equals(other.getTitle()) && this.getEdition() >= other.getEdition()) {
            return true;
        } else {
            return false;
        }
    }
}
