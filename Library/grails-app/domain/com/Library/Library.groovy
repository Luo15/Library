package com.Library

class Library {
               String location
               String openingHours

               static hasMany=[books:Book,librarians:Librarian, students:Student]
               String toString(){"$location,$openingHours"}

    static constraints = {
               location()
               openingHours()
              
    }
}
