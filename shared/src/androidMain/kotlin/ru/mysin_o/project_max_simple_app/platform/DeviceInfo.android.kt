package ru.mysin_o.project_max_simple_app.platform

import android.content.res.Resources
import android.os.Build
import kotlin.math.roundToInt

actual class DeviceInfo actual constructor() {
    private val displayMetrics = Resources.getSystem().displayMetrics

    actual val osName = "Android"

    actual val osVersion = "${Build.VERSION.SDK_INT}"

    actual val model = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.DONUT) {
        "${Build.MANUFACTURER} ${Build.MODEL}"
    } else {
        "Unknown model"
    }

    actual val cpu = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        Build.SUPPORTED_ABIS.firstOrNull() ?: "Unknown cpu"
    } else {
        "Unknown cpu"
    }

    actual val screenWidth = displayMetrics.widthPixels

    actual val screenHeight = displayMetrics.heightPixels

    actual val screenDestiny = displayMetrics.density.roundToInt()

    actual fun getSummary() =
        "osName: $osName\n" +
                "osVersion: $osVersion\n" +
                "model: $model\n" +
                "cpu: $cpu\n" +
                "screenWidth: $screenWidth\n" +
                "screenHeight: $screenHeight\n" +
                "screenDestiny: $screenDestiny"
}