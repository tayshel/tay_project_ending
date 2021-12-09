package example.tay.generator_yes_no

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(private val developersName: List<String>):
    RecyclerView.Adapter<DeveloperViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_list_item,parent,false)
        return DeveloperViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DeveloperViewHolder, position: Int) {
        val name = developersName[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return developersName.size
    }
}