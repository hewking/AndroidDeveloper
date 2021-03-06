package com.hewking.develop.demo

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.graphics.Color
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hewking.develop.R
import com.hewking.develop.demo.aidl.MusicManager
import kotlinx.android.synthetic.main.activity_main.view.*

class ServiceDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout = LinearLayout(requireContext())
        layout.setBackgroundColor(Color.WHITE)
        val tv = Button(context).also {
            it.text = "开启MusicManager AIDL 服务"
            it.setOnClickListener {
            }
        }
        layout.addView(tv,LinearLayout.LayoutParams(-2,-2).also {
            it.gravity = Gravity.CENTER
        })

        return layout
    }

}