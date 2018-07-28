package gridview.ado.com.gridviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import gridview.ado.com.gridviewsample.dummy.DummyContent

class GridActivity : ItemFragment.OnListFragmentInteractionListener , AppCompatActivity() {

    override fun onListFragmentInteraction(item: DummyContent.DummyItem) {
        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
    }
}
