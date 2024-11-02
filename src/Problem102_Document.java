/*
Create class Document with below attributes

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - docsWithOddPages in Solution class.

This method will take array of Document objects and return another array with Document objects which has odd number of pages.

This method should be called from main method and display values of returned objects as shared in the sample (in ascending
order of id attribute).

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above
sequence.

Next call the method and display the result.

Consider below sample input and output:

Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40


Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45

 */

import java.util.*;

class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages){
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getFolderName(){
        return folderName;
    }
    public int getPages(){
        return pages;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + folderName + " " + pages;
    }
}

public class Problem102_Document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of documents: ");
        Document[] documents = new Document[sc.nextInt()];
        for(int i = 0; i < documents.length; i++){
            System.out.println("Enter id: " + (i+1));
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter title: " + (i+1));
            String title = sc.nextLine();
            System.out.println("Enter folder name: " + (i+1));
            String folderName = sc.nextLine();
            System.out.println("Enter pages: " + (i+1));
            int pages = sc.nextInt();
            sc.nextLine();
            documents[i] = new Document(id, title, folderName, pages);
        }
        ArrayList<Document> docsWithOddPages = docsWithOddPages(documents);
        if(docsWithOddPages.isEmpty()){
            System.out.println("No documents found with odd pages");
        }else{
            for(Document document : docsWithOddPages){
                System.out.println(document);
            }
        }
    }
    public static ArrayList<Document> docsWithOddPages(Document[] documents){
        ArrayList<Document> docsWithOddPages = new ArrayList<>();
        for(Document document : documents){
            if(document.getPages() % 2 != 0){
                docsWithOddPages.add(document);
            }
        }
        return docsWithOddPages;
    }
}
