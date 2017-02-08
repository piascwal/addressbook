package com.android.capgemini.addressbook;

import android.provider.BaseColumns;

import com.android.capgemini.addressbook.data.DatabaseDescription;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import java.lang.reflect.Field;

import java.lang.reflect.Modifier;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mpiasco on 02/02/2017.
 */

@RunWith(RobolectricTestRunner.class)
public class DatabaseDescriptionTest {

    @Test
    public void inner_class_exists() throws Exception {
        Class[] innerClasses = DatabaseDescription.class.getDeclaredClasses();
        assertEquals("There should be 1 Inner class inside the contract class", 1, innerClasses.length);
    }

    @Test
    public void inner_class_type_correct() throws Exception {
        Class[] innerClasses = DatabaseDescription.class.getDeclaredClasses();
        assertEquals("Cannot find inner class to complete unit test", 1, innerClasses.length);
        Class entryClass = innerClasses[0];
        assertTrue("Inner class should implement the BaseColumns interface", BaseColumns.class.isAssignableFrom(entryClass));
        assertTrue("Inner class should be final", Modifier.isFinal(entryClass.getModifiers()));
        assertTrue("Inner class should be static", Modifier.isStatic(entryClass.getModifiers()));
    }



}
