package travelsafe;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travelsafe.model.*;
import travelsafe.service.impl.TravelInsuranceService;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dorian on 2/3/2017.
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TravelsafeApplication.class)
public class TravelInsuranceServiceTest {

    @Autowired
    private TravelInsuranceService travelInsuranceService;

    @Test
    public void testValidation(){
        assertEquals(true, travelInsuranceService.validation(getTravelInsurance()));
    }

    private TravelInsurance getTravelInsurance(){
        TravelInsurance t = new TravelInsurance();
        t.setDuration(5L);
        t.setNumberOfPeople(5L);
        t.setTotalPrice(2000D);

        ParticipantInInsurance pi1 = new ParticipantInInsurance();
        pi1.setName("Steva");
        pi1.setSurname("Poso");
        pi1.setCarrier(false);
        pi1.setEmail("steva.poso@gmail.com");
        pi1.setAddress("Adresa 1");
        pi1.setDateOfBirth(new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime());
        pi1.setPassportNumber("123455");
        pi1.setPin("1234567890123");

        ParticipantInInsurance pi2 = new ParticipantInInsurance();
        pi2.setName("Branislav");
        pi2.setSurname("Cogic");
        pi2.setCarrier(true);
        pi2.setEmail("bane93@gmail.com");
        pi2.setAddress("Adresa 1");
        pi2.setDateOfBirth(new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime());
        pi2.setPassportNumber("123455");
        pi2.setPin("1234567890123");
        List<ParticipantInInsurance> pis = new ArrayList<>();
        pis.add(pi1);
        pis.add(pi2);
        t.setParticipantInInsurances(pis);


        Item regionItem = new Item();
        regionItem.setName_en("Spain");
        t.setRegion(regionItem);

        Price price = new Price();
        price.setAmount(100D);
        t.setPrice(price);

        Item maxAmountItem = new Item();
        maxAmountItem.setName_en("1000 $");
        t.setMaxAmount(maxAmountItem);

        CarInsurance ci = new CarInsurance();
        ci.setBrand("BMW");
        ci.setChassisNumber("1654AD8Q56PO");
        ci.setOwnersName("Branislav");
        ci.setOwnersSurname("Cogic");
        ci.setOwnersPIN("1234567890123");
        ci.setRegistrationNumber("NS 012-BC");
        ci.setType("Car");
        ci.setYearOfProduction(2011L);

        List<CarInsurance> cis = new ArrayList<>();
        cis.add(ci);

        t.setCarInsurances(cis);
        t.setHomeInsurances(null);

        return t;
    }

}
