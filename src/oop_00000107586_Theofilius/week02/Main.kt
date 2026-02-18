package oop_00000107586_Theofilius.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Library Fine System ---")

    print("Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()
    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: ${loan.calculateFine()}")
}
