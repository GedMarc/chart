/*
	Copyright 2020 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.jwebmp.plugins.graphing.chartjs.tests;

import com.jwebmp.plugins.graphing.chartjs.BubbleChart;
import com.jwebmp.plugins.graphing.chartjs.Chart;
import com.jwebmp.plugins.graphing.chartjs.color.Color;
import com.jwebmp.plugins.graphing.chartjs.data.BubbleData;
import com.jwebmp.plugins.graphing.chartjs.datapoint.BubbleDataPoint;
import com.jwebmp.plugins.graphing.chartjs.dataset.BubbleDataset;
import com.jwebmp.plugins.graphing.chartjs.options.BubbleOptions;
import com.jwebmp.plugins.graphing.chartjs.tests.util.Generator;
import com.jwebmp.plugins.graphing.chartjs.tests.util.TestFactory;

public class BubbleTest extends ChartTest {
	
	@Override
	public Chart createChart() {
		BubbleChart chart = new BubbleChart();
		chart.setData(newData());
		chart.setOptions(TestFactory.randomInstance(BubbleOptions.class));
		System.out.println("Chart is" + (chart.isDrawable() ? " " : " NOT ") + "drawable");
		return chart;
	}
	
	private BubbleData newData() {
		BubbleDataset dataset = new BubbleDataset();
		BubbleData data = new BubbleData();
		data.addDataset(dataset);

		dataset.setLabel("BubbleTestDataset");
		
		for (BubbleDataPoint point : TestFactory.generateBubbleDataPoints()) {
			dataset.addData(point);
			dataset.addBackgroundColor(Color.random());
			dataset.addBorderColor(Color.random());
			dataset.addBorderWidth(Generator.nextInt(10));
			dataset.addHoverBackgroundColor(Color.random());
			dataset.addHoverBorderColor(Color.random());
			dataset.addHoverBorderWidth(Generator.nextInt(10));
			dataset.addHoverRadius(Generator.nextInt(10));
		}
		return data;
	}
	
}
