/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2013 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.export;

import java.util.Map;

import net.sf.jasperreports.engine.JRPrintHyperlink;
import net.sf.jasperreports.engine.JRPropertiesUtil;
import net.sf.jasperreports.engine.export.JRXlsAbstractExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsMetadataExporter;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.type.RunDirectionEnum;
import net.sf.jasperreports.export.annotations.ExporterParameter;
import net.sf.jasperreports.export.annotations.ExporterProperty;


/**
 * Interface containing settings used by the Excel exporters.
 *
 * @see JRXlsExporter
 * @see JRXlsxExporter
 * @see JROdsExporter
 * @see JRXlsMetadataExporter
 * @see net.sf.jasperreports.engine.export.JExcelApiExporter
 * @see net.sf.jasperreports.engine.export.JExcelApiMetadataExporter
 * 
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public interface XlsExporterConfiguration extends ExporterConfiguration
{
	/**
	 * Property whose value is used as default state of the {@link #isOnePagePerSheet()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_ONE_PAGE_PER_SHEET = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.one.page.per.sheet";

	/**
	 * Property whose value is used as default state of the {@link #isRemoveEmptySpaceBetweenRows()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_ROWS = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.remove.empty.space.between.rows";

	/**
	 * Property whose value is used as default state of the {@link #isRemoveEmptySpaceBetweenColumns()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.remove.empty.space.between.columns";

	/**
	 * Property whose value is used as default state of the {@link #isWhitePageBackground()} export configuration flag.
	 * <p/>
	 * This property is set by default (<code>true</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_WHITE_PAGE_BACKGROUND = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.white.page.background";

	/**
	 * This property serves as default for the {@link #isWrapText()} export configuration flag.
	 * <p>
	 * The property itself defaults to <code>true</code>.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_WRAP_TEXT = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "wrap.text";

	/**
	 * This property serves as default for the {@link #isCellLocked()} export configuration flag.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_CELL_LOCKED = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "cell.locked";

	/**
	 * This property serves as default for the {@link #isCellHidden()} export configuration flag.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_CELL_HIDDEN = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "cell.hidden";

	/**
	 * Property whose value is used as default state of the {@link #isDetectCellType()} export flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_DETECT_CELL_TYPE = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.detect.cell.type";

	/**
	 * Property whose value is used as default state of the {@link #isFontSizeFixEnabled()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_FONT_SIZE_FIX_ENABLED = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.font.size.fix.enabled";

	/**
	 * Property whose value is used as default state of the {@link #isImageBorderFixEnabled()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_IMAGE_BORDER_FIX_ENABLED = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.image.border.fix.enabled";

	/**
	 * Property whose value is used as default state of the {@link #isIgnoreGraphics()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_IGNORE_GRAPHICS = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.ignore.graphics";

	/**
	 * Property whose value is used as default state of the {@link #isCreateCustomPalette()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_CREATE_CUSTOM_PALETTE = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.create.custom.palette";

	/**
	 * Property whose value is used as default state of the {@link #isCollapseRowSpan()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_COLLAPSE_ROW_SPAN = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.collapse.row.span";

	/**
	 * Property whose value is used as default state of the {@link #isIgnoreCellBorder()} export configuration flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_IGNORE_CELL_BORDER = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.ignore.cell.border";

	/**
	 * Property whose value is used as default state of the {@link #isIgnoreCellBackground()} export flag.
	 * <p/>
	 * This property is by default not set (<code>false</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_IGNORE_CELL_BACKGROUND = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.ignore.cell.background";

	/**
	 * Property whose value is used as default of the {@link #getMaxRowsPerSheet()} export configuration setting.
	 * <p/>
	 * This property is by default to zero.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_MAXIMUM_ROWS_PER_SHEET = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.max.rows.per.sheet";

	/**
	 * This property provides a default value for the {@link #getSheetHeaderLeft()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_HEADER_LEFT = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.header.left";

	/**
	 * This property provides a default value for the {@link #getSheetHeaderCenter()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_HEADER_CENTER = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.header.center";

	/**
	 * This property provides a default value for the {@link #getSheetHeaderRight()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_HEADER_RIGHT = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.header.right";

	/**
	 * This property provides a default value for the {@link #getSheetFooterLeft()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_FOOTER_LEFT = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.footer.left";

	/**
	 * This property provides a default value for the {@link #getSheetFooterCenter()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_FOOTER_CENTER = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.footer.center";

	/**
	 * This property provides a default value for the {@link #getSheetFooterRight()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_FOOTER_RIGHT = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.footer.right";

	/**
	 * Property whose value is used as default value of the {@link #getPassword()} export configuration setting.
	 * <p/>
	 * This property is by default not set (<code>null</code>).
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_PASSWORD = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.password";

	/**
	 * Property prefix used in order to identify a set of properties holding sheet names, very useful when 
	 * indicating sheet names in the jrxml template is required. These properties' values are collected in an 
	 * ordered list, therefore it is important the order they are written in. If set, these values are considered 
	 * as defaults for the {@link #getSheetNames()} export configuration setting.
	 * <p/>
	 * A property starting with this prefix can hold one or many sheet names. In order to be well parsed, 
	 * sheet names contained in such a property's value should be separated by a slash character ("/")
	 * <p/>
	 * These properties are by default not set.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHEET_NAMES_PREFIX = JRPropertiesUtil.PROPERTY_PREFIX + "export.xls.sheet.names.";

	/**
	 * Property that provides a default value for the {@link #isIgnoreHyperlink()} export configuration flag.
	 */
	public static final String PROPERTY_IGNORE_HYPERLINK = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + JRPrintHyperlink.PROPERTY_IGNORE_HYPERLINK_SUFFIX;

	/**
	 * Flag property that indicates whether local anchors should be ignored when elements are exported to Excel. The default value is <code>false</code>.
	 * <p>
	 * Property scope:
	 * <ul>
	 * <li><code>Global</code></li>
	 * <li><code>Report</code></li>
	 * </ul>
	 */
	public static final String PROPERTY_IGNORE_ANCHORS = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "ignore.anchors";

	/**
	 * This property provides a default for the {@link #getFitWidth()} exporter configuration setting.
	 * <p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_FIT_WIDTH = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "fit.width";

	/**
	 * This property provides a default for the {@link #getFitHeight()} export configuration setting.
	 * </p>
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_FIT_HEIGHT = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "fit.height";

	/**
	 * This property provides a default value for the {@link #getPageScale()} export configuration setting.
	 * <br/>
	 * Property scope:
	 * <ul>
	 * <li><code>Global</code></li>
	 * <li><code>Report</code></li>
	 * <li><code>Element</code> - this setting can be used to set the page scale per sheet</li>
	 * </ul>
	 * Global settings are overriden by report level settings; report level settings are overriden by element (sheet) level settings.
	 */
	public static final String PROPERTY_PAGE_SCALE = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "page.scale";

	/**
	 * This property provides a default for the {@link #getSheetDirection()} exporter configuration setting.
	 */
	public static final String PROPERTY_SHEET_DIRECTION = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "sheet.direction";

	/**
	 * Specifies the index of the first unlocked row in document's sheets. All rows above this will be 'frozen'. 
	 * Allowed values are represented by positive integers in the 1..65536 range. Negative values are not considered. 
	 * The property should be used when all sheets in the document have the same freeze row index.
	 */
	public static final String PROPERTY_FREEZE_ROW = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "freeze.row";
	
	/**
	 * Indicates the name of the first unlocked column in document's sheets. All columns to the left of this one will be 'frozen'. 
	 * Allowed values are letters or letter combinations representing valid column names in Excel, such as A, B, AB, AC, etc.
	 * The property should be used when all document sheets have the same freeze column name.
	 */
	public static final String PROPERTY_FREEZE_COLUMN = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "freeze.column";

	/**
	 * Property used to adjust all column widths in a document or sheet with the same width ratio, in order to get column width 
	 * values suitable for Excel output. Usually column widths are measured by Excel in Normal style default character width 
	 * units, while the JR engine uses pixels as default size units. When exporting the report to the Excel output format, the 
	 * pixel-to-character width translation depends on the normal style default character width provided by the Excel instance, 
	 * so it cannot be always accurately fitted. In this case, one can alter the generated column widths by setting this property 
	 * with a float value representing the adjustment ratio. The property can be set:
	 * <ul>
	 * <li>globally - then all the columns in all documents exported to the Excel output format will be adjusted with the same width ratio</li>
	 * <li>at report level - then all the columns in the document will be adjusted with the same width ratio</li>
	 * <li>at element level - then all the columns in the current sheet will be adjusted with the same width ratio</li>
	 * </ul> 
	 * Global settings are overriden by report level settings and report level settings are overriden by element level settings. If 
	 * present, a {@link #PROPERTY_COLUMN_WIDTH PROPERTY_COLUMN_WIDTH} property will override the 
	 * {@link #PROPERTY_COLUMN_WIDTH_RATIO PROPERTY_COLUMN_WIDTH_RATIO} value for that column only.
	 * 
	 * @see #PROPERTY_COLUMN_WIDTH
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_COLUMN_WIDTH_RATIO = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "column.width.ratio";

	/**
	 * Property that determines whether date values are to be translated to the timezone
	 * that was used to fill the report.
	 * 
	 * <p>
	 * By default, date values are exported to Excel using the default timezone of the system.
	 * Setting this property to <code>true</code> instructs the exporter to use he report fill
	 * timezone to export date values.
	 * 
	 * <p>
	 * The property only has effect when {@link #isDetectCellType()} is set.
	 * 
	 * <p>
	 * The property can be set globally, at report level and at element level.
	 * The default value is <code>false</code>.
	 * 
	 * @since 4.5.0
	 */
	public static final String PROPERTY_USE_TIMEZONE = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "use.timezone";

	/**
	 * Property used to store the location of an existing workbook template. The content of an existing workbook document 
	 * or template can be embedded into exported document if the template location is known. In this case the content of 
	 * the template will be exported first and the content of the exported report will be appended to this one. Macros and 
	 * other settings in the existing template will be also preserved in the generated document. Templates can be loaded from 
	 * Excel template files (*.xlt) as well as from valid Excel documents (*.xls).
	 * <p>
	 * This property is used in Excel exporters based either on Apache POI APIs ({@link JRXlsExporter}) or on JExcelApi library 
	 * ({@link net.sf.jasperreports.engine.export.JExcelApiExporter JExcelApiExporter}). There's no similar property for the {@link JRXlsxExporter}.
	 * 
	 * @see JRPropertiesUtil
	 * @since 4.5.1
	 */
	public static final String PROPERTY_WORKBOOK_TEMPLATE = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "workbook.template";

	/**
	 * Flag property that specifies whether to keep the sheets of the existing template into generated document. Sometimes 
	 * is important to embed in a generated document only macros and/or other global settings from an existing template, but 
	 * without keeping the own sheets of the template document. If set to false, this property prevent the template sheets 
	 * to be exported.
	 * <p>
	 * This property is used in conjunction with {@link JRXlsAbstractExporter#PROPERTY_WORKBOOK_TEMPLATE}.
	 * <p>
	 * Allowed values are:
	 * <ul>
	 * <li><code>true</code></li>
	 * <li><code>false</code> - this is the default value.</li>
	 * </ul>
	 * 
	 * @see JRPropertiesUtil
	 * @since 4.5.1
	 */
	public static final String PROPERTY_WORKBOOK_TEMPLATE_KEEP_SHEETS = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "workbook.template.keep.sheets";

	/**
	 * Property that specifies the first page number in the page setup dialog.
	 * <br/>
	 * Property scope:
	 * <ul>
	 * <li><code>Global</code></li>
	 * <li><code>Report</code></li>
	 * <li><code>Element</code> - this setting can be used to set the first page number per sheet.</li>
	 * </ul>
	 * Global settings are overriden by report level settings; report level settings are overriden by element (sheet) level settings.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_FIRST_PAGE_NUMBER = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "first.page.number";

	/**
	 * Flag property that specifies if the gridlines in a given sheet are shown. If multiple elements in a sheet provide this property, 
	 * the last read value will be considered. Default value is <code>true</code>.
	 * <br/>
	 * Property scope:
	 * <ul>
	 * <li><code>Global</code></li>
	 * <li><code>Report</code></li>
	 * <li><code>Element</code> - this setting can be used to set the property value per sheet.</li>
	 * </ul>
	 * Global settings are overriden by report level settings; report level settings are overriden by element (sheet) level settings.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_SHOW_GRIDLINES = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "show.gridlines";

	/**
	 * Property that specifies the image anchor type. Possible values are:
	 * <ul>
	 * <li><code>MoveSize</code> - images move and size with cells</li>
	 * <li><code>MoveNoSize</code> - images move but don't size with cells</li>
	 * <li><code>NoMoveNoSize</code> - images don't move or size with cells</li>
	 * </ul>
	 * Default value is <code>MoveNoSize</code>.
	 * <br/>
	 * Property scope:
	 * <ul>
	 * <li><code>Global</code></li>
	 * <li><code>Report</code></li>
	 * <li><code>Element</code></li>
	 * </ul>
	 * Global settings are overriden by report level settings; report level settings are overriden by element level settings.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_IMAGE_ANCHOR_TYPE = JRXlsAbstractExporter.XLS_EXPORTER_PROPERTIES_PREFIX + "image.anchor.type";

	/**
	 * Returns a boolean value specifying whether each report page should be written in a different XLS sheet.
	 * @see #PROPERTY_ONE_PAGE_PER_SHEET
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class, 
		parameterName="IS_ONE_PAGE_PER_SHEET"
		)
	@ExporterProperty(
		value=PROPERTY_ONE_PAGE_PER_SHEET, 
		booleanDefault=false
		)
	public Boolean isOnePagePerSheet();

	/**
	 * Returns a boolean value specifying whether the empty spaces that could appear between rows should be removed or not.
	 * @see #PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_ROWS
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS"
		)
	@ExporterProperty(
		value=PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, 
		booleanDefault=false
		)
	public Boolean isRemoveEmptySpaceBetweenRows();

	/**
	 * Returns a boolean value specifying whether the empty spaces that could appear between columns should be removed or not.
	 * @see #PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class, 
		parameterName="IS_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS"
		)
	@ExporterProperty(
		value=PROPERTY_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS, 
		booleanDefault=false
		)
	public Boolean isRemoveEmptySpaceBetweenColumns();

	/**
	 * Returns a boolean value specifying whether the page background should be white or the default XLS background color. This background
	 * may vary depending on the XLS viewer properties or the operating system color scheme.
	 * @see #PROPERTY_WHITE_PAGE_BACKGROUND
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class, 
		parameterName="IS_WHITE_PAGE_BACKGROUND"
		)
	@ExporterProperty(
		value=PROPERTY_WHITE_PAGE_BACKGROUND, 
		booleanDefault=false
		)
	public Boolean isWhitePageBackground();
	
	/**
	 * Flag used to indicate whether the exporter should take into consideration the type of the
	 * original text field expressions and set the cell types and values accordingly.
	 * <p>
	 * Text fields having numerical or date expressions save type and formatting (format pattern, locale and time zone)
	 * information in the {@link net.sf.jasperreports.engine.JasperPrint JasperPrint}/{@link net.sf.jasperreports.engine.JRPrintText JRPrintText}
	 * object created by the report fill process.
	 * </p>
	 * <p>
	 * When this flag is set, the exporter will parse back the <code>String</code> value of numerical/date texts.
	 * Numerical/date cells will be created and the original pattern of the text will be included
	 * as part of the cell style.
	 * </p>
	 * <p>
	 * Note that this mechanism would not work when the text field overflows and splits on two pages/columns.
	 * Also, it is required that the text field expression has a numerical or date type set.
	 * </p>
	 * <p>
	 * This flag is off by default to ensure backwards compatibility.
	 * </p>
	 * @see #PROPERTY_DETECT_CELL_TYPE
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_DETECT_CELL_TYPE"
		)
	@ExporterProperty(
		value=PROPERTY_DETECT_CELL_TYPE,
		booleanDefault=false
		)
	public Boolean isDetectCellType();

	/**
	 * Flag for decreasing font size so that texts fit into the specified cell height.
	 * @see #PROPERTY_FONT_SIZE_FIX_ENABLED
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_FONT_SIZE_FIX_ENABLED"
		)
	@ExporterProperty(
		value=PROPERTY_FONT_SIZE_FIX_ENABLED,
		booleanDefault=false
		)
	public Boolean isFontSizeFixEnabled();
	
	/**
	 * Flag for forcing the minimum image padding to 1 pixel, to avoid situations where the image hides the cell border.
	 * @see #PROPERTY_IMAGE_BORDER_FIX_ENABLED
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_IMAGE_BORDER_FIX_ENABLED"
		)
	@ExporterProperty(
		value=PROPERTY_IMAGE_BORDER_FIX_ENABLED,
		booleanDefault=false
		)

	public Boolean isImageBorderFixEnabled();
	
	/**
	 * Flag for ignoring graphic elements and exporting text elements only.
	 * @see #PROPERTY_IGNORE_GRAPHICS
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_IGNORE_GRAPHICS"
		)
	@ExporterProperty(
		value=PROPERTY_IGNORE_GRAPHICS,
		booleanDefault=false
		)
	public Boolean isIgnoreGraphics();
	
	/**
	 * Returns a boolean value specifying whether the standard color palette should be customized
	 * so that the XLS result uses the original report colors.
	 * <p/>
	 * The default state of this flag is given by the
	 * {@link #PROPERTY_CREATE_CUSTOM_PALETTE net.sf.jasperreports.export.xls.create.custom.palette} property.
	 * <p/>
	 * The colors used in the result XLS are determined in the following manner:
	 * <ol>
	 * 	<li>
	 * If this flag is not set, the nearest color from the standard XLS palette is chosen
	 * for a report color.
	 * 	</li>
	 * 	<li>
	 * If the flag is set, the nearest not yet modified color from the palette is chosen
	 * and modified to exactly match the report color.  If all the colors from the palette
	 * are modified (the palette has a fixed size), the nearest color from the palette is
	 * chosen for further report colors.
	 * 	</li>
	 * </ol> 
	 * 
	 * @see #PROPERTY_CREATE_CUSTOM_PALETTE
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="CREATE_CUSTOM_PALETTE"
		)
	@ExporterProperty(
		value=PROPERTY_CREATE_CUSTOM_PALETTE, 
		booleanDefault=false
		)
	public Boolean isCreateCustomPalette();
	
	/**
	 * Flag for collapsing row span and avoid merging cells across rows.
	 * @see #PROPERTY_COLLAPSE_ROW_SPAN
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_COLLAPSE_ROW_SPAN"
		)
	@ExporterProperty(
		value=PROPERTY_COLLAPSE_ROW_SPAN,
		booleanDefault=false
		)
	public Boolean isCollapseRowSpan();
	
	/**
	 * Flag for ignoring the cell border.
	 * @see #PROPERTY_IGNORE_CELL_BORDER
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_IGNORE_CELL_BORDER"
		)
	@ExporterProperty(
		value=PROPERTY_IGNORE_CELL_BORDER,
		booleanDefault=false
		)
	public Boolean isIgnoreCellBorder();
	
	/**
	 * Flag for ignoring the cell background color.
	 * @see #PROPERTY_IGNORE_CELL_BACKGROUND
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="IS_IGNORE_CELL_BACKGROUND"
		)
	@ExporterProperty(
		value=PROPERTY_IGNORE_CELL_BACKGROUND,
		booleanDefault=false
		)
	public Boolean isIgnoreCellBackground();
	
	/**
	 * This flag indicates whether text wrapping is allowed in a given cell.
	 * @see #PROPERTY_WRAP_TEXT
	 */
	@ExporterProperty(
		value=PROPERTY_WRAP_TEXT,
		booleanDefault=true
		)
	public Boolean isWrapText();
	
	/**
	 * This flag indicates whether the cell is locked.
	 * @see #PROPERTY_CELL_LOCKED
	 */
	@ExporterProperty(
		value=PROPERTY_CELL_LOCKED,
		booleanDefault=true
		)
	public Boolean isCellLocked();
	
	/**
	 * This flag indicates whether the cell content is hidden.
	 * @see #PROPERTY_CELL_HIDDEN
	 */
	@ExporterProperty(
		value=PROPERTY_CELL_HIDDEN,
		booleanDefault=false
		)
	public Boolean isCellHidden();
	
	/**
	 * Returns an integer value specifying the maximum number of rows allowed to be shown in a sheet.
	 * When set, a new sheet is created for the remaining rows to be displayed. Negative values or zero means that no limit has been set.
	 * @see #PROPERTY_MAXIMUM_ROWS_PER_SHEET
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="MAXIMUM_ROWS_PER_SHEET"
		)
	@ExporterProperty(
		value=PROPERTY_MAXIMUM_ROWS_PER_SHEET,
		intDefault=0
		)
	public Integer getMaxRowsPerSheet();
	
	/**
	 * Indicates whether page margins should be ignored when the report is exported using a grid-based exporter
	 * <p>
	 * If set to <code>true</code>, any page in the document will be exported without taking into account its margins.
	 * </p>
	 * @see #PROPERTY_IGNORE_PAGE_MARGINS
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.JRExporterParameter.class,
		parameterName="IGNORE_PAGE_MARGINS"
		)
	@ExporterProperty(
		value=PROPERTY_IGNORE_PAGE_MARGINS, 
		booleanDefault=false
		)
	public Boolean isIgnorePageMargins();
	
	/**
	 * This property stores the text content of the sheet header's left side.
	 * @see #PROPERTY_SHEET_HEADER_LEFT
	 */
	@ExporterProperty(PROPERTY_SHEET_HEADER_LEFT)
	public String getSheetHeaderLeft();
	
	/**
	 * This property stores the text content of the sheet header's center.
	 * @see #PROPERTY_SHEET_HEADER_CENTER
	 */
	@ExporterProperty(PROPERTY_SHEET_HEADER_CENTER)
	public String getSheetHeaderCenter();
	
	/**
	 * This property stores the text content of the sheet header's right side.
	 * @see #PROPERTY_SHEET_HEADER_RIGHT
	 */
	@ExporterProperty(PROPERTY_SHEET_HEADER_RIGHT)
	public String getSheetHeaderRight();
	
	/**
	 * This property stores the text content of the sheet footer's left side.
	 * @see #PROPERTY_SHEET_FOOTER_LEFT
	 */
	@ExporterProperty(PROPERTY_SHEET_FOOTER_LEFT)
	public String getSheetFooterLeft();
	
	/**
	 * This property stores the text content of the sheet footer's center.
	 * @see #PROPERTY_SHEET_FOOTER_CENTER
	 */
	@ExporterProperty(PROPERTY_SHEET_FOOTER_CENTER)
	public String getSheetFooterCenter();
	
	/**
	 * This property stores the text content of the sheet footer's right side.
	 * @see #PROPERTY_SHEET_FOOTER_RIGHT
	 */
	@ExporterProperty(PROPERTY_SHEET_FOOTER_RIGHT)
	public String getSheetFooterRight();

	/**
	 * Returns a String value representing the password in case of password protected documents.
	 * @see #PROPERTY_PASSWORD 
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JExcelApiExporterParameter.class,
		parameterName="PASSWORD"
		)
	@ExporterProperty(PROPERTY_PASSWORD)
	public String getPassword();

	/**
	 * Returns an array of strings representing custom sheet names. 
	 * This is useful when used with the <i>isOnePagePerSheet()</i> setting.
	 * @see #PROPERTY_SHEET_NAMES_PREFIX
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class,
		parameterName="SHEET_NAMES"
		)
	@ExporterProperty(PROPERTY_SHEET_NAMES_PREFIX)
	public String[] getSheetNames();
	
	/**
	 * This export configuration setting should be used when converting java format patterns to equivalent proprietary
	 * format patterns. It should be constructed as a Map containing java format patterns as keys and the
	 * correspondent proprietary format pattern as correspondent value
	 * <p/>
	 * @see org.apache.poi.hssf.usermodel.HSSFDataFormat
	 * @see jxl.write.NumberFormat
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		parameterClass=net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter.class, 
		parameterName="FORMAT_PATTERNS_MAP"
		)
	public Map<String, String> getFormatPatternsMap();
	
	/**
	 * @see #PROPERTY_IGNORE_HYPERLINK
	 */
	@ExporterProperty(
		value=PROPERTY_IGNORE_HYPERLINK, 
		booleanDefault=false
		)
	public Boolean isIgnoreHyperlink();
	
	/**
	 * This setting indicates the number of pages wide to fit the sheet in.
	 * @see #PROPERTY_FIT_WIDTH
	 */
	@ExporterProperty(
		value=PROPERTY_FIT_WIDTH, 
		acceptNull=true
		)
	public Integer getFitWidth();
	
	/**
	 * This setting indicates the number of pages height to fit the sheet in.
	 * @see #PROPERTY_FIT_WIDTH
	 */
	@ExporterProperty(
		value=PROPERTY_FIT_HEIGHT, 
		acceptNull=true
		)
	public Integer getFitHeight();
	
	/**
	 * This setting is used to adjust the page content to a given percent of the normal size in the print preview pane. Allowed values are 
	 * positive integers from 10 to 400, representing percents of the normal size.
	 * This setting overrides the {@link #getFitWidth()} and {@link #getFitHeight()} settings.
	 * @see #PROPERTY_PAGE_SCALE
	 */
	@ExporterProperty(
		value=PROPERTY_PAGE_SCALE, 
		acceptNull=true
		)
	public Integer getPageScale();

	/**
	 * This setting indicates if the sheet is left-to-right or right-to-left oriented. Possible values are:
	 * <ul>
	 * <li>LTR - meaning left-to-right</li>
	 * <li>RTL - meaning right-to-left</li>
	 * </ul>
	 * The default value is LTR.
	 * @see #PROPERTY_SHEET_DIRECTION
	 */
	@ExporterProperty(PROPERTY_SHEET_DIRECTION)
	public RunDirectionEnum getSheetDirection();
}
