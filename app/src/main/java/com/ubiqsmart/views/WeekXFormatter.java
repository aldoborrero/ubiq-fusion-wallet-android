package com.ubiqsmart.views;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeekXFormatter implements IAxisValueFormatter {

  private GregorianCalendar c = new GregorianCalendar();

  @Override public String getFormattedValue(float value, AxisBase axis) {
    c.setTimeInMillis(((long) (value)) * 1000);
    return c.get(Calendar.DAY_OF_MONTH) + ". ";
  }
}