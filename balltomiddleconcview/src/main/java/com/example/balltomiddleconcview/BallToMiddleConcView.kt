package com.example.balltomiddleconcview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#3F51B5",
    "#004D40",
    "#BF360C",
    "#00C853"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val strokeFactor : Float = 90f
val sizeFactor : Float = 4.9f
val ballFactor : Float = 12.9f
val delay : Long = 20
val deg : Float = 270f
val backColor : Int = Color.parseColor("#BDBDBD")