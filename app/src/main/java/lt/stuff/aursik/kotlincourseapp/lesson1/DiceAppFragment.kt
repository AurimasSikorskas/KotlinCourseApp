package lt.stuff.aursik.kotlincourseapp.lesson1

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lt.stuff.aursik.kotlincourseapp.R

class DiceAppFragment : Fragment() {

    companion object {
        fun newInstance() = DiceAppFragment()
    }

    private lateinit var viewModel: DiceAppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DiceAppViewModel::class.java)
        // TODO: Use the ViewModel
    }

}