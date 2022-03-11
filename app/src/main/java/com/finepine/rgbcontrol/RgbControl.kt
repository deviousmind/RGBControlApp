package com.finepine.rgbcontrol

import androidx.appcompat.app.AppCompatActivity
import com.finepine.rgbcontrol.databinding.RgbControlBinding
import android.os.Bundle

class RgbControl : AppCompatActivity() {

    private lateinit var binding : RgbControlBinding
    private lateinit var commander : RGBCommander

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RgbControlBinding.inflate(layoutInflater)
        setContentView(binding.root)

        commander = RGBCommander()

        binding.red.setOnClickListener { commander.send(Commands.RED.toString()) }
        binding.green.setOnClickListener { commander.send(Commands.GREEN.toString()) }
        binding.blue.setOnClickListener { commander.send(Commands.BLUE.toString()) }
        binding.power.setOnClickListener { commander.send(Commands.POWER.toString()) }
        binding.reset.setOnClickListener { commander.send(Commands.RESET.toString()) }
    }
}

class RGBCommander() {
    fun send(command:String){
        /* no-op */
    }
}

enum class Commands{
    RESET,
    POWER,
    RED,
    GREEN,
    BLUE
}