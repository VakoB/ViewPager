package com.example.inclass2.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.inclass2.fragments.FirstFragment
import com.example.inclass2.fragments.SecondFragment
import com.example.inclass2.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if (position == 0){
            return FirstFragment()
        }
        else if (position == 1) {
            return SecondFragment()
        }
        else{
            return ThirdFragment()

        }


    }

}