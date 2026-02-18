package oop_00000107586_Theofilius.week02

class Loan(
    var bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}
