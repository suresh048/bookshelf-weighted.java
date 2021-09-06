public interface Subject 
{
    public void attach(Customer o);
    public void detach(Customer o);
    public void notifyUpdate(Merchandise m);
}
