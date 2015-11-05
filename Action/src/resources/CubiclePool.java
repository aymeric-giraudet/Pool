package resources;

public class CubiclePool extends ResourcePool<Cubicle> {

	/**
	 * Implementation of abstract class ResourcePool.
	 */
	@Override
	public Cubicle createResource() {
		return new Cubicle();
	}

	public CubiclePool(int nbResource) {
		super(nbResource);
	}

}