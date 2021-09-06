import java.util.ArrayList;
import java.util.List;
 
public class MerchandisePublisher implements Subject {
     
    private List<Customer> observers = new ArrayList<>();
 
    @Override
	// method to attach observers
    public void attach(Customer o) {
        observers.add(o);
    }
 
    @Override
	//method to detach observers
    public void detach(Customer o) {
        observers.remove(o);
    }
 
    @Override
	//method to notify observers of change
    public void notifyUpdate(Merchandise m) {
        for(Customer o: observers) {
            o.update(m);
        }
    }
}
