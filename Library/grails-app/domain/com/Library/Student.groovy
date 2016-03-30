package com.Library

class Student {
               String name
               String email
               String studentId
               String course

               String toString(){"$name,$email,$studentId"}

    static constraints = {
               name()
               email()
               studentId()
               course()
    }
}
