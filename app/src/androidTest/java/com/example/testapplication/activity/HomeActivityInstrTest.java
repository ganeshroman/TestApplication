package com.example.testapplication.activity;

/*public class HomeActivityInstrTest {

}*/

import org.junit.Test;

//@MediumTest
//@RunWith(AndroidJUnit4.class)
public class HomeActivityInstrTest {

    /*@Rule
    public ActivityTestRule<HomeActivity> rule  = new  ActivityScenarioRule<>(HomeActivity.class);
*/
    @Test
    public void ensureListViewIsPresent() throws Exception {
       /* HomeActivity activity = (HomeActivity) rule.getScenario();
        View viewById = activity.findViewById(R.id.listview);
        assertThat(viewById,notNullValue());
        assertThat(viewById, instanceOf(ListView.class));
        ListView listView = (ListView) viewById;
        ListAdapter adapter = listView.getAdapter();
        assertThat(adapter, instanceOf(ArrayAdapter.class));
        assertThat(adapter.getCount(), greaterThan(5));*/
    }
}



