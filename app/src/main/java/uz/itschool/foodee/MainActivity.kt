package uz.itschool.foodee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.foodee.databinding.ListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ListItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ListItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val users= mutableListOf<Food>()
        users.add(Food("Burger",R.drawable.burger, R.color.pink,"BU burger"," 56 g","34 g","21 g"," 34 g"))
    }
}