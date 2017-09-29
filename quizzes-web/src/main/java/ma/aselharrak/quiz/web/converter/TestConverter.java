/**
 * 
 */
package ma.aselharrak.quiz.web.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ma.aselharrak.quiz.dao.model.Test;
import ma.aselharrak.quiz.web.data.TestData;

/**
 * @author AELHARRAK
 *
 */
@Component
public class TestConverter implements Converter<Test, TestData> {

	@Override
	public TestData convert(final Test test) {
		final TestData testData = new TestData();
		testData.setId(test.getId());
		testData.setLabel(test.getLabel());
		testData.setDuration(test.getDuration());
		testData.setDescription(test.getDescription());
		testData.setNbQuestion(test.getTestQuestions().size());
		testData.setTestQuestions(test.getTestQuestions());
		//testData.setLevel(test.getLevel());
		return testData;
	}

	public Set<TestData> convert(final Set<Test> tests) {
		Set<TestData> testsData = new HashSet<>();
		for (final Test test : tests) {
			testsData.add(convert(test));
		}
		return testsData;
	}

}
