package com.spellad.testtrain;

import android.support.test.filters.SmallTest;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by m7md07sn on 31/01/2017.
 */

public class MainTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testEditText() {
        EditText editText = (EditText) getActivity().findViewById(R.id.editText);
        assertNotNull(editText);
    }

    @SmallTest
    public void testButton() {
        Button button = (Button) getActivity().findViewById(R.id.button);
        assertNotNull(button);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


}
