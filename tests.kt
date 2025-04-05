package com.example.ipv4

fun main() {

    check(
        name = "when have ip with 3 dots, four segments and each segment is between 0 and 255, it should return true",
        result = isIpv4Valid("255.0.0.1"),
        correctResult = true
    )

    check(
        name = "when have ip with 3 dots, four segments and each segment is between 0 and 255 with extra spaces, it should return false",
        result = isIpv4Valid("255.0.0.255  "),
        correctResult = false
    )

    check(
        name = "when have ip contains one segment more than 255, it should return false",
        result = isIpv4Valid("255.0.0.256"),
        correctResult = false
    )

    check(
        name = "when have ip contains one segment less than 0, it should return false",
        result = isIpv4Valid("255.0.-1.255"),
        correctResult = false
    )

    check(
        name = "when have ip contains one segment leading zero, it should return false",
        result = isIpv4Valid("255.0.0.01"),
        correctResult = false
    )

    check(
        name = "when have ip contains anything other than numbers and dots, it should return false",
        result = isIpv4Valid("255.0.a&.255"),
        correctResult = false
    )

    check(
        name = "when have ip contains dots more than 3 dots, it should return false",
        result = isIpv4Valid("255.0.0.255."),
        correctResult = false
    )

    check(
        name = "when have ip contains segments less than 4 segments, it should return false",
        result = isIpv4Valid("255.0.0"),
        correctResult = false
    )

    check(
        name = "when have ip contains segments more than 4 segments, it should return false",
        result = isIpv4Valid("255.0.0.255.0"),
        correctResult = false
    )

    check(
        name = "when have ip contains 3 dots without segments, it should return false",
        result = isIpv4Valid("..."),
        correctResult = false
    )

    check(
        name = "when have ip contains only one number, it should return false",
        result = isIpv4Valid("255"),
        correctResult = false
    )

    check(
        name = "when have empty ip, it should return false",
        result = isIpv4Valid(""),
        correctResult = false
    )
}


fun check(name: String, result: Boolean, correctResult: Boolean) {
    if(result == correctResult) {
        println("Passed- $name")
    } else {
        println("Failed- $name expected $correctResult but got $result")
    }
}