package com.Library

class Book {
            String title
            String author
            String isbn
            String dateBorrowed
            String returnDate
            String student
      
            String toString(){"$title,$isbn"}

    static constraints = {
            title()
            author()
            isbn()
            dateBorrowed()
            returnDate()
            student()
    }
}
