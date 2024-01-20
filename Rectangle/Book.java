public class Book {
    private String title;
    private String author; 
    private int firstEdition;

    public Book(){
        title = " ";
        author = " ";
        firstEdition = 0;
    }

    // public void setVariables(double l,double w,double h){
    //     width = w;
    //     height = h;
    //     length = l;
    // }

    public void setTitle(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String a){
        author = a;
    }

    public String getAuthor(){
        return author;
    }

    public void setfirstEdition(int fe){
        firstEdition = fe;
    }

    
    public int getEditon(){
        return firstEdition;
    }

}
