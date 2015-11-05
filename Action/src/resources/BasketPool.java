package resources;

public class BasketPool extends ResourcePool<Basket> {
	/**
	 * Implementation of abstract class ResourcePool.
	 */
	@Override
	public Basket createResource() {
		return new Basket();
	}

	public BasketPool(int nbResource) {
		super(nbResource);
	}
}