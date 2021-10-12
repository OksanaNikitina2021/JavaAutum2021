package sef.module5.sample;

public class AdapterSample {

    //AdapterClient needs AdapterInterface as parameter
    //but the implementation details is found in Worker interface implementation

    public static void main(String arg[]) {

        //Implementation that's not compatible to the AdapterClient
        Worker a = new WorkerImplA();
        Worker b = new WorkerImplB();
        Worker c = new WorkerImplC();

        //Implementation that converts the incompatible implementation
        //to a compatible one using composition
        AdapterInterface adapterA = new WorkerTypeA_Adapter(a);
        AdapterInterface adapterB = new WorkerTypeB_Adapter(b);
        AdapterInterface adapterC = new WorkerTypeC_Adapter(c);

        //Strategy pattern used below
        //refer to module 7 sample on Stategy.java for more info
        AdapterClient client = new AdapterClient();
        client.setAdapter(adapterA);
        client.doWork();
        client.setAdapter(adapterB);
        client.doWork();
        client.setAdapter(adapterC);
        client.doWork();

    }
}
