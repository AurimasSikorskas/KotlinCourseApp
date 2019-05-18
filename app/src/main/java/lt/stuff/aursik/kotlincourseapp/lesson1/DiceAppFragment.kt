package lt.stuff.aursik.kotlincourseapp.lesson1

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_dice_app.*
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
        return inflater.inflate(R.layout.fragment_dice_app, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DiceAppViewModel::class.java)
        roll_button.setOnClickListener { Toast.makeText(context, "button clicked", Toast.LENGTH_SHORT).show() }
    }
}
