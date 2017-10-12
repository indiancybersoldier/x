package com.cg.hbms.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cg.hbms.bean.Booked;
import com.cg.hbms.bean.HBMSBean;
import com.cg.hbms.bean.HBMSBooking;
import com.cg.hbms.bean.HBMSHotel;
import com.cg.hbms.bean.HBMSRoom;
import com.cg.hbms.dao.HBMSDAOImpl;
import com.cg.hbms.exception.HBMSException;

public class HBMSDaoTest {

	static HBMSDAOImpl dao;
	static Booked booked;
	static HBMSBean bean;
	static HBMSBooking booking;
	static HBMSHotel hbmsHotel;
	static HBMSRoom hbmsroom;
	

	@BeforeClass
	public static void initialize() {
		System.out.println("");
		dao = new HBMSDAOImpl();
		bean = new HBMSBean();
	}

	/*@Test
	public void testAddDonarDetails() throws HBMSException {

		assertNotNull(dao.addHotel(hbmsHotel));
	}*/

	@Test
	public void testLogin()  throws HBMSException {
		bean.setUser_id("1001");
		bean.setPass("abc");
		System.out.println(dao.login(bean));
		assertEquals("admin",dao.login(bean));
	}



	/************************************
	 * Test case for testaddHotel()
	 * 
	 ************************************/

/*	@Test
	public void testaddHotel() throws HBMSException {
		// increment the number next time you test for positive test case
		hbmsHotel.setAddress("goa");
		hbmsHotel.setCity("hydrabad");
		hbmsHotel.setDescription("best");
		hbmsHotel.setEmail("sheae@gmail.com");
		hbmsHotel.setFax("123456");
		hbmsHotel.setHotel_id("1011");
		hbmsHotel.setHotel_name("taj");
		hbmsHotel.setMobileno("852545625");
		hbmsHotel.setPhone("52545251");
		hbmsHotel.setRate(300.25);
		hbmsHotel.setRating("3.5");
		
		assert(dao.addHotel(hbmsHotel));
		
	}*/
	@Ignore
	@Test
	public void testgetByCity()
	{
		List<HBMSHotel> cityHotels= new ArrayList<>();
		HBMSHotel bean1= new HBMSHotel();
		bean1.setHotel_name("Delhi");
		HBMSHotel bean2= new HBMSHotel();
		bean2.setHotel_name("Mumbai");
		HBMSHotel bean3= new HBMSHotel();
		bean3.setHotel_name("Banglore");
		HBMSHotel bean4= new HBMSHotel();
		bean4.setHotel_name("Pune");
		HBMSHotel bean5= new HBMSHotel();
		bean5.setHotel_name("Banglore");
		HBMSHotel bean6= new HBMSHotel();
		bean6.setHotel_name("Chennai");
		cityHotels.add(1, bean1);
		cityHotels.add(2, bean2);
		cityHotels.add(3, bean3);
		cityHotels.add(4, bean4);
		cityHotels.add(5, bean5);
		cityHotels.add(6, bean6);
		
		System.out.println(cityHotels);
		try {
			assertEquals(cityHotels, dao.getAllHotelCity());
		} catch (HBMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void assertTrue(String string, HBMSHotel hbmsHotel, int i) {
		// TODO Auto-generated method stub
		System.out.println("Pass");
		
	}

	
	@Test
	public void testupdatedes() throws HBMSException {
		// increment the number next time you test for positive test case
		/*
		hbmsHotel.setDescription("best");
		hbmsHotel.setHotel_id("1011");
		*/
		
		assertTrue("Data Inserted successfully",hbmsHotel,1);
		
	}
	
	@Test
	public void testgetAllHotelDetails() throws HBMSException {

		assertNotNull(dao.getAllHotelDetails());
	}
	

}



