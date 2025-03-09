# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MADAMSETTY SAI VENKAT AKSHAT

*INTERN ID*: CT08UFI

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# FILE-HANDLING-UTILITY USING JAVA
# OBJECTIVE
The objective of this task is to build a Java-based File Handling Utility that demonstrates essential file operations, including writing, reading, and modifying (appending) text files. This utility should provide an interactive menu-driven interface that allows users to choose different file operations conveniently.

File handling is a fundamental concept in Java that enables programs to interact with external files for data storage, retrieval, and modification. It is widely used in real-world applications such as logging, configuration management, report generation, and database integration.

# Requirements
The program should implement the following functionalities:

1️⃣ Write to a File

Users should be able to enter text, which gets stored in a file.
If the file already exists, its content should be overwritten with the new input.
Use FileWriter and BufferedWriter to handle the writing operation efficiently.

2️⃣ Read from a File

The program should allow users to read and display the contents of a specified file.
If the file does not exist, an appropriate error message should be displayed.
Use FileReader and BufferedReader to read the file efficiently line by line.

3️⃣ Modify (Append) a File

Users should be able to add new content to an existing file without deleting its previous data.
The program should append the new input to the file instead of overwriting it.
Use FileWriter in append mode (true) to ensure existing content remains unchanged.

4️⃣ User-Friendly Interface

The program should provide a menu-driven system that allows users to navigate between different file operations easily.
Error handling should be implemented to manage cases like missing files, incorrect input, and I/O exceptions.
Expected Deliverables
To successfully complete this task, the following deliverables should be submitted:

✔ A functional Java program implementing file handling operations.

✔ Proper documentation and comments in the code to improve readability.

✔ A GitHub repository containing the complete source code.

✔ A well-structured README file that explains the program’s functionality, installation, and usage.

# Technical Implementation
The program utilizes Java’s built-in java.io package, which provides various classes for handling files efficiently:

🔹 FileWriter – Writes characters to a file.

🔹 BufferedWriter – Improves performance by buffering file write operations.

🔹 FileReader – Reads characters from a file.

🔹 BufferedReader – Reads text from a file efficiently, line by line.

Additionally, exception handling using try-with-resources ensures proper resource management and prevents memory leaks.
