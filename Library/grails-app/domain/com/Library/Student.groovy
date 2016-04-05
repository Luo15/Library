package com.Library

class Student {
               String name
               String email
               String studentId
               Course course

               static hasMany=[books:Book]
               String toString(){"$name,$email,$studentId"}

    static constraints = {
               name()
               email()
               studentId()
               course()
    }
}
