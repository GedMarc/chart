/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

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
package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.BorderCapStyle;
import be.ceau.chart.enums.BorderJoinStyle;
import be.ceau.chart.enums.PointStyle;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RadarDataset {

	/**
	 * @see #setData(List)
	 */
	private List<BigDecimal> data;

	/**
	 * @see #setLabel(String)
	 */
	private String label;

	/**
	 * @see #setFill(Boolean)
	 */
	private Boolean fill;

	/**
	 * @see #setLineTension(Float)
	 */
	private Float lineTension;

	/**
	 * @see #setBackgroundColor(Color)
	 */
	private Color backgroundColor;

	/**
	 * @see #setBorderWidth(Integer)
	 */
	private Integer borderWidth;

	/**
	 * @see #setBorderColor(Color)
	 */
	private Color borderColor;

	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	private BorderCapStyle borderCapStyle;

	/**
	 * @see #setBorderDash(List)
	 */
	private List<Integer> borderDash;

	/**
	 * @see #setBorderDashOffset(Float)
	 */
	private Float borderDashOffset;

	/**
	 * @see #setBorderJoinStyle(BorderJoinStyle)
	 */
	private BorderJoinStyle borderJoinStyle;

	/**
	 * @see #setPointBorderColor(List)
	 */
	private List<Color> pointBorderColor;

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	private List<Color> pointBackgroundColor;

	/**
	 * @see #setPointBorderWidth(List)
	 */
	private List<Integer> pointBorderWidth;

	/**
	 * @see #setPointRadius(List)
	 */
	private List<Integer> pointRadius;

	/**
	 * @see #setPointHoverRadius(List)
	 */
	private List<Integer> pointHoverRadius;

	/**
	 * @see #setHitRadius(List)
	 */
	private List<Integer> hitRadius;

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	private List<Color> pointHoverBackgroundColor;

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	private List<Color> pointHoverBorderColor;

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	private List<Integer> pointHoverBorderWidth;

	/**
	 * @see #setPointStyle(List)
	 */
	private List<PointStyle> pointStyle;

	/**
	 * @see #setData(List)
	 */
	public List<BigDecimal> getData() {
		return this.data;
	}

	/**
	 * The data to plot in a line
	 */
	public void setData(List<BigDecimal> data) {
		this.data = data;
	}

	/**
	 * @see #setLabel(String)
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @see #setFill(Boolean)
	 */
	public Boolean getFill() {
		return this.fill;
	}

	/**
	 * If true, fill the area under the line
	 */
	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	/**
	 * @see #setLineTension(Float)
	 */
	public Float getLineTension() {
		return this.lineTension;
	}

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines.
	 */
	public void setLineTension(Float lineTension) {
		this.lineTension = lineTension;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * The fill color under the line. See Colors
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderWidth(Integer)
	 */
	public Integer getBorderWidth() {
		return this.borderWidth;
	}

	/**
	 * The width of the line in pixels
	 */
	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return this.borderColor;
	}

	/**
	 * The color of the line.
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderCapStyle(BorderCapStyle)
	 */
	public BorderCapStyle getBorderCapStyle() {
		return this.borderCapStyle;
	}

	/**
	 * Default line cap style.
	 * <ul>
	 * <li>{@code butt} The ends of lines are squared off at the endpoints.
	 * <li>{@code round} The ends of lines are rounded.
	 * <li>{@code square} The ends of lines are squared off by adding a box with an
	 * equal width and half the height of the line's thickness.
	 * </ul>
	 */
	public void setBorderCapStyle(BorderCapStyle borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
	}

	/**
	 * @see #setBorderDash(List)
	 */
	public List<Integer> getBorderDash() {
		return this.borderDash;
	}

	/**
	 * Default line dash. A list of numbers that specifies distances to
	 * alternately draw a line and a gap (in coordinate space units). If the
	 * number of elements in the array is odd, the elements of the array get
	 * copied and concatenated. For example, [5, 15, 25] will become [5, 15, 25,
	 * 5, 15, 25].
	 */
	public void setBorderDash(List<Integer> borderDash) {
		this.borderDash = borderDash;
	}

	/**
	 * @see #setBorderDashOffset(Float)
	 */
	public Float getBorderDashOffset() {
		return this.borderDashOffset;
	}

	/**
	 * Default line dash offset. A float specifying the amount of
	 * the offset. Initially 0.0.
	 */
	public void setBorderDashOffset(Float borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
	}

	/**
	 * @see #setBorderJoinStyle(BorderJoinStyle)
	 */
	public BorderJoinStyle getBorderJoinStyle() {
		return this.borderJoinStyle;
	}

	/**
	 * <p>
	 * Default line join style.
	 * </p>
	 * <ul>
	 * <li>{@code round} Rounds off the corners of a shape by filling an additional
	 * sector of disc centered at the common endpoint of connected segments. The
	 * radius for these rounded corners is equal to the line width.
	 * <li>{@code bevel} Fills an additional triangular area between the common endpoint
	 * of connected segments, and the separate outside rectangular corners of
	 * each segment.
	 * <li>{@code miter} Connected segments are joined by extending their outside edges
	 * to connect at a single point, with the effect of filling an additional
	 * lozenge-shaped area. This setting is effected by the miterLimit property.
	 * </ul>
	 */
	public void setBorderJoinStyle(BorderJoinStyle borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
	}

	/**
	 * @see #setPointBorderColor(List)
	 */
	public List<Color> getPointBorderColor() {
		return this.pointBorderColor;
	}

	/**
	 * The border color for points.
	 */
	public void setPointBorderColor(List<Color> pointBorderColor) {
		this.pointBorderColor = pointBorderColor;
	}

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	public List<Color> getPointBackgroundColor() {
		return this.pointBackgroundColor;
	}

	/**
	 * The fill color for points
	 */
	public void setPointBackgroundColor(List<Color> pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	/**
	 * @see #setPointBorderWidth(List)
	 */
	public List<Integer> getPointBorderWidth() {
		return this.pointBorderWidth;
	}

	/**
	 * The width of the point border in pixels
	 */
	public void setPointBorderWidth(List<Integer> pointBorderWidth) {
		this.pointBorderWidth = pointBorderWidth;
	}

	/**
	 * @see #setPointRadius(List)
	 */
	public List<Integer> getPointRadius() {
		return this.pointRadius;
	}

	/**
	 * The radius of the point shape. If set to 0, nothing is rendered.
	 */
	public void setPointRadius(List<Integer> pointRadius) {
		this.pointRadius = pointRadius;
	}

	/**
	 * @see #setPointHoverRadius(List)
	 */
	public List<Integer> getPointHoverRadius() {
		return this.pointHoverRadius;
	}

	/**
	 * The radius of the point when hovered
	 */
	public void setPointHoverRadius(List<Integer> pointHoverRadius) {
		this.pointHoverRadius = pointHoverRadius;
	}

	/**
	 * @see #setHitRadius(List)
	 */
	public List<Integer> getHitRadius() {
		return this.hitRadius;
	}

	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public void setHitRadius(List<Integer> hitRadius) {
		this.hitRadius = hitRadius;
	}

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	public List<Color> getPointHoverBackgroundColor() {
		return this.pointHoverBackgroundColor;
	}

	/**
	 * Point background color when hovered
	 */
	public void setPointHoverBackgroundColor(List<Color> pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	public List<Color> getPointHoverBorderColor() {
		return this.pointHoverBorderColor;
	}

	/**
	 * Point border color when hovered
	 */
	public void setPointHoverBorderColor(List<Color> pointHoverBorderColor) {
		this.pointHoverBorderColor = pointHoverBorderColor;
	}

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	public List<Integer> getPointHoverBorderWidth() {
		return this.pointHoverBorderWidth;
	}

	/**
	 * Border width of point when hovered
	 */
	public void setPointHoverBorderWidth(List<Integer> pointHoverBorderWidth) {
		this.pointHoverBorderWidth = pointHoverBorderWidth;
	}

	/**
	 * @see #setPointStyle(List)
	 */
	public List<PointStyle> getPointStyle() {
		return this.pointStyle;
	}

	/**
	 * The style of point. Options include 'circle', 'triangle', 'rect',
	 * 'rectRot', 'cross', 'crossRot', 'star', 'line', and 'dash'
	 */
	public void setPointStyle(List<PointStyle> pointStyle) {
		this.pointStyle = pointStyle;
	}

}