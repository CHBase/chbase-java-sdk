package com.chbase.jaxb;

import java.util.Calendar;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.imposters.ByteBuddyClassImposteriser;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.chbase.thing.oxm.jaxb.dates.DateTime;

import junit.framework.Assert;

@RunWith(JMock.class)
public class DateTimeTest {

	private Mockery context = new JUnit4Mockery() {
		{
			setImposteriser(ByteBuddyClassImposteriser.INSTANCE);
		}
	};

	/**
	 * Create the test case
	 *
	 */
	public DateTimeTest() {
	}

	@Test
	public void TestRoundTrip() {
		Calendar cal = Calendar.getInstance();
		DateTime dt = DateTime.fromCalendar(cal);
		Calendar cal2 = dt.toCalendar();

		Assert.assertEquals(cal.get(Calendar.YEAR), cal2.get(Calendar.YEAR));
		Assert.assertEquals(cal.get(Calendar.DATE), cal2.get(Calendar.DATE));
		Assert.assertEquals(cal.get(Calendar.MONTH), cal2.get(Calendar.MONTH));
		Assert.assertEquals(cal.get(Calendar.HOUR), cal2.get(Calendar.HOUR));
		Assert.assertEquals(cal.get(Calendar.MINUTE), cal2.get(Calendar.MINUTE));
		Assert.assertEquals(cal.get(Calendar.SECOND), cal2.get(Calendar.SECOND));
		Assert.assertEquals(cal.get(Calendar.MILLISECOND), cal2.get(Calendar.MILLISECOND));
	}

	@Test
	public void TestOptionalSeconds() {
		Calendar cal = Calendar.getInstance();
		DateTime dt = DateTime.fromCalendar(cal);
		dt.getTime().setS(null);
		Calendar cal2 = dt.toCalendar();

		Assert.assertEquals(cal.get(Calendar.YEAR), cal2.get(Calendar.YEAR));
		Assert.assertEquals(cal.get(Calendar.DATE), cal2.get(Calendar.DATE));
		Assert.assertEquals(cal.get(Calendar.MONTH), cal2.get(Calendar.MONTH));
		Assert.assertEquals(cal.get(Calendar.HOUR), cal2.get(Calendar.HOUR));
		Assert.assertEquals(cal.get(Calendar.MINUTE), cal2.get(Calendar.MINUTE));
		Assert.assertEquals(0, cal2.get(Calendar.SECOND));
		Assert.assertEquals(cal.get(Calendar.MILLISECOND), cal2.get(Calendar.MILLISECOND));
	}

	@Test
	public void TestOptionalMilliseconds() {
		Calendar cal = Calendar.getInstance();
		DateTime dt = DateTime.fromCalendar(cal);
		dt.getTime().setF(null);
		Calendar cal2 = dt.toCalendar();

		Assert.assertEquals(cal.get(Calendar.YEAR), cal2.get(Calendar.YEAR));
		Assert.assertEquals(cal.get(Calendar.DATE), cal2.get(Calendar.DATE));
		Assert.assertEquals(cal.get(Calendar.MONTH), cal2.get(Calendar.MONTH));
		Assert.assertEquals(cal.get(Calendar.HOUR), cal2.get(Calendar.HOUR));
		Assert.assertEquals(cal.get(Calendar.MINUTE), cal2.get(Calendar.MINUTE));
		Assert.assertEquals(cal.get(Calendar.SECOND), cal2.get(Calendar.SECOND));
		Assert.assertEquals(0, cal2.get(Calendar.MILLISECOND));
	}
}
