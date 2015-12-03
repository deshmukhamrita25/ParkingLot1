package parking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP2 on 12/02/2015.
 */
public class ParkTest {



    //@InjectMocks


   /* @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

    }*/


    @Test
    public void testPark() {
        Park park = new Park(10);
        Vehicle car = new Vehicle();
        //when(slot.isSlotAvailable()).thenReturn(true);
        assertTrue(park.park(car));
    }

    @Test
    public void testCarCanNotBeParkedTwice() throws Exception {
        Park park = new Park(10);
        Vehicle car = new Vehicle();
        //when(slot.isSlotAvailable()).thenReturn(true);
        assertTrue(park.park(car));
        assertFalse(park.park(car));
    }

    @Test
    public void testSlotUnavailable() throws Exception {
        Vehicle car = new Vehicle();
        Park park = new Park(1);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park);
        AirportSecurityPersonal airportSecurityPersonal = new AirportSecurityPersonal(park);
        park.park(new Vehicle());
        assertFalse(park.park(car));

    }

    @Test
    public void allowToUnpark() throws CarNotFoundException {
        Park park1 = new Park(10);
        Vehicle car = new Vehicle();
        park1.park(car);
        assertTrue(park1.unPark(car));
    }

    @Test(expected = CarNotFoundException.class)
    public void unparkThrowsExceptionCarNotFound() throws CarNotFoundException {
        Park park1 = new Park(10);
        Vehicle car = new Vehicle();
        park1.park(car);
        park1.unPark(new Vehicle());
    }

    @Test
    public void testParkingIsFull() {

        Park park = new Park(2);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park);
        AirportSecurityPersonal airportSecurityPersonal = new AirportSecurityPersonal(park);

        park.park(new Vehicle());
        park.park(new Vehicle());

        assertTrue(parkingLotManager.isParkingFull);
    }



    @Test

    public void testIsNotifiedtoAirportSecurityPersonal() {

        Park park=new Park(1);
        AirportSecurityPersonal airportSecurityPersonal = new AirportSecurityPersonal(park);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park);
        park.park(new Vehicle());
        park.park(new Vehicle());

        assertTrue(airportSecurityPersonal.isNotified);

    }

    @Test
    public void testNotifyWhenParkingIsAvailableAgain() throws CarNotFoundException {
        Park park=new Park(1);
        Vehicle car = new Vehicle();
        AirportSecurityPersonal airportSecurityPersonal = new AirportSecurityPersonal(park);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park);
        park.park(car);
        park.park(new Vehicle());

        assertTrue(airportSecurityPersonal.isNotified);
        assertTrue(parkingLotManager.isParkingFull);

        park.unPark(car);
        assertFalse(airportSecurityPersonal.isNotified);
        assertFalse(parkingLotManager.isParkingFull);
    }

    @Test
    public void dummy() {
    }
}