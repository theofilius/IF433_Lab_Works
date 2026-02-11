package oop_00000107586_Theofilius.week02

class Student (val name:String, val nim:String, var major:String ){
    init {
        if (nim.length !=5) {
            println("WARNING: Object tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermaslaah di sistem.")
        } else {
            println("LOG: Object Student $name berhasilkan dialokasikan di Memory.")
        }
    }
  
}
