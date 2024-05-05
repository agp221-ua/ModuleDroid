package software.galaniberico.moduledroid

import android.app.Activity
import android.os.Bundle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import software.galaniberico.moduledroid.facade.Facade

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ActivityLifecycle {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun currentActivityOk() {
        activityRule.scenario.onActivity {
            assertEquals(it, Facade.getCurrentActivity())
        }
    }

    @Test
    fun currentActivityOk2() {
        activityRule.scenario.onActivity {
            Facade.addOnCreateSubscription { _: Activity, _: Bundle? ->
                assertEquals(it, Facade.getCurrentActivity())
            }
            Facade.startActivity(MainActivity2::class.java)

        }
            onView(ViewMatchers.isRoot()).perform(ViewActions.pressBack())
    }


}