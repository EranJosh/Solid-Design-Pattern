public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Juan Dela Cruz", 20210001);

        LibraryResource book = new Book("Clean Code by Robert C. Martin");
        LibraryResource thesis = new Thesis("AI-Based Attendance System");
        LibraryResource capstone = new Capstone("Smart Campus Mobile App");
        LibraryResource journal = new Journal("IEEE Software Engineering Vol. 12");
        LibraryResource newspaper = new Newspaper("Philippine Daily Inquirer - March 2026");
        LibraryResource internet = new InternetAccess("PC-Lab-Terminal-05");

        System.out.println("=== Borrowing Resources ===");
        student.borrowResource(book);
        student.borrowResource(thesis);
        student.borrowResource(capstone);
        student.borrowResource(journal);
        student.borrowResource(newspaper);
        student.borrowResource(internet);

        System.out.println("\n=== Returning Resources ===");
        student.returnResource(book);
        student.returnResource(internet);

        System.out.println("\n=== Currently Borrowed Resources ===");
        for (LibraryResource resource : student.getBorrowedResources()) {
            System.out.println("- " + resource.getType() + ": " + resource.getTitle());
        }
    }
}