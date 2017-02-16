fun calculateWithdraw(input: Int): List<Int> {
    val bills = listOf(100, 50, 20, 10, 5, 2)

    if (input <= 0)
        throw IllegalArgumentException("Invalid Value")

    if (bills.contains(input))
        return listOf(input)

    val result = mutableListOf<Int>()

    var inputTmp = input

    bills.forEach {

        val div: Int = inputTmp / it
        if (div > 0) {
            for (i in 1..div) {
                result.add(it)
                inputTmp -= it
            }
        }
    }

    if (inputTmp > 0)
        throw IllegalArgumentException("Invalid Value")

    return result

}

fun calculate {

}