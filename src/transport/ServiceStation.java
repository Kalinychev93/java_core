package transport;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

//    Метод добавить авто в очередь
    public void addTransport(Transport transport){
        if(transport.checkTransportNeedService()){
            queue.add(transport);
        }
    }

//    Метод провести тех.обслуживание авто
    public void carryOutInspection(Queue<Transport> queue){
        if (queue.isEmpty()) {
            System.out.println("У данного транспортного средства нет механиков");
        } else {
            while (!queue.isEmpty()) {
                Transport currentTransport = queue.poll();
                List<Mechanic> mechanics = currentTransport.getMechanicList();
                for (Mechanic mechanic: mechanics) {
                    mechanic.carryOutMaintenance(currentTransport);
                }
            }
        }
    }
}

