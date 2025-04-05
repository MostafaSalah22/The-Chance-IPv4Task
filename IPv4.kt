package com.example.ipv4

fun main() {

}


fun isIpv4Valid(ip: String): Boolean {

    //if (ip.isEmpty()) return false

    val segments = ip.split(".")
    if (segments.size != 4) return false

    segments.forEach { segment ->
        if (!isSegmentValid(segment)) return false
    }
    return true
}

fun isSegmentValid(segment: String): Boolean {
    return !((segment.startsWith("0") && segment.length > 1) ||
            segment.toIntOrNull() !in 0..255)
}
