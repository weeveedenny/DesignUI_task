package com.example.my_week4_task

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment

val ourRecyclerViewListItems = arrayListOf<RecyclerViewModel>(
    RecyclerViewModel(
        R.drawable.vectorfirst,
        "Ola Machiavelli",
        "10. 20. 2020",
        "30 days left",
        Color.BLUE
    ),
    RecyclerViewModel(
        R.drawable.vectorsecond,
        "Samuel Garfield",
        "10. 20. 2020",
        "30 days left",
        Color.RED
    ),
    RecyclerViewModel(
        R.drawable.vectorthird,
        "Komo Holmes",
        "10. 20. 2020",
        "30 days left",
        Color.MAGENTA
    ),
    RecyclerViewModel(
        R.drawable.vector__5_,
        "Omolade Rogers",
        "10. 20. 2020",
        "30 days left",
        Color.YELLOW
    ),
    RecyclerViewModel(
        R.drawable.untitleddenn__1_,
        "Dennis Odalonu",
        "1. 11. 1920",
        "3 days left",
        Color.BLUE
    ),
    RecyclerViewModel(
        R.drawable.untitledarabman,
        "Ryan Bally",
        "4. 15. 1972",
        "180 days left",
        Color.BLACK
    ),
    RecyclerViewModel(
        R.drawable.man_1,
        "Billy Banky",
        "24.2.2011",
        "200 days left",
        Color.YELLOW
    ),
    RecyclerViewModel(
        R.drawable.photo_3,
        "Shinzu Money",
        "7.18.1999",
        "72 days left",
        Color.RED
    )
)

