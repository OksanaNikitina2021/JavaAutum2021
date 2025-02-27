package sef.module5.sample;

public class FactorySample {

    public static void main(String arg[]) {

        AdapterInterface adapterA = new WorkerTypeA_Adapter(WorkerFactory.createWorker(WorkerFactory.TYPE_A));
        AdapterInterface adapterB = new WorkerTypeB_Adapter(WorkerFactory.createWorker(WorkerFactory.TYPE_B));
        AdapterInterface adapterC = new WorkerTypeC_Adapter(WorkerFactory.createWorker(WorkerFactory.TYPE_C));

        AdapterClient client = new AdapterClient();
        client.setAdapter(adapterA);
        client.doWork();
        client.setAdapter(adapterB);
        client.doWork();
        client.setAdapter(adapterC);
        client.doWork();

    }
}
