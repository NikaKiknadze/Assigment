import kotlin.math.sqrt

fun main() {
    val point = Point(1,2,2,4)

    val fraction = Fraction(1,6,1,4)

//    println(point.equals())
    println(point.toString())
    println(point.Symetric())
    println(fraction.truncateFraction())
    println(fraction.multiply())
    println(fraction.sum())
}



class Point(X: Int, Y: Int, SecondX: Int, SecondY: Int) {

    val X = X
    val Y = Y
    val SecondX = SecondX
    val SecondY = SecondY

    fun equals(){

        ??????????????

    }



    fun Symetric(): String {
        val symetrycX = -Y
        val symetrycY = -X

        return "($symetrycX;$symetrycY)"
    }


    fun toString(X: Int, Y: Int): String {
        return "($X;$Y)"
    }
}

class Fraction(numerator: Int, denominator: Int, secnumerator: Int, secdenomiantor: Int){

    val numerator = numerator
    val denominator = denominator
    val secnumerator = secnumerator
    val secdenominator = secdenomiantor

    fun sum(){
//        For If statement
        val finalNumerator = numerator+secnumerator
//        For Else statement
        val finalNumeratorElse = (numerator*secdenominator)+(secnumerator*denominator)
        val finalDenominator = denominator*secdenominator

        if (denominator == secdenominator){
            println("Answer is: $finalNumerator/$denominator" + " = " + (((numerator+secnumerator).toFloat())/denominator).toFloat())
        }else {
            println("Answer is: $finalNumeratorElse/$finalDenominator" + " = " + ((numerator*secdenominator).toDouble()+(secnumerator*denominator).toDouble())/(denominator*secdenominator))
        }
    }

    fun multiply(){

        val finalNumerator1 = numerator*secnumerator
        val finalDenominator1 = denominator*secdenominator
        println("Answer is: $finalNumerator1/$finalDenominator1" + " = " + (numerator*secnumerator).toDouble()/(denominator*secdenominator).toDouble())

    }

    fun truncateFraction(){

        var i = 1
        var truncatedFraction = 1


        while (i <= numerator && i <= denominator) {
            if (numerator % i == 0 && denominator % i == 0)
                truncatedFraction = i
            ++i
        }
        val newNumerator = numerator/truncatedFraction
        val newDenominator = denominator/truncatedFraction

        println("Answer is: $newNumerator/$newDenominator")


    }


}