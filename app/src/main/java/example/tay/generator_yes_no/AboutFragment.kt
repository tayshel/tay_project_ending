package example.tay.generator_yes_no

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AboutFragment : Fragment() {

    lateinit var developersRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val developersNames: List<String> = listOf("Tatiana", "Maxim")

        developersRecyclerView = view.findViewById(R.id.developer_recycler_view)
        developersRecyclerView.layoutManager =
        LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        developersRecyclerView.adapter=DeveloperAdapter(developersNames)

        return view
    }


}