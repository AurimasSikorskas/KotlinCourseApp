package lt.stuff.aursik.kotlincourseapp.generic

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object DataBindingAdapters {
    @BindingAdapter("android:src")
    @JvmStatic
    fun setImageResource(imageView: ImageView, resource: Int) {
        imageView.setImageResource(resource)
    }
}