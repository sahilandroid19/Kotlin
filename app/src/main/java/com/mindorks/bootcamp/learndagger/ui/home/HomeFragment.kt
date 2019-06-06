package com.mindorks.bootcamp.learndagger.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.R
import javax.inject.Inject

class HomeFragment : Fragment() {

    @Inject
    lateinit var viewModel: HomeViewModel

    companion object {
        val TAG = "HomeFragment"

        fun newInstance(): HomeFragment {
            val args: Bundle = Bundle()
            return HomeFragment().apply {
                arguments = args
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (view.findViewById(R.id.tv_message) as TextView).apply {
            setText(viewModel.getSomeData())
        }
    }

    private fun getDependencies() {
        /*
        DaggerFragmentComponent
                .builder()
                .applicationComponent((context?.applicationContext as MyApplication).applicationComponent)
                .fragmentModule(FragmentModule(this))
                .build()
                .inject(this)
                */
    }
}