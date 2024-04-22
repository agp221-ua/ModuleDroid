package software.galaniberico.moduledroid

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Assert
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
class IntentManager {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun startActivity() {
        var id = "fail"
        activityRule.scenario.onActivity {
            id = Facade.startActivity(MainActivity2::class.java)
        }

        onView(withId(R.id.tvOk)).check(matches(withText(id)))
    }

    @Test
    fun startActivityWithId() {
        var id = "fail"
        activityRule.scenario.onActivity {
            id = Facade.startActivity(MainActivity2::class.java, "all ok")
        }

        onView(withId(R.id.tvOk)).check(matches(withText("all ok")))
        onView(withId(R.id.tvOk)).check(matches(withText(id)))
    }

    @Test
    fun startActivityForResult() {
        var id = "fail"
        var requestCode = -1
        activityRule.scenario.onActivity {
            val (_id, _requestCode) = Facade.startActivityForResult(MainActivity3::class.java)
            id = _id
            requestCode = _requestCode
        }

        onView(withId(R.id.tvCode)).check(matches(withText(requestCode.toString())))
    }

    @Test
    fun startActivityWithIdForResult() {
        var id = "fail"
        var requestCode = -1
        activityRule.scenario.onActivity {
            val (_id, _requestCode) = Facade.startActivityForResult(MainActivity3::class.java, null, "all ok")
            id = _id
            requestCode = _requestCode
        }

        onView(withId(R.id.tvCode)).check(matches(withText(requestCode.toString())))

    }


    @Test
    fun startActivityForResultCustomCode() {
        var id = "fail"
        var requestCode = -1
        activityRule.scenario.onActivity {
            val (_id, _requestCode) = Facade.startActivityForResult(MainActivity3::class.java, 45)
            id = _id
            requestCode = _requestCode
        }

        onView(withId(R.id.tvCode)).check(matches(withText(requestCode.toString())))
    }

    @Test
    fun startActivityWithIdForResultCustomCode() {
        var id = "fail"
        var requestCode = -1
        activityRule.scenario.onActivity {
            val (_id, _requestCode) = Facade.startActivityForResult(MainActivity3::class.java, 45, "all ok")
            id = _id
            requestCode = _requestCode
        }

        onView(withId(R.id.tvCode)).check(matches(withText(45.toString())))
        onView(withId(R.id.tvCode)).check(matches(withText(requestCode.toString())))

    }


}