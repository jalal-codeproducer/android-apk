package at.fhj.msd.androidgruppenarbeit

import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    private lateinit var myTextView: TextView

    @Before
    fun setUp() {
        activityScenarioRule.scenario.onActivity {
            myTextView = it.findViewById(R.id.helloWorld)
        }
    }

    @Test
    fun testSetText() {
        val myString = "Hello World!"
        activityScenarioRule.scenario.onActivity {
            it.findViewById<TextView>(R.id.helloWorld).text = myString
        }

        assertEquals(myString, myTextView.text)
    }

}