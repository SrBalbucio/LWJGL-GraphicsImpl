package color

import java.awt.Color



class ColorUtil {

    fun getColor(color: Color): Int {
        return getColor(color.red, color.green, color.blue, color.alpha)
    }

    fun getColor(brightness: Int): Int {
        return getColor(brightness, brightness, brightness, 255)
    }

    fun getColor(brightness: Int, alpha: Int): Int {
        return getColor(brightness, brightness, brightness, alpha)
    }

    fun getColor(red: Int, green: Int, blue: Int): Int {
        return getColor(red, green, blue, 255)
    }

    fun getColor(red: Int, green: Int, blue: Int, alpha: Int): Int {
        var color = 0
        color = color or (alpha shl 24)
        color = color or (red shl 16)
        color = color or (green shl 8)
        return blue.let { color = color or it; color }
    }
}