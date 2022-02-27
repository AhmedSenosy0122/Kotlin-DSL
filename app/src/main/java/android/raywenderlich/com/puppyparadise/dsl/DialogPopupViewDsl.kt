package android.raywenderlich.com.puppyparadise.dsl

import android.raywenderlich.com.puppyparadise.DialogPopupView

fun dialogPopupView(lambda: DialogPopupView.DialogPopupBuilder.() -> Unit) =
    DialogPopupView.DialogPopupBuilder()
        .apply(lambda)
        .build()