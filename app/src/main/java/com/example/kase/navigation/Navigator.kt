package com.example.kase.navigation

import androidx.fragment.app.Fragment

//fun allows Fragments to get access to Navigator
fun Fragment.navigator(): Navigator {
    // navigation by Activity
    return requireActivity() as Navigator
}

interface Navigator {
    fun goToFragment(fragment: Fragment)

    fun goBack()
}