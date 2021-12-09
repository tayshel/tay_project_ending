package example.tay.generator_yes_no

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class BrowserFragment : Fragment() {

    lateinit var openBrowserButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_browser, container, false)

        openBrowserButton = view.findViewById(R.id.open_browser_button)

        openBrowserButton.setOnClickListener {
            val link = Uri.parse ("https://google.com/")
            val intent = Intent (Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }


}