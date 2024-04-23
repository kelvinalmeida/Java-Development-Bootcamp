public class Magazine {

    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public static void main(String[] args) {
        
    }

    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public Magazine(Magazine source) {
        setTitle(source.title);
        setPublisher(source.publisher);
        setIssueNumber(source.issueNumber);
        setPublicationYear(source.publicationYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        if(title.isBlank() || title == null) {
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        
        if(publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("Publisher cannot be null or blank.");
        }

        this.publisher = publisher;
    }

    public int getIssueNumber() {

        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if( issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be greater than 0.");
        }

        this.issueNumber = issueNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if( issueNumber <= 0) {
            throw new IllegalArgumentException("Publication year must be greater than 0.");
        }

        this.publicationYear = publicationYear;
    }

}
