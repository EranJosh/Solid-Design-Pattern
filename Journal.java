public class Journal implements LibraryResource {
    private String title;
    private boolean borrowed;

    public Journal(String title) {
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Journal";
    }

    @Override
    public void borrow() {
        borrowed = true;
        System.out.println("Journal borrowed: " + title);
    }

    @Override
    public void returnResource() {
        borrowed = false;
        System.out.println("Journal returned: " + title);
    }
}