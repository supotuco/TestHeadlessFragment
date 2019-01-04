package com.example.diegovela.testheadlessfragment

import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragment
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun launch() {

        launchFragment<HFragment>(
            fragmentArgs = null,
            factory = FragmentFactory()
        )

        onView(withText("Title"))
            .check(matches(isDisplayed()))
    }
}
