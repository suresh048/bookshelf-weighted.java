public class CustomerThree implements Customer 
{
    @Override
	//method to update subscriber 3, used by subject
    public void update(Merchandise m) {
        System.out.println("Customer 3 :: " + m.getMerchandiseContent());
    }
}
