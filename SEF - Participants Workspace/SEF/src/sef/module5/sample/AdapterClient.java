package sef.module5.sample;

public class AdapterClient {

    private AdapterInterface ai;

    public void setAdapter(AdapterInterface ai) {
        this.ai = ai;
    }

    public void doWork() {
        ai.execute();
    }

}
