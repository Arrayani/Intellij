class Soldier {
    val name ="Ryan"
    val rank ="Private"
    val missing= false
    fun getStatus(){

        var status = "$rank $name"
        if (missing){
            status="$status is missing"
        }else {
            status="$status is ready for duty."
        }
        println("$status")

    }
}