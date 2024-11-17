# Sirma Academy 09.2024 

Java Streams and Files Excercises

1.	Word Lengths	
2.	Character Frequency	
3.	Replace Word	
4.	Count Lines, Words, and Characters	
5.	Extract File	
6.	Reverse Lines	
7.	Count Unique Words	
8.	Merge Lines from Two Files	
9.	Calculate Directory Size	
10.	Copy File Content	
11.	Serialize and Deserialize Map	
12.	*Serialize Custom Object List	
13.	*Extract Specific Files from Zip Archive	

Word Lengths
Write a program that reads a text file ("input.txt") and prints on the console the length of each word in the file. Use BufferedReader in combination with FileReader.

Input.txt
Output
This is a simple file with words of different lengths
4, 2, 1, 6, 4, 5, 2, 8, 7

Hints:
Use try-with-resources to handle the file.
Create a BufferedReader to read each line of the file.
Split each line into words, calculate the length of each word, and print it.
Character Frequency
Write a program that reads a text file ("input.txt") and prints on the console the frequency of each character in the file. Use BufferedReader in combination with FileReader.

Input
Output
Hello World!
H: 1
e: 1
l: 3
o: 2
 : 1
W: 1
r: 1
d: 1
!: 1

Hints:
Use a Map to store the frequency of each character.
Read the file character by character.
Replace Word
Write a program that reads a text file ("input.txt"), replaces all occurrences of a given word with another word, and writes the result to another file ("output.txt").
Input
Output
Java -> HTML
Java is fun. Java is powerful.


HTML is fun. HTML is powerful.

Count Lines, Words, and Characters
Write a program that reads a text file ("input.txt") and prints on the console the number of lines, words, and characters in the file.
Use BufferedReader to read the file line by line.
Count lines, split each line into words to count words, and sum the length of lines to count characters.
Extract File
Write a program that reads the path to a file and subtracts the file name and its extension.
Then print the file size in Bytes
Input
Output
C:\home\academy\presentation.pptx
File name: presentation
File extension: pptx
File size: {size} bytes
C:\Projects\website\some.file.jar
File name: some.file
File extension: jar
File size: {size} bytes

Reverse Lines
Write a program that reads a text file ("input.txt"), reverses each line, and writes the result to another file ("output.txt").

Input:
Hello World
Java Programming

Output:
dlroW olleH
gnimmargorP avaJ

Hints:
Use BufferedReader and PrintWriter.
Use StringBuilder.reverse() to reverse each line.
Count Unique Words
Write a program that reads a text file ("input.txt") and prints the number of unique words in the file.

Input:
This is a test file. This file is just a test.

Output:
Unique words: 6

Hints:
Use a Set to store unique words.
Split each line into words and add them to the Set.
Merge Lines from Two Files
Write a program that reads lines from two text files ("input1.txt" and "input2.txt") and writes them alternatively into a third file ("output.txt").
File 1:
Line 1 from file 1
Line 3 from file 1
File 2:
Line 2 from file 2
Line 4 from file 2

Output:
Line 1 from file 1
Line 2 from file 2
Line 3 from file 1
Line 4 from file 2

Hints:
Use BufferedReader for both input files and PrintWriter for the output file.
Read lines alternatively from both files and write them to the output file.
Calculate Directory Size
Write a program that calculates the total size of all files in a directory (including subdirectories). 
Output:
Total size: 4500 bytes
Hints:
Use File class to traverse directories and files.
Recursively calculate the size of all files.
Copy File Content
Write a program that copies the content of a text file ("input.txt") to another file ("output.txt") using BufferedInputStream and BufferedOutputStream.
Hints:
Use try-with-resources to handle the files.
Use BufferedInputStream and BufferedOutputStream for reading and writing the file content.
Serialize and Deserialize Map
Write a program that saves and loads a Map of String keys and Integer values to a file using ObjectInputStream and ObjectOutputStream. Set the name of the file as "map.ser".
Hints:
Use a HashMap to store the data.
Use ObjectOutputStream to serialize and save the Map.
Use ObjectInputStream to deserialize and load the Map.
*Serialize Custom Object List
Write a program that saves and loads a list of custom objects (Person) using ObjectInputStream and ObjectOutputStream. The Person class should have fields: String name and int age. Set the name of the save file as "persons.ser".
Hints:

Create a Person class with the specified fields.
Use ObjectOutputStream to serialize and save the list of Person objects.
Use ObjectInputStream to deserialize and load the list of Person objects.
*Extract Specific Files from Zip Archive
Write a program that reads a zip archive ("archive.zip") and extracts all .txt files into a directory named "extracted_files".
Hints:
Use ZipInputStream to read the zip archive.
Extract only the .txt files and save them in the specified directory.

