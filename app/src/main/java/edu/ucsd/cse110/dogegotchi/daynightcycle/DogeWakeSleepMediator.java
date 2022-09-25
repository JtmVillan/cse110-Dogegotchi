package edu.ucsd.cse110.dogegotchi.daynightcycle;

import edu.ucsd.cse110.dogegotchi.doge.Doge;

public class DogeWakeSleepMediator implements IDayNightCycleObserver{
    Doge doge;

    public DogeWakeSleepMediator(Doge doge) {
        this.doge = doge;
    }

    @Override
    public void onPeriodChange(IDayNightCycleObserver.Period newPeriod) {
        if (newPeriod == IDayNightCycleObserver.Period.DAY) {
            doge.wake();
        } else if (newPeriod == IDayNightCycleObserver.Period.NIGHT) {
            doge.sleep();
        }
    }
}
