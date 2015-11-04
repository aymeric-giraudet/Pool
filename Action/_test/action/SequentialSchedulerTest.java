package action;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import resources.BasketPool;
import resources.CubiclePool;

public class SequentialSchedulerTest extends ActionTest{
	protected SequentialScheduler seqScheduler;

	@Before
	public void init(){
		seqScheduler = new SequentialScheduler();
	}
	
	@Override
	public Action createAction() {
		return seqScheduler;
	}

	@Override
	public Action createFinishedAction() throws ActionFinishedException, ActionNotInitializedException {
		for (int i = 0; i < 10; i++) {
			seqScheduler.doStep();
		}
		return seqScheduler;
	}
	
	@Test
	public void reallyDoStepTest() throws ActionFinishedException, ActionNotInitializedException{
		seqScheduler.addAction(new Swimmer(Integer.toString(1), new BasketPool(1), new CubiclePool(1), 1, 1, 1));
		seqScheduler.reallyDoStep();
		assertTrue(seqScheduler.getListAction().isEmpty());
	}
}
