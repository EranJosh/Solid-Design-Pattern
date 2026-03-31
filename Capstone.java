public class Capstone implements LibraryResource {
    private String title;
    private boolean borrowed;

    public Capstone(String title) {
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Capstone";
    }

    @Override
    public void borrow() {
        borrowed = true;
        System.out.println("Capstone borrowed: " + title);
    }

    @Override
    public void returnResource() {
        borrowed = false;
        System.out.println("Capstone returned: " + title);
    }
}