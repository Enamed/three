fun main() {
    println("Введите время в секундах, для отображения условия-ТОЛЬКО ЧТО-")
    val second = readLine()
    val secondint = second?.toInt()
    val result = secondint?.let { agoToText(it) }

}

fun agoToText(input: Int) {

    //val hour = input / 3600
    when (input) {
        in 0..60 -> println("Только что")
        in 61..3600 -> hourReplace(input)
        in 3601..86400 -> hourReplaceLong(input)
        in 86401..172800 -> println("Сегодня")
        in 172801..259200 -> println("Вчера")
        in 259201..Integer.MAX_VALUE -> println("Давно")
    }
}

fun hourReplace(sec: Int) {
    val time = (sec / 60)
    val lastСharacter = time % 10
    if (time in 5..20) {
        println("$time минут назад")
    } else {
        if (lastСharacter == 1) {
            println("$time минуту назад")
        } else if (lastСharacter in 5..9 || lastСharacter == 0) {
            println("$time минут назад")
        } else {
            println("$time минуты назад")
        }
    }
}

fun hourReplaceLong(sec: Int) {
    val time = (sec / 3600)
    val lastСharacter = time % 10
    if (time in 5..20) {
        println("$time часов назад")
    } else {
        if (lastСharacter == 1) {
            println("$time час назад")
        } else if (lastСharacter in 5..9 || lastСharacter == 0) {
            println("$time часов назад")
        } else {
            println("$time часа назад")
        }
    }
}

