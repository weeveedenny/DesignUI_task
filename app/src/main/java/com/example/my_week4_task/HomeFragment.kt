package com.example.my_week4_task

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat.getDrawable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2


class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.my_recycler_view)
        recyclerViewAdapter = RecyclerViewAdapter()
        viewPager = view.findViewById(R.id.viewPager2)
        viewPagerAdapter = ViewPagerAdapter()
        viewPager.adapter = viewPagerAdapter

        val myViewPagerList = getDrawable(requireContext(),R.drawable.ic_card_background_image)?.let {
            ViewPagerItemModel(
                it,
                "Victor"
            )
        }?.let {
            getDrawable(requireContext(), R.drawable.woman)?.let { it1 ->
                ViewPagerItemModel(
                    it1,
                    "Samuel"
                )
            }?.let { it2 ->
                getDrawable(requireContext(), R.drawable.baby2)?.let { it1 ->
                    ViewPagerItemModel(
                        it1,
                        "Michael"
                    )
                }?.let { it3 ->
                    arrayListOf<ViewPagerItemModel>(
                        it,
                        it2,
                        it3

                    )
                }
            }
        }

        if (myViewPagerList != null) {
            viewPagerAdapter.getViewPagerList(myViewPagerList)
        }


        //View pager Animation
        viewPager.setPadding(90, 0, 90, 0)
        viewPager.clipToPadding = false
        viewPager.clipChildren = false
        viewPager.offscreenPageLimit = 3
        viewPager.getChildAt(0).overScrollMode = View.OVER_SCROLL_NEVER

//setting viewpager transformation
        val viewPageTransformer = CompositePageTransformer()
        viewPageTransformer.addTransformer(MarginPageTransformer(10))
        viewPageTransformer.addTransformer { page, position ->
            page.scaleY = 1 - (0.25f * kotlin.math.abs(position))
        }
        viewPager.setPageTransformer(viewPageTransformer)



        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        recyclerViewAdapter.SetTheRecyclerViewList(ourRecyclerViewListItems)
    }
}