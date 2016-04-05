package com.Library

class Librarian {
                 String name 
                 String email
                 String userName
                 String password
                 String telephone

                 static belongTo=Library                  
                 String toString(){"$name,$email,$telephone"}

    static constraints = {
                 name()
                 email()
                 userName()
                 password()
                 telephone()
    }
}
