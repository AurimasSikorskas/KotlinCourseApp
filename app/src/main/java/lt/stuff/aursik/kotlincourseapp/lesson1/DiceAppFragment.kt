package lt.stuff.aursik.kotlincourseapp.lesson1

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_dice_app.*
import lt.stuff.aursik.kotlincourseapp.R
import lt.stuff.aursik.kotlincourseapp.databinding.FragmentDiceAppBinding

class DiceAppFragment : Fragment() {

    companion object {
        fun newInstance() = DiceAppFragment()
    }

    private lateinit var vm: DiceAppViewModel
    private lateinit var binding: FragmentDiceAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dice_app, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        vm = ViewModelProviders.of(this).get(DiceAppViewModel::class.java)
        binding.vm = vm
        roll_button.setOnClickListener {vm.rollDice()}
    }
}
