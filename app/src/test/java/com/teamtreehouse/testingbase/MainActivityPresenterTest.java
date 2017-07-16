package com.teamtreehouse.testingbase;

import android.graphics.Color;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MainActivityPresenterTest {
    private MainActivityPresenter presenter;

    @Mock
    private MainActivityView view;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setUp() throws Exception {
        presenter = new MainActivityPresenter(view);
    }

    @Test
    public void editTextUpdated() throws Exception {
        // Arrange
        String givenString = "test123";

        // Act
        presenter.editTextUpdated(givenString);

        // Assert
        Mockito.verify(view).changeTextViewText(givenString);
    }

    @Test
    public void colorSelected() throws Exception {
        // Arrange
        int index = 1;
        int givenColor = Color.MAGENTA;

        // Act
        presenter.colorSelected(index);

        // Assert
        Mockito.verify(view).changeBackgroundColor(givenColor);
    }

    @Test
    public void launchOtherActivityButtonClicked() throws Exception {
        // Arrange
        Class clazz = OtherActivity.class;

        // Act
        presenter.launchOtherActivityButtonClicked(clazz);

        // Assert
        Mockito.verify(view).launchOtherActivity(clazz);
    }
}