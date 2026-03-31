public interface LibraryResource {
    String getTitle();
    String getType();
    void borrow();
    void returnResource();
}