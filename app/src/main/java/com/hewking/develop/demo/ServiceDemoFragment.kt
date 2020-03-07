package com.hewking.develop.demo

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.hewking.develop.R
import kotlinx.android.synthetic.main.activity_main.view.*

class ServiceDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout = FrameLayout(context!!)
        layout.setBackgroundColor(Color.WHITE)
        val tv = TextView(context).also {
            it.text = "我爱你"
        }
        layout.addView(tv,FrameLayout.LayoutParams(-1,-1).also {
            it.gravity = Gravity.CENTER
        })
        return layout
    }

}