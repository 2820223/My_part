package uz.itschool.foodee

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import uz.itschool.foodee.databinding.ListItemBinding

class FoodInfoAdapter(context: Context, var users: MutableList<Food>) :
    ArrayAdapter<Food>(context, R.layout.activity_main, users) {

    override fun getCount(): Int {
        return users.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val userItem: ListItemBinding
        if (convertView == null) {
            userItem = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            Log.d("TAG", "create: $position")
        }
        else {
            userItem = ListItemBinding.bind(convertView)
            Log.d("TAG", "update: $position")
        }

        val user = users[position]
        userItem.name.text = user.name
        userItem.view.setBackgroundColor(user.color)
        userItem.imageView.setImageResource(user.img)
        userItem.text2.setTextColor(user.color)
        userItem.protein.text = user.protein
        userItem.calory.text = user.calory
        userItem.carbs.text = user.carb
        userItem.fats.text = user.fat
        userItem.info.text = user.info

        return userItem.root
    }
}

