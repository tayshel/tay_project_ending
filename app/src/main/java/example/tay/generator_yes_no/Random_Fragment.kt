package example.tay.generator_yes_no

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class Random_Fragment : Fragment() {

    lateinit var randomImageView: ImageView
    lateinit var randomButton: Button

    private val answerImageList :List<Int> = listOf(
        R.drawable.yes_icon,
        R.drawable.no_icon,
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_random_, container, false)

        randomImageView = view.findViewById(R.id.random_image_view)
        randomButton = view.findViewById(R.id.random_button)

        randomButton.setOnClickListener {
            randomImageView.setImageResource(answerImageList.random())

        }


        return view
    }

}