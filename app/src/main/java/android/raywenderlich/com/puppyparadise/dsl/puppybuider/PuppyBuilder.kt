package android.raywenderlich.com.puppyparadise.dsl.puppybuider

import android.raywenderlich.com.puppyparadise.Puppy
@PuppyDslMarker
class PuppyBuilder {
    var isLiked: Boolean = false
    var imageResourceId: Int = 0

    fun build(): Puppy = Puppy(isLiked, imageResourceId)
}