import com.Library.*
class BootStrap {

    def init = { servletContext ->
             def library1=new Library(location:'SHU university',
                                     openingHours:'24 Hours').save()

             def student1=new Student(name:'Tom',
                                      email:'b5450758@my.shu.ac.uk',
                                      studentid:'B5450758',
                                      course:'Computing').save()

             def course1=new Course(title:'E-business',
                                    code:'WA234',
                                    tutor:'Inze Haire',
                                    department:'Computing',
                                    description:'''Lorem ipsum dodlr sit amet, ad sea solum brute sensibus, te summo seneserit ei.''').save()
    }
    def destroy = {
    }
}
