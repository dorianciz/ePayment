package travelsafe.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorian on 11/22/2016.
 */
@Entity
@Table(name = "travel_insurance")
public class TravelInsurance {

    @Id
    @GeneratedValue
    @Column(name = "ti_id")
    private Long id;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "region")
    private String region;

    @Column(name = "number_of_people")
    private Long numberOfPeople;

    @Column(name = "amount")
    private Double amount;

    @OneToMany(mappedBy = "travelInsurance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<HomeInsurance> homeInsurances = new ArrayList<>();

    @OneToMany(mappedBy = "travelInsurance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CarInsurance> carInsurances = new ArrayList<>();

    @OneToMany(mappedBy = "travelInsurance", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ParticipantInInsurance> participantInInsurances = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ir_id")
    private InsuranceRebate insuranceRebate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "price_id")
    private Price price;

    public TravelInsurance(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<ParticipantInInsurance> getParticipantInInsurances() {
        return participantInInsurances;
    }

    public void setParticipantInInsurances(List<ParticipantInInsurance> participantInInsurances) {
        this.participantInInsurances = participantInInsurances;
    }

    public InsuranceRebate getInsuranceRebate() {
        return insuranceRebate;
    }

    public void setInsuranceRebate(InsuranceRebate insuranceRebate) {
        this.insuranceRebate = insuranceRebate;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<HomeInsurance> getHomeInsurances() {
        return homeInsurances;
    }

    public void setHomeInsurances(List<HomeInsurance> homeInsurances) {
        this.homeInsurances = homeInsurances;
    }
}