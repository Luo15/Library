package com.Library

class Book {
            String title
            String author
            String isbn
            Date startDate
            Date endDate
            String student
            
           
            static belongTo=Student
            
            String toString(){"$title,$author,$isbn"}

    static constraints = {
            title()
            author()
            isbn()
            startDate()
            endDate()
            student()
            
    }
}
