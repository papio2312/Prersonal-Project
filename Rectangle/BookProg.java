public class BookProg {
    public static void main(String[] args) {

        Book books[] = new Book[3];
        for(int i = 0; i<3; i++){
            books[i] = new Book();
        }

        books[0].setAuthor("Jane Austen");
        books[0].setTitle("Pride and Prejudice");
        books[0].setfirstEdition(1813);

        books[1].setAuthor("J.R.R Tolkien");
        books[1].setTitle("The Lord of The Rings");
        books[1].setfirstEdition(1954);

        books[2].setAuthor("George R.R. Martin");
        books[2].setTitle("A Game of Thrones");
        books[2].setfirstEdition(1996);


        int count = books.length;
        for(int i=0; i<count; i++){
            System.out.println("Author: "+books[i].getAuthor()+ "\nTitle: "+books[i].getTitle() +"\nFirst Edition: "+books[i].getEditon() );
        }



        



        

    }
}
