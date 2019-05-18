package lt.stuff.aursik.kotlincourseapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import lt.stuff.aursik.kotlincourseapp

..MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}