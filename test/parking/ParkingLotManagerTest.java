package parking;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by HP2 on 12/03/2015.
 */
public class ParkingLotManagerTest {

    @Test
    public void testParkToNearest(){
        Park park1 = Mockito.mock(Park.class);
        Park park2 = Mockito.mock(Park.class);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park1);
        parkingLotManager.addParkingLot(park2);
        when(park1.getDistance()).thenReturn(2);
        when(park2.getDistance()).thenReturn(1);

        assertEquals(park2, parkingLotManager.directParkingToAttendantToNearest());
    }

    @Test
    public void testSelectLargeParkingLotBasedOnCapacity() throws Exception {
        Park park1 = new Park(4);
        Park park2 = new Park(2);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park1);
        parkingLotManager.addParkingLot(park2);

        assertEquals(park1.capacity, parkingLotManager.directParkingToAttendant().capacity);
    }

    @Test
    public void testSelectParkingLotBasedOnAvailableSpace() throws Exception {
        Park park1 = new Park(2);
        Park park2 = new Park(1);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park1);
        parkingLotManager.addParkingLot(park2);
        park1.park(new Vehicle());
        park1.park(new Vehicle());

        assertEquals(park2.capacity, parkingLotManager.directParkingToAttendant().capacity);
    }

    @Test
    public void testSelectParkingLotBasedOnMaxFreeSpace() throws Exception {
        Park park1 = new Park(4);
        Park park2 = new Park(3);
        ParkingLotManager parkingLotManager = new ParkingLotManager(park1);
        parkingLotManager.addParkingLot(park2);
        park1.park(new Vehicle());
        park1.park(new Vehicle());

        assertEquals(park2.capacity, parkingLotManager.directParkingToAttendant().capacity);
    }

}