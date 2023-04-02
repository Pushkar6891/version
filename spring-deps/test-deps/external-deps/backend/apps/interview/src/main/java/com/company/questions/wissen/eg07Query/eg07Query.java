package company.questions.wissen.eg07Query;

import java.awt.print.Book;

public class eg07Query {
    public static void main(String[] args) {

    }
}
// BookAuthor
// Book(unique) Author
// find all author written more than 10 books

/*Wrong*/
//    SELECT author
//    FROM   bookauthor
//    WHERE  count(book) > 10
//    GROUP  BY author;

/*Right*/
//    SELECT author
//    FROM bookauthor
//    GROUP BY author
//    HAVING count(book)>10
