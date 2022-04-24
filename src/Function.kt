fun main(){

    //val soldier = Soldier()
    //val message = Message()
    //val particleSystem = ParticleSystem()

    println("helo World")

    val soldier1 = Soldier()
    val soldier2 = Soldier()
    val soldier3 = Soldier()

    val test = soldier1.name
    val test2 = soldier1.rank
    val test3 = soldier1.missing

     println("$test")
     println("$test2")
     println("$test3")
    soldier1.getStatus()
    //println("Name","${soldier1.name}")

   // Log.i("Name","${soldier1.name}")
}
