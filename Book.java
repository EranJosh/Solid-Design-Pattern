public class Book implements LibraryResource {
    private String title;
    private boolean borrowed;

    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public void borrow() {
        borrowed = true;
        System.out.println("Book borrowed: " + title);
    }

    @Override
    public void returnResource() {
        borrowed = false;
        System.out.println("Book returned: " + title);
    }
}