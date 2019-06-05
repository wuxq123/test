package wxq.jmockit;

import org.junit.Assert;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class TaskServiceTest {
	@Mocked
	private App system;

	@Test
	public void canExecuteTest() {
		// mock
		new Expectations() {
			{
				// 指定要mock的方法
				App.getStr(anyString);

				// 指定mock方法要返回的结果
				result = "w";
			}
		};
		
		// 执行方法逻辑
		boolean canExecute = TaskService.canExecute();

		// 验证是否符合预期
		Assert.assertFalse(canExecute);
	}
}