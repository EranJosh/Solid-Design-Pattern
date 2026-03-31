public class Newspaper implements LibraryResource {
    private String title;
    private boolean borrowed;

    public Newspaper(String title) {
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    @Override
    public void borrow() {
        borrowed = true;
        System.out.println("Newspaper borrowed: " + title);
    }

    @Override
    public void returnResource() {
        borrowed = false;
        System.out.println("Newspaper returned: " + title);
    }
}