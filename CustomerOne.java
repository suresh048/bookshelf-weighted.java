public class CustomerOne implements Customer 
{
    @Override
	//method to update customer 1, used by subject
    public void update(Merchandise m) {
        System.out.println("Customer 1 :: " + m.getMerchandiseContent());
    }
}
