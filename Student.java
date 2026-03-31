import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<LibraryResource> borrowedResources;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrowResource(LibraryResource resource) {
        resource.borrow();
        borrowedResources.add(resource);
        System.out.println(name + " (ID: " + studentId + ") borrowed a " + resource.getType() + ": " + resource.getTitle());
    }

    public void returnResource(LibraryResource resource) {
        resource.returnResource();
        borrowedResources.remove(resource);
        System.out.println(name + " (ID: " + studentId + ") returned a " + resource.getType() + ": " + resource.getTitle());
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<LibraryResource> getBorrowedResources() {
        return borrowedResources;
    }
}