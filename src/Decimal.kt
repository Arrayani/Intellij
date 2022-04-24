import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*
import javax.swing.text.NumberFormatter

fun main(){
//sebelum di kiirrim ke formatter, harus konvert menjadi int atau long
    //var a = readln().toInt()
    var a = readln().toLong()
    //val formatter = NumberFormat.getCurrencyInstance(Locale("in","ID"))
    val formatter = NumberFormat.getInstance(Locale.US)
    val hasilFormat =formatter.format(a)
    val testFormatter = NumberFormat.getCompactNumberInstance()
    val deciFormat = DecimalFormat("#,###")
    //val hasilDeci= deciFormat.format(a).toString().replace(',','.')
    val hasilDeci= deciFormat.format(a).toString().replace(',','.')

    val kembalikan = hasilDeci.replace(".","")
    //println(hasilFormat)
    println(hasilDeci)
    println("nilai kembali normal dengan tipe string "+kembalikan)
}

class Decimal {
}