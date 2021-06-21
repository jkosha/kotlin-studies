package jetbrainscourseracourse.controlstructures

import jetbrainscourseracourse.controlstructures.Color.*

enum class Color {
    BLUE, ORANGE, RED
}


fun getDescription(color: Color): String =
    when (color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        else  -> "hot"
    }
