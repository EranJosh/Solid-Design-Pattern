# Solid-Design-Pattern

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

<img width="8192" height="2099" alt="Library Resource_UML Class Diagram" src="https://github.com/user-attachments/assets/37c9eeef-f0e0-4875-8110-21b9e6e480b7" />
