package lt.stuff.aursik.kotlincourseapp.generic

import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel(), Observable {
    @Transient
    private var registry: PropertyChangeRegistry = PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback) {
        registry.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback) {
        registry.remove(callback)
    }

    fun notifyChange() {
        registry.notifyCallbacks(this, 0, null)
    }

    fun notifyPropertyChanged(fieldId: Int) {
        registry.notifyCallbacks(this, fieldId, null)
    }
}