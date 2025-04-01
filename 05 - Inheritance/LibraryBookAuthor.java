class Book{
   String title;
   int publicationYear;
   void addBook(String title, int publicationYear){
       this.title = title;
       this.publicationYear = publicationYear;
   }
   void displayInfo(){
       System.out.println("Title: " + title);
       System.out.println("Publication Year: " + publicationYear);
   }
}
class Author extends Book{
   String name;
   String bio;
   void addBook(String title, int publicationYear, String name, String bio){
       super.addBook(title, publicationYear);
       this.name = name;
       this.bio = bio;
   }
   void displayInfo(){
       super.displayInfo();
       System.out.println("Author Name: " + name);
       System.out.println("Bio: " + bio);
       System.out.println();
   }
}
public class LibraryBookAuthor{
   public static void main(String[] args){
       Author author = new Author();
       author.addBook("Science", 2025, "Sobhit", "It's a book of miracle");
       author.displayInfo();
   }
}
