public class CustomerTwo implements Customer 
{
    @Override
	//method to update subscriber 2, used by subject
    public void update(Merchandise m) {
        System.out.println("Customer 2:: " + m.getMerchandiseContent());
    }
}
