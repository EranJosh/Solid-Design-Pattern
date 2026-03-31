public class Thesis implements LibraryResource {
    private String title;
    private boolean borrowed;

    public Thesis(String title) {
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Thesis";
    }

    @Override
    public void borrow() {
        borrowed = true;
        System.out.println("Thesis borrowed: " + title);
    }

    @Override
    public void returnResource() {
        borrowed = false;
        System.out.println("Thesis returned: " + title);
    }
}