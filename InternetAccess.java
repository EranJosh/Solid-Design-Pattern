public class InternetAccess implements LibraryResource {
    private String title;
    private boolean borrowed;

    public InternetAccess(String title) {
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Internet Access";
    }

    @Override
    public void borrow() {
        borrowed = true;
        System.out.println("Internet access session started: " + title);
    }

    @Override
    public void returnResource() {
        borrowed = false;
        System.out.println("Internet access session ended: " + title);
    }
}