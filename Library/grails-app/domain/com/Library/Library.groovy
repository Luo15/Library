package com.Library

class Library {
               String location
               String openingHours
               String book
               String student
               String librarian

               String toString(){"$location,$openingHours,$book,$librarian"}

    static constraints = {
               location()
               openingHours()
               book()
               student()
               librarian()
               
    }
}
