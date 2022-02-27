package android.raywenderlich.com.puppyparadise.dsl.puppybuider

import android.raywenderlich.com.puppyparadise.Puppy

@PuppyDslMarker
class Puppies:ArrayList<Puppy>() {
    fun puppy(puppyBuilder: PuppyBuilder.() -> Unit) {
        add(PuppyBuilder().apply(puppyBuilder).build())
    }
}
@PuppyDslMarker
class PuppyViewModelBuilder {
    private val puppies = mutableListOf<Puppy>()

    fun puppies(puppiesList: Puppies.() -> Unit) {
        puppies.addAll(Puppies().apply(puppiesList))
    }

    fun build(): ArrayList<Puppy> = ArrayList(puppies)
}
fun puppyViewModel(puppies: PuppyViewModelBuilder.() -> Unit): ArrayList<Puppy> =
    PuppyViewModelBuilder().apply(puppies).build()

@DslMarker
annotation class PuppyDslMarker