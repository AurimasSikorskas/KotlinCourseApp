package lt.stuff.aursik.kotlincourseapp.lesson1

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.databinding.Bindable
import lt.stuff.aursik.kotlincourseapp.BR

import lt.stuff.aursik.kotlincourseapp.R
import lt.stuff.aursik.kotlincourseapp.generic.BaseViewModel
import java.util.*

class DiceAppViewModel : BaseViewModel(){
    @get:Bindable
    @DrawableRes var diceImage: Int = R.drawable.empty_dice
    set(value) {
        field = when(value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        notifyChange()
    }


    fun rollDice() {
        diceImage = Random().nextInt(6)+1
    }
}
