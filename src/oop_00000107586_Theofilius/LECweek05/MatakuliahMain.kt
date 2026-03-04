package oop_00000107586_Theofilius.LECweek05

fun main() {
    val listMatkul: List<MataKuliah> = listOf(
        Wajib(),
        Elective()
    )
    println("Banyak tipe matkul: ${listMatkul.size}")

    for (mku in listMatkul) {
        mku.set_matkul(3)

        if(mku is Wajib) {
            mku.ada_smeminar()
        } else if (mku is Elective){
            mku.ada_praktek()
        }
        when (mku) {
            is Wajib -> {
                print("Wajib dari when: ")
                mku.ada_smeminar()
            }
            is Elective -> {
                print("Elective dari when: ")
                mku.ada_praktek()
            }
        }
    }

  //val wjb = Wajib();
  //  wjb.set_matkul(3);

  //  val elc = Elective();
   // elc.set_matkul(2);
}
