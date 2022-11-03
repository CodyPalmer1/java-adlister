package javabeans;

import models.Pet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album faces = new Album(1, "Mac Miller", "Faces",new Date(2014), 20.3, "Rap");
        Album goodAm = new Album(2, "Mac Miller", "GO:OD AM", new Date(2015), 25.5, "Rap");
//        Album tlop = new Album(3, "Ye", "The life of pablo", new Date(2016), 20.5, "HipHop");
        Author author = new Author(1, "Michael", "Mouse");
        Author author2 = new Author(2, "Charles", "Cheese");
//        Author goof = new Author(3, "Goof", "y");
        Quote quote1 = new Quote(author, 1, "Hello there");
        Quote quote2 = new Quote(author2, 2, "Yummy cheese");
//        Quote quote3 = new Quote(goof, 3, "Hyuuuuck!");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
//        quotesList.add(quote3);

        System.out.println("Authors with quotes: ");
        for(Quote quote : quotes){
            System.out.println(quote.getContent());
            System.out.println(quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }
    }
}
